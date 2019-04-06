package fr.lelouet.jswaggermaker.client.common.impl;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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

public abstract class ATransfer implements ITransfer {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(ATransfer.class);

	@Override
	public <T> Requested<T> request(String url, String method, Map<String, String> properties,
			Map<String, Object> transmit, Class<T> expectedClass) {
		try {
			HttpsURLConnection con = makeConnection(url, method, properties, transmit);
			return convertConnnectionResult(con, s -> convert(s, expectedClass));
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

	protected <T> RequestedImpl<T> convertConnnectionResult(HttpsURLConnection con, Function<String, T> converter)
			throws IOException {
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
			return new RequestedImpl<>(con.getURL().toString(), responseCode, null, converter.apply(ret), headers);
		// 304 not modified
		case HttpsURLConnection.HTTP_NOT_MODIFIED:
			return new RequestedImpl<>(con.getURL().toString(), responseCode, null, null, headers);
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
			StringBuilder sb = new StringBuilder(
					"[" + con.getRequestMethod() + ":" + responseCode + "]" + con.getURL().toString() + " ");
			if (con.getErrorStream() != null) {
				new BufferedReader(new InputStreamReader(con.getErrorStream())).lines().forEach(sb::append);
			}
			return new RequestedImpl<>(con.getURL().toString(), responseCode, sb.toString(), null, headers);
		}
	}

	@Override
	public <T> Requested<Map<String, T>> requestMap(String url, String method, Map<String, String> properties,
			Map<String, Object> transmit, Class<T> expectedClass) {
		try {
			HttpsURLConnection con = makeConnection(url, method, properties, transmit);
			return convertConnnectionResult(con, s -> convertMap(s, expectedClass));
		} catch (Exception e) {
			return new RequestedImpl<>(url, HttpsURLConnection.HTTP_UNAVAILABLE, e.getMessage(), null, new HashMap<>());
		}
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
	protected <T> Map<String, T> convertMap(String line, Class<? extends T> clazz) {
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

	/** add connection information for the server */
	protected void addConnection(Map<String, String> props) {
	}

}
