package fr.lelouet.jswaggermaker.client.common.impl.cache;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.lelouet.jswaggermaker.client.common.impl.RequestedImpl;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import fr.lelouet.jswaggermaker.client.common.interfaces.cache.Pausable;
import javafx.beans.InvalidationListener;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableBooleanValue;
import javafx.collections.ObservableSet;

public abstract class ACacheFetcher {

	private static final Logger logger = LoggerFactory.getLogger(ACacheFetcher.class);

	public static final String IFNONEMATCH = "If-None-Match";
	public static final String ETAG = "Etag";

	////
	// scheduling
	////

	// why set to 200 ? it seems lower value make deadlock
	// we set daemon otherwise the thread will prevent jvm from dying.
	public final ScheduledExecutorService exec = Executors.newScheduledThreadPool(1000, r -> {
		Thread t = Executors.defaultThreadFactory().newThread(r);
		t.setDaemon(true);
		return t;
	});

	/**
	 * class that uses the executor to schedule itself.
	 * <p>
	 * That class must be started. Once started, it will schedule itself after its
	 * execution
	 * </p>
	 * <p>
	 * It can also be paused. Pausing it prevents execution until resume is
	 * called. Paused and started are two different states,
	 * </p>
	 * <p>
	 * this abstract class role is to fetch data on a repeated pattern. The
	 * handler can receive null data in several occasions :
	 * <ul>
	 * <li>the data is not accessible (404)</li>
	 * <li>there are too many errors in the network(repeated 50x)</li>
	 * <li>the scheduler is bound to role it does not have
	 * <li>
	 * </ul>
	 * </p>
	 *
	 */
	public abstract class SelfExecutableFetcher<T> implements Runnable, Pausable {

		protected final Consumer<T> cacheHandler;

		public SelfExecutableFetcher(Consumer<T> cacheHandler) {
			this.cacheHandler = cacheHandler;
		}

		/**
		 * is true when it is set to execute later on the executor
		 */
		boolean scheduled = false;

		/**
		 * is true when ordered to stop ASAP ; or not started yet
		 */
		boolean stop = true;

		/** set to true to temporary prevent scheduling of this */
		boolean paused = false;

		public void stop() {
			if (stop) {
				return;
			}
			stop = true;
			logState();
		}

		public void start() {
			if (!stop) {
				return;
			}
			stop = false;
			if (!paused) {
				schedule(0);
			}
			logState();
		}

		@Override
		public void pause() {
			if (paused) {
				return;
			}
			paused = true;
			logState();
			cacheHandler.accept(null);
		}

		@Override
		public void resume() {
			if (!paused) {
				return;
			}
			paused = false;
			schedule(0);
		}

		public void schedule(long delay_ms) {
			synchronized (exec) {
				if (!scheduled && !stop && !paused) {
					exec.schedule(this, delay_ms, TimeUnit.MILLISECONDS);
					scheduled = true;
					logState();
				}
			}
		}

		public String loggingName = "";

		public SelfExecutableFetcher<T> withName(String name) {
			loggingName = name;
			return this;
		}

		protected void logState() {
			logger.debug("state of executable " + loggingName + " : " + (stop ? "stopped" : "started") + "|"
					+ (paused ? "paused" : "running") + "|" + (scheduled ? "scheduled" : "unscheduled")
					// , new Exception()
					);
		}

		private int count_shortdelay = 0;

		private String lastEtag = null;
		private long default_wait_ms = 500;

