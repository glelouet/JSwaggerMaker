package fr.lelouet.jswaggermaker.client.common.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class RequestedImpl<T> implements Requested<T> {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(RequestedImpl.class);

	public RequestedImpl(String url, int responseCode, String message, T item, Map<String, List<String>> headers) {
		this.url = url;
		this.responseCode = responseCode;
		this.error = message;
		this.ok = item;
		this.headers = headers;
	}

	public int responseCode;

	@Override
	public int getResponseCode() {
		return responseCode;
	}

	public T ok;

	@Override
	public T getOK() {
		if (!isSuccess()) {
			throw new NullPointerException("received " + responseCode + " : " + error);
		}
		return ok;
	}

	@Override
	public T getOKOr(T ifnotok) {
		if (isSuccess()) {
			return ok;
		} else {
			return ifnotok;
		}
	}

	public String error;

	@Override
	public String getError() {
		return error;
	}

	public Map<String, List<String>> headers;

	@Override
	public Map<String, List<String>> getHeaders() {
		return headers;
	}

	public String url;

	@Override
	public String getURL() {
		return url;
	}

}
