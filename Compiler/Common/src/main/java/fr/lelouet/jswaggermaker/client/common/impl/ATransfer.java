package fr.lelouet.jswaggermaker.client.common.impl;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import javax.net.ssl.HttpsURLConnection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import fr.lelouet.jswaggermaker.client.common.interfaces.ITransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import fr.lelouet.jswaggermaker.client.common.interfaces.cache.Pausable;
import javafx.beans.InvalidationListener;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableBooleanValue;
import javafx.collections.ObservableSet;

public abstract class ATransfer implements ITransfer {

	private static final Logger logger = LoggerFactory.getLogger(ATransfer.class);

	public static final String IFNONEMATCH = "If-None-Match";
	public static final String ETAG = "Etag";

	@Override
	public <T> Requested<T> request(String url, String method, Map<String, String> properties,
			Map<String, Object> transmit, Class<T> expectedClass) {
		try {
			HttpsURLConnection con = makeConnection(url, method, properties, transmit);
			Map<String, List<String>> headers = con.getHeaderFields();
			int responseCode = con.getResponseCode();
			switch (responseCode) {
			// 2xx ok
			case HttpsURLConnection.HTTP_OK:
			case HttpsURLConnection.HTTP_CREATED:
			case HttpsURLConnection.HTTP_ACCEPTED:
			case HttpsURLConnection.HTTP_NOT_AUTHORITATIVE:
			case HttpsURLConnection.HTTP_NO_CONTENT:
			case HttpsURLConnection.HTTP_RESET:
			case HttpsURLConnection.HTTP_PARTIAL:
				String ret = new BufferedReader(new InputStreamReader(con.getInputStream())).readLine();
				return new RequestedImpl<>(url, responseCode, null, convert(ret, expectedClass), headers);
				// 304 not modified
			case HttpsURLConnection.HTTP_NOT_MODIFIED:
				return new RequestedImpl<>(url, responseCode, null, null, headers);
				// 4xx client error
			case HttpsURLConnection.HTTP_BAD_REQUEST:
			case HttpsURLConnection.HTTP_UNAUTHORIZED:
			case HttpsURLConnection.HTTP_PAYMENT_REQUIRED:
			case HttpsURLConnection.HTTP_FORBIDDEN:
			case HttpsURLConnection.HTTP_NOT_FOUND:
			case HttpsURLConnection.HTTP_BAD_METHOD:
				// 5xx server error
			case HttpsURLConnection.HTTP_INTERNAL_ERROR:
			case HttpsURLConnection.HTTP_BAD_GATEWAY:
			case HttpsURLConnection.HTTP_UNAVAILABLE:
			case HttpsURLConnection.HTTP_GATEWAY_TIMEOUT:
			default:
				StringBuilder sb = new StringBuilder("[" + method + ":" + responseCode + "]" + url + " data=" + transmit + " ");
				if (con.getErrorStream() != null) {
					new BufferedReader(new InputStreamReader(con.getErrorStream())).lines().forEach(sb::append);
				}
				return new RequestedImpl<>(url, responseCode, sb.toString(), null, headers);
			}
		} catch (Exception e) {
			return new RequestedImpl<>(url, HttpsURLConnection.HTTP_UNAVAILABLE, e.getMessage(), null, new HashMap<>());
		}
	}

