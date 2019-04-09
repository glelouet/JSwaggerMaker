package fr.lelouet.jswaggermaker.compiler.client;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassBridgeTest {

	@Test
	public void testNormalizeClass() {
		Assert.assertEquals(ClassBridge.normalizeClassName("api_key"), "ApiKey");
		Assert.assertEquals(ClassBridge.normalizeClassName("api-key"), "ApiKey");
		Assert.assertEquals(ClassBridge.normalizeClassName("api--_key"), "ApiKey");
		Assert.assertEquals(ClassBridge.normalizeClassName("apiKey"), "ApiKey");
	}

}
