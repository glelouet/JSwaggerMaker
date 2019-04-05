package fr.lelouet.jswaggermaker.client.common.interfaces;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * interface for the basic transfer capacities.<br />
 * <ul>
 * <li>send GET|PUT|POST|DELETE requests</li>
 * <li>convert a string into a class</li>
 * <li>flatten object into url parameter</li>
 * </ul>
 */
public interface ITransfer {

	/**
	 * request an URL
	 *
	 * @param <T>
	 *          the type of the item that is to be fetched
	 * @param url
	 *          the URL we want to access.
	 * @param method
	 *          the method (get, etc.)
	 * @param properties
	 *          the properties to send in the header
	 * @param transmit
	 *          the properties to send in the body
	 * @param expectedClass
	 *          the .class of the returned value.
	 * @return a new Requested that will hold the value for the URL once the
	 *         request is complete.
	 */
	public <T> Requested<T> request(String url, String method, Map<String, String> properties,
			Map<String, Object> transmit, Class<T> expectedClass);

	/**
	 * request an URL as a map of String, T
	 *
	 * @param <T>
	 *          the values class of the map
	 * @param url
	 *          the URL to access
	 * @param method
	 *          the method to call the URL (get, etc.)
	 * @param properties
	 *          the properties to send in the header
	 * @param transmit
	 *          the properties to send in the body
	 * @param expectedClass
	 *          the .class of T
	 * @return a new request on the URL that will return a map
	 */
	public <T> Requested<Map<String, T>> requestMap(String url, String method, Map<String, String> properties,
			Map<String, Object> transmit, Class<T> expectedClass);

	/** request a DELETE URL */
	public default Requested<Void> requestDel(String url, Map<String, String> properties) {
		return request(url, "DELETE", properties, null, null);
	}

	/** request a GET URL */
	public default <T> Requested<T> requestGet(String url, Map<String, String> properties, Class<T> expectedClass) {
		return request(url, "GET", properties, null, expectedClass);
	}

	/** request a POST URL */
	public default <T> Requested<T> requestPost(String url, Map<String, String> properties, Map<String, Object> transmit,
			Class<T> expectedClass) {
		return request(url, "POST", properties, transmit, expectedClass);
	}

	/** request a PUT URL */
	public default Requested<Void> requestPut(String url, Map<String, String> properties, Map<String, Object> transmit) {
		return request(url, "PUT", properties, transmit, null);
	}

	/**
	 * load the pages for a given resource access.
	 *
	 * @param resourceAccess
	 *          function to load a page and parameters into a response
	 * @param parameters
	 *          the parameters to give to each page
	 * @return the response for the first page, modified to hold the responses
	 *         from subsequent pages
	 */
	public <T> Requested<List<T>> requestGetPages(BiFunction<Integer, Map<String, String>, Requested<T[]>> resourceAccess,
			Map<String, String> parameters);

}
