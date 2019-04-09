package fr.lelouet.jswaggermaker.client.common.interfaces.cache;

import java.util.Map;

import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

/**
 * A cache is told when a resource for a given METHOD:URL is fetched, memorizes
 * it, so it can serve this resource again next time this resource is requested.
 *
 */
public interface ICache {

	/**
	 * request the cache for the resource associated with an URL and method. The
	 * cache can modify the headers of this request, typically to add Etag value.
	 *
	 * @param <T>
	 * @param url
	 * @param method
	 * @param expectedClass
	 * @return null if resource needs to be fetched again.
	 */
	<T> Requested<T> request(String url, String method, Map<String, String> header, Class<T> expectedClass);

	/**
	 * notify the cache a resource has been fetched for an URL. Typically if the
	 * requested is a new value, it will be store, while if the requested is a
	 * meta value(eg 304 not modified) the cache should update the storage and
	 * return the previously stored value.
	 *
	 * @param <T>
	 * @param url
	 * @param method
	 * @param ret
	 * @return a possibly other requested that holds the data for the resource.
	 */
	<T> Requested<T> retrieved(String url, String method, Requested<T> ret);

}
