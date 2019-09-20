package fr.lelouet.jswaggermaker.client.common.impl.securities;

import java.util.Map;

import fr.lelouet.jswaggermaker.client.common.impl.ATransfer;
import io.swagger.models.auth.In;

/**
 * Transfer using auth with name=key couple
 *
 */
public class APIKey extends ATransfer {

	public final In in;

	public final String name;

	public final String key;

	public APIKey(String key, String name, In in) {
		this.key = key;
		this.name = name;
		this.in = in;
	}

	@Override
	protected String addConnection(String url, Map<String, String> header, Map<String, Object> transmit) {
		switch (in) {
		case HEADER:
			header.put(name, key);
			break;
		case QUERY:
			url=url+"&"+name+"="+key;
			break;
		default:
			throw new UnsupportedOperationException("case not handled " + in);
		}
		return url;
	}

}
