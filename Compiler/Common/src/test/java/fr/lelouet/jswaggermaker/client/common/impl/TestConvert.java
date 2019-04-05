package fr.lelouet.jswaggermaker.client.common.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestConvert {

	@Test
	public void testConvertMap() throws IOException {
		String jsonInput = "{\"key\": \"value\"}";
		TypeReference<HashMap<String, String>> typeRef = new TypeReference<>() {
		};
		Map<String, String> map = new ObjectMapper().readValue(jsonInput, typeRef);
		Assert.assertEquals(map.get("key"), "value");
	}

}
