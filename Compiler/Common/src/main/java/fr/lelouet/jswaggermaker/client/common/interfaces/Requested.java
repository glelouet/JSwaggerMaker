package fr.lelouet.jswaggermaker.client.common.interfaces;

import java.sql.Date;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/** holds a response from a request */
public interface Requested<T> {

	public int getResponseCode();

	public T getOK();

	public T getOKOr(T ifnotok);

	public String getError();

	public String getURL();

	/**
	 *
	 * @return true if the response code is 2xx
	 */
	public default boolean isSuccess() {
		return getResponseCode() / 100 == 2;
	}

	/**
	 *
	 * @return true if the response code is 3xx
	 */
	public default boolean isRedirect() {
		return getResponseCode() / 100 == 3;
	}

	/**
	 *
	 * @return true if the response code is 4xx
	 */
	public default boolean isClientError() {
		return getResponseCode() / 100 == 4;
	}

	/**
	 *
	 * @return true if the response code is 5xx
	 */
	public default boolean isServerError() {
		return getResponseCode() / 100 == 5;
	}

	/** return the headers that were returned by the server */
	public Map<String, List<String>> getHeaders();

	/**
	 * formatter for data provided. all calls must be synchronized !
	 */
	public static final DateTimeFormatter formatter = DateTimeFormatter.RFC_1123_DATE_TIME;

	public static long date2seconds(String date) {
		synchronized (formatter) {
			return ZonedDateTime.parse(date, formatter).toEpochSecond();
		}
	}

	public static String ms2date(long milliseconds) {
		synchronized (formatter) {
			return formatter.toFormat().format(new Date(milliseconds));
		}
	}

	public static final String EXPIRES_HEADER = "Expires";

	/**
	 * extract the first value of the header for Expires
	 *
	 * @return the first value if present, or null.
	 */
	public default String getExpires() {
		List<String> expirel = getHeaders().get("Expires");
		if (expirel == null || expirel.size() < 1) {
			return null;
		}
		return expirel.get(0);
	}

	/**
	 * extract the value of the header for Expires, as standard seconds
	 *
	 * @return the expires header in seconds, or 0
	 */
	public default long getExpiresSeconds() {
		String expires = getExpires();
		if (expires == null) {
			return 0;
		}
		return date2seconds(expires);
	}

	public static final String DATE_HEADER = "Date";

	/**
	 * extract the first value of the header for Date
	 *
	 * @return the first value if present, or null.
	 */
	public default String getDate() {
		List<String> datel = getHeaders().get(DATE_HEADER);
		if (datel == null || datel.size() < 1) {
			return null;
		}
		return datel.get(0);
	}

	/**
	 * extract the value of the date header, as standard seconds
	 *
	 * @return the date header in seconds, or 0.
	 */
	public default long getDateSeconds() {
		String date = getDate();
		if (date == null) {
			return 0;
		}
		return date2seconds(date);
	}

	/**
	 * get the number of errors remaining until prevented access. If this is 0 or
	 * lower we must wait {@link #getErrorsReset()} seconds
	 */
	public default int getRemainingErrors() {
		List<String> errorsl = getHeaders().get("X-ESI-Error-Limit-Remain");
		if (errorsl == null) {
			return 0;
		} else {
			return Integer.parseInt(errorsl.get(0));
		}
	}

	/**
	 * get the number of seconds until the error window resets.
	 */
	public default int getErrorsReset() {
		List<String> resetl = getHeaders().get("X-ESI-Error-Limit-Reset");
		if (resetl == null) {
			return 0;
		} else {
			return Integer.parseInt(resetl.get(0));
		}
	}

	/**
	 * get the number of pages, or 1.
	 *
	 * @return the number of pages specified by the header
	 */
	public default int getNbPages() {
		String pages = getHeaders().containsKey("x-pages") ? getHeaders().get("x-pages").get(0)
				: getHeaders().containsKey("X-Pages") ? getHeaders().get("X-Pages").get(0) : null;
				return pages == null ? 1 : Integer.parseInt(pages);
	}

	public static final String ETAG = "Etag";

	/** get the etag of the header, or null */
	public default String getETag() {
		if (getHeaders().containsKey(ETAG)) {
			return getHeaders().get(ETAG).get(0);
		}
		return null;
	}

	public static final String CACHECONTROL = "Cache-Control";

	/**
	 * get the cache-control headers, or an empty list
	 */
	public default List<String> getCacheControl() {
		return getHeaders().getOrDefault(CACHECONTROL, Collections.emptyList());
	}

}
