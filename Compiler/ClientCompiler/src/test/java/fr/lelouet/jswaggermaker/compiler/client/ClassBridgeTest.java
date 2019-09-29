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

	@Test
	public void testPackageName() {
		Assert.assertFalse(ClassBridge.VALID_PACKAGE_NAME.matcher("12abc").matches());
		Assert.assertTrue(ClassBridge.VALID_PACKAGE_NAME.matcher("_12abc").matches());
		Assert.assertFalse(ClassBridge.VALID_PACKAGE_NAME.matcher("abc?").matches());
		Assert.assertTrue(ClassBridge.VALID_PACKAGE_NAME.matcher("abc_").matches());
	}

	@Test
	public void testJavaLangNames() {
		Assert.assertTrue(ClassBridge.isJavaLangClass("Enum"));
		Assert.assertTrue(ClassBridge.isJavaLangClass("Enum"));
		Assert.assertTrue(ClassBridge.isJavaLangClass("String"));
		Assert.assertTrue(ClassBridge.isJavaLangClass("String"));
		Assert.assertTrue(ClassBridge.isJavaLangClass("Object"));
		Assert.assertFalse(ClassBridge.isJavaLangClass("Objection"));
	}

}
