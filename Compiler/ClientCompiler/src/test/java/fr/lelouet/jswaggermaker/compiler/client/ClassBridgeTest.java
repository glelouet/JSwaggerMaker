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

	@Test
	public void testSanitize() {
		Assert.assertEquals(ClassBridge.sanitizeVarName("bla-a"), "bla_a");
		Assert.assertEquals(ClassBridge.sanitizeVarName("{player_id}"), "player_id");
	}

}
