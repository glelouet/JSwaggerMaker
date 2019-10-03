package fr.lelouet.jswaggermaker.client.common.impl;

import java.util.Map;

import fr.lelouet.jswaggermaker.client.common.interfaces.ITransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class DelegateTransfer<Tr extends ITransfer> implements ITransfer {

	public final Tr delegate;

	public DelegateTransfer(Tr delegate) {
		this.delegate = delegate;
	}

	@Override
	public <T> Requested<T> request(String url, String method, Map<String, String> header, Map<String, Object> transmit,
			Class<T> expectedClass) {
		return delegate.request(url, method, header, transmit, expectedClass);
	}

	@Override
	public <T> Requested<Map<String, T>> requestMap(String url, String method, Map<String, String> properties,
			Map<String, Object> transmit, Class<T> expectedClass) {
		return delegate.requestMap(url, method, properties, transmit, expectedClass);
	}

	@Override
	public String flatten(Object o) {
		return delegate.flatten(o);
	}

}
