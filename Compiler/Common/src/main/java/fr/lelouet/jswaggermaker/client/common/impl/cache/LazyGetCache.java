package fr.lelouet.jswaggermaker.client.common.impl.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import fr.lelouet.jswaggermaker.client.common.interfaces.cache.ICache;

/**
 * A cache that stores only GET method requests.
 *
 */
public class LazyGetCache implements ICache {

	public HashMap<String, Requested<?>> cached = new HashMap<>();

	public static final String IFNONEMATCH_HEADER = "If-None-Match";

	@SuppressWarnings("unchecked")
	@Override
	public <T> Requested<T> request(String url, String method, Map<String, String> header, Class<T> expectedClass) {
		if (!method.toLowerCase().equals("get")) {
			return null;
		}
		Requested<?> ret = cached.get(url);
		if (ret != null) {
			synchronized (cached) {
				ret = cached.get(url);
				if (ret != null) {
					if( needValidation(ret)) {
						header.put(IFNONEMATCH_HEADER, ret.getETag());
					}
				}
			}
		}
		return (Requested<T>) ret;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> Requested<T> retrieved(String url, String method, Requested<T> ret) {
		if (ret.isSuccess()) {
			// update the date in the retrieve request
			List<String> datel = ret.getHeaders().get("Date");
			if (datel == null) {
				datel = new ArrayList<>();
				ret.getHeaders().put("Date", datel);
			}
			datel.set(0, Requested.ms2date(System.currentTimeMillis()));
			synchronized (cached) {
				cached.put(url, ret);
			}
		} else if (ret.isRedirect()) {
			if (ret.getResponseCode() == 304) {
				synchronized (cached) {
					Requested<T> previous = (Requested<T>) cached.get(url);
					previous.getHeaders().putAll(ret.getHeaders());
					return previous;
				}
			}
		}
		return ret;
	}

	public static final String IMMUTABLE_DIRECTIVE = "immutable";
	public static final String MUSTREVALIDATE_DIRECTIVE = "must-revalidate";
	public static final String MAXAGE_DIRECTIVE = "max-age=";

	boolean needValidation(Requested<?> data) {
		boolean isStale = true;
		boolean immutable = false;
		boolean mustrevalidate = false;
		long maxExpirys = 0;
		String dataExpire = data.getExpires();
		String date = data.getDate();
		if(dataExpire!=null) {
			maxExpirys = Requested.date2seconds(dataExpire);
		}

		for (String directive : data.getCacheControl()) {
			if (directive.equals(IMMUTABLE_DIRECTIVE)) {
				immutable=true;
			} else if (directive.equals(MUSTREVALIDATE_DIRECTIVE)) {
				mustrevalidate = true;
			} else if (directive.startsWith(MAXAGE_DIRECTIVE) && date != null) {
				maxExpirys = Long.parseLong(directive.substring(MAXAGE_DIRECTIVE.length())) + Requested.date2seconds(date);
			}
		}

		isStale = getTimeMs() < maxExpirys * 1000;
		if (!immutable) {
			return isStale;
		} else {
			return true;
		}
	}

	/**
	 * can be overloaded for debugging purposes
	 *
	 * @return the current time
	 */
	public long getTimeMs() {
		return System.currentTimeMillis();
	}

}