		@Override
		public void run() {
			synchronized (exec) {
				scheduled = false;
			}
			if (stop) {
				return;
			}
			logState();
			long delay_ms = default_wait_ms;
			try {
				Map<String, String> headerHandler = new HashMap<>();
				if (lastEtag != null) {
					headerHandler.put(IFNONEMATCH, lastEtag);
				}
				Requested<T> res = fetch(headerHandler);
				if (res != null) {
					if (res.getResponseCode() == 420) {
						if (res.getRemainingErrors() < 40) {
							delay_ms = res.getErrorsReset() * default_wait_ms;
						}
					} else {
						String etag = res.getETag();
						if (etag != null) {
							if (!etag.equals(lastEtag)) {
								if (res.isOk()) {
									cacheHandler.accept(res.getOK());
								} else if (res.isClientError() && res.getResponseCode() != 420) {
									logger.debug("setting null in cache for request response type " + res.getError());
									cacheHandler.accept(null);
								}
							}
							lastEtag = etag;
						} else if (res.isOk()) {
							lastEtag = res.getETag();
							cacheHandler.accept(res.getOK());
						} else if (res.isRedirect() && res.getResponseCode() == 304) {
							lastEtag = res.getETag();
						} else if (res.isClientError() && res.getResponseCode() != 420) {
							logger.debug(res.getError());
							cacheHandler.accept(null);
						} else {
							logger.debug("" + res.getResponseCode() + " : " + res.getError());
						}
						delay_ms = res.getCacheExpire();
					}
				}
			} catch (Throwable e) {
				logger.warn("while fetching " + loggingName, e);
			} finally {
				if (delay_ms < default_wait_ms) {
					count_shortdelay++;
					delay_ms = count_shortdelay * default_wait_ms;
					logger.trace(loggingName + " sleep for (corrected)"
							+ (delay_ms < default_wait_ms ? delay_ms + "ms" : "" + delay_ms / 1000 + "s"));
				} else {
					logger.trace(loggingName + " sleep for "
							+ (delay_ms < default_wait_ms ? delay_ms + "ms" : "" + delay_ms / 1000 + "s"));
					count_shortdelay = 0;
				}
				schedule(delay_ms);
			}
		}

		protected abstract Requested<T> fetch(Map<String, String> parameters);

		/**
		 * bind this retrieval state to the roles that are required by this
		 * character
		 *
		 * @param requiredRoles
		 *          the roles, if not null or empty at least one of them must be
		 *          acquired by the character to allow retrieval of data.
		 */
		protected void bindToRoles(String[] requiredRoles) {
			if (requiredRoles == null || requiredRoles.length == 0) {
				resume();
			} else {
				ObservableBooleanValue hasRolesVar = bindContains(getRoles(), requiredRoles);
				hasRolesVar.addListener((ob, old, now) -> {
					if (now) {
						resume();
					} else {
						pause();
					}
				});

				if (hasRolesVar.get()) {
					resume();
				} else {
					pause();
				}
			}
		}
	}

	public abstract ObservableSet<String> getRoles();

	@SuppressWarnings("unchecked")
	public static <T> ObservableBooleanValue bindContains(ObservableSet<T> set, T... values) {
		SimpleBooleanProperty ret = new SimpleBooleanProperty(true);
		set.addListener(
				(InvalidationListener) ob -> ret.set(Stream.of(values).filter(set::contains).findAny().isPresent()));
		ret.set(Stream.of(values).filter(set::contains).findAny().isPresent());
		return ret;
	}

	/**
	 * task to fetch an array.
	 *
	 * @param <T>
	 *          the inner type of the array.
	 */
	public class ArrayCacheUpdaterTask<T> extends SelfExecutableFetcher<List<T>> {

		private final BiFunction<Integer, Map<String, String>, Requested<T[]>> fetcher;

		public ArrayCacheUpdaterTask(BiFunction<Integer, Map<String, String>, Requested<T[]>> fetcher,
				Consumer<List<T>> cacheHandler) {
			super(cacheHandler);
			this.fetcher = fetcher;
			if (cacheHandler == null || fetcher == null) {
				throw new NullPointerException();
			}
		}

		@Override
		protected Requested<List<T>> fetch(Map<String, String> parameters) {
			return requestGetPages(fetcher, parameters);
		}

		protected Requested<List<T>> requestGetPages(
				BiFunction<Integer, Map<String, String>, Requested<T[]>> resourceAccess, Map<String, String> parameters) {
			RequestedImpl<List<T>> res = convertToList(resourceAccess.apply(1, parameters));
			if (res == null) {
				return null;
			}
			int nbPages = res.getNbPages();
			if (res.isOk() && nbPages > 1) {
				res.getOK().addAll(IntStream.rangeClosed(2, nbPages).parallel()
						.mapToObj(page -> resourceAccess.apply(page, parameters)).peek(req -> {
							if (!req.isOk()) {
								res.responseCode = req.getResponseCode();
								res.error = req.getError();
							}
						}).filter(Requested::isOk).map(req -> req.getOK()).flatMap(arr -> Stream.of(arr))
						.collect(Collectors.toList()));
			}
			return res;
		}