	protected HttpsURLConnection makeConnection(String url, String method, Map<String, String> properties,
			Map<String, Object> transmit) throws IOException {
		if (properties == null) {
			properties = new HashMap<>();
		}
		addConnection(properties);
		URL target = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) target.openConnection();
		con.setRequestMethod(method);
		con.setConnectTimeout(2000);
		for (Entry<String, String> e : properties.entrySet()) {
			con.setRequestProperty(e.getKey(), e.getValue());
		}
		if (transmit != null && !transmit.isEmpty()) {
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.write(mapToJSON(transmit).getBytes(StandardCharsets.UTF_8));
			wr.flush();
			wr.close();
		}
		return con;
	}

	@Override
	public <T> Requested<Map<String, T>> requestMap(String url, String method, Map<String, String> properties,
			Map<String, Object> transmit, Class<T> expectedClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Requested<List<T>> requestGetPages(BiFunction<Integer, Map<String, String>, Requested<T[]>> resourceAccess,
			Map<String, String> parameters) {
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

	////
	// conversions
	////

	protected final ObjectMapper mapper = new ObjectMapper();

	/**
	 * convert a JSON line to an object.
	 *
	 * @param <T>
	 *          the class of the object to convert
	 * @param line
	 *          the line we want to convert
	 * @param clazz
	 *          the class of type T we want to use.
	 * @return a new object representing the line in the given class.
	 */
	@SuppressWarnings("unchecked")
	protected <T> T convert(String line, Class<? extends T> clazz) {
		if (clazz == null) {
			return null;
		}
		try {
			if (line == null || line.length() == 0) {
				if (clazz.isArray()) {
					return (T) Array.newInstance(clazz.getComponentType(), 0);
				} else {
					return null;
				}
			}
			return mapper.readerFor(clazz).readValue(line);
		} catch (Exception e) {
			throw new UnsupportedOperationException("while converting line " + line + "to class" + clazz.getName(), e);
		}
	}

	/**
	 * convert a JSON line to a map of String, T
	 *
	 * @param <T>
	 *          the class of the values in the map
	 * @param line
	 *          the line to convert
	 * @param clazz
	 *          .class fof the values clas
	 * @return a new map.
	 */
	protected<T> Map<String, T>convertMap(String line, Class<? extends T> clazz){
		if (clazz == null) {
			return null;
		}
		try {
			if (line == null || line.length() == 0) {
				return new HashMap<>();
			}
			TypeReference<HashMap<String, T>> typeRef = new TypeReference<>() {
			};
			return mapper.readValue(line, typeRef);
		} catch (Exception e) {
			throw new UnsupportedOperationException("while converting line " + line + "to class" + clazz.getName(), e);
		}
	}

	protected <T> RequestedImpl<List<T>> convertToList(Requested<T[]> apply) {
		RequestedImpl<List<T>> ret = new RequestedImpl<>(apply.getURL(), apply.getResponseCode(), apply.getError(),
				new ArrayList<>(), apply.getHeaders());
		if (apply.isOk() && apply.getOK() != null) {
			ret.getOK().addAll(Arrays.asList(apply.getOK()));
		}
		return ret;
	}

	@Override
	public String flatten(Object o) {
		if (o == null) {
			return null;
		}
		if (o.getClass().isArray()) {
			Class<?> ct = o.getClass().getComponentType();
			if (ct.isPrimitive()) {
				if (ct == boolean.class) {
					boolean[] b = (boolean[]) o;
					return IntStream.range(0, b.length - 1).mapToObj(i -> Boolean.toString(b[i]))
							.collect(Collectors.joining(","));
				} else if (ct == char.class) {
					char[] c = (char[]) o;
					return IntStream.range(0, c.length - 1).mapToObj(i -> Character.toString(c[i]))
							.collect(Collectors.joining(","));
				} else if (ct == int.class || ct == short.class || ct == byte.class) {
					return IntStream.of((int[]) o).mapToObj(Integer::toString).collect(Collectors.joining(","));
				} else if (ct == long.class) {
					return LongStream.of((long[]) o).mapToObj(Long::toString).collect(Collectors.joining(","));
				} else if (ct == double.class || ct == float.class) {
					return DoubleStream.of((double[]) o).mapToObj(Double::toString).collect(Collectors.joining(","));
				}
			}
			return Stream.of((Object[]) o).map(Object::toString).collect(Collectors.joining(","));
		} else {
			return o.toString();
		}
	}

	protected final ObjectWriter ow = new ObjectMapper().writer();

	/**
	 * translate a map to json attributes.
	 * <p>
	 * There is a specific hack in case the map only contains one value : we then
	 * transmit directly this value.<br />
	 * eg if the data to transmit is {a:b} we only transmit {b}. if the data is
	 * {a:{k1:v1,k2:v2}} we transmit {k1:v1,k2:v2}
	 * </p>
	 *
	 * @param transmit
	 * @return
	 */
	protected String mapToJSON(Map<String, Object> transmit) {
		try {
			synchronized (ow) {
				if (transmit != null && transmit.size() == 1) {
					return ow.writeValueAsString(transmit.values().iterator().next());
				} else {
					return ow.writeValueAsString(transmit);
				}
			}
		} catch (JsonProcessingException e) {
			throw new UnsupportedOperationException("catch this", e);
		}
	}

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

	/** add connection information for the server */
	protected void addConnection(Map<String, String> props) {
	}

}