		protected RequestedImpl<List<T>> convertToList(Requested<T[]> apply) {
			RequestedImpl<List<T>> ret = new RequestedImpl<>(apply.getURL(), apply.getResponseCode(), apply.getError(),
					new ArrayList<>(), apply.getHeaders());
			if (apply.isOk() && apply.getOK() != null) {
				ret.getOK().addAll(Arrays.asList(apply.getOK()));
			}
			return ret;
		}
	}

	/**
	 * repeatedly fetch a cache and put the value in the handler. The cache expire
	 * is retrieved when fetching data, and used to schedule next retrieve.
	 *
	 *
	 * @param fetcher
	 *          the function that actually fetch a page, as an array of T. This
	 *          function uses a handler as second parameter to store the headers
	 *          of the resource.
	 * @param cacheHandler
	 *          the data that consumes the new cache obtained from the fetcher.
	 *          This should handle a null value in case the data can not be
	 *          updated anymore (eg because the task is paused, the required roles
	 *          are no more present, the server is down)
	 * @return a runnable stopper function. Once this function is called, the
	 *         cache will not be fetched anymore, unless of course it was already
	 *         in the fetch function.
	 * @param <T>
	 *          the type of object the fetched array contains.
	 */
	public <T> SelfExecutableFetcher<List<T>> addFetchCacheArray(String name,
			BiFunction<Integer, Map<String, String>, Requested<T[]>> fetcher, Consumer<List<T>> cacheHandler,
			String... requiredRoles) {
		SelfExecutableFetcher<List<T>> t = new ArrayCacheUpdaterTask<>(fetcher, cacheHandler).withName(name);
		if (requiredRoles != null && requiredRoles.length > 0) {
			t.bindToRoles(requiredRoles);
		}
		t.start();
		return t;
	}

	public static final String[] NOROLE = {};

	/**
	 * class to fetch an object.
	 *
	 * @param <T>
	 *          the type of the object to fetch
	 */
	public class ObjectCacheUpdaterTask<T> extends SelfExecutableFetcher<T> {

		private final Function<Map<String, String>, Requested<T>> fetcher;

		public ObjectCacheUpdaterTask(Function<Map<String, String>, Requested<T>> fetcher, Consumer<T> cacheHandler) {
			super(cacheHandler);
			this.fetcher = fetcher;
			if (cacheHandler == null || fetcher == null) {
				throw new NullPointerException();
			}
		}

		@Override
		protected Requested<T> fetch(Map<String, String> parameters) {
			return fetcher.apply(parameters);
		}
	}

	/**
	 * repeatedly fetch a cache and put the value in the handler. The cache expire
	 * is retrieved when fetching data, and used to schedule next retrieve.
	 *
	 *
	 * @param fetcher
	 *          the function that actually fetch the T. This function uses a
	 *          handler to store the headers of the resource.
	 * @param cacheHandler
	 *          the data that consumes the new cache obtained from the fetcher.
	 *          This should handle a null value in case the data can not be
	 *          updated anymore (eg because the task is paused, the required roles
	 *          are no more present, the server is down)
	 * @return a runnable stopper function. Once this function is called, the
	 *         cache will not be fetched anymore, unless of course it was already
	 *         in the fetch function.
	 * @param <T>
	 *          the type of object that represents the cache.
	 */
	public <T> SelfExecutableFetcher<T> addFetchCacheObject(String name,
			Function<Map<String, String>, Requested<T>> fetcher, Consumer<T> cacheHandler, String... requiredRoles) {
		SelfExecutableFetcher<T> t = new ObjectCacheUpdaterTask<>(fetcher, cacheHandler).withName(name);
		if (requiredRoles != null && requiredRoles.length > 0) {
			t.bindToRoles(requiredRoles);
		}
		t.start();
		return t;
	}

}
