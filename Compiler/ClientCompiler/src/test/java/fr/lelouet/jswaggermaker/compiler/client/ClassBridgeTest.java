package fr.lelouet.jswaggermaker.compiler.client;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassBridgeTest {

	@Test
	public void testMakeJavaTypeIdentifier() {
		Assert.assertEquals(ClassBridge.makeJavaTypeIdentifier("api_key"), "ApiKey");
		Assert.assertEquals(ClassBridge.makeJavaTypeIdentifier("api-key"), "ApiKey");
		Assert.assertEquals(ClassBridge.makeJavaTypeIdentifier("api--_key"), "ApiKey");
		Assert.assertEquals(ClassBridge.makeJavaTypeIdentifier("apiKey"), "ApiKey");
	}

	@Test
	public void testMakeJavaIdentifier() {
		Assert.assertEquals(ClassBridge.makeJavaIdentifier("bla-a"), "bla_a");
		Assert.assertEquals(ClassBridge.makeJavaIdentifier("{player_id}"), "_player_id_");
	}

	@Test
	public void testMakeJavaPackage() {
		Assert.assertEquals(ClassBridge.makeJavaPackage("my.1337.pck"), "my._1337.pck");
		Assert.assertEquals(ClassBridge.makeJavaPackage("my.Pck"), "my.pck");
		Assert.assertEquals(ClassBridge.makeJavaPackage("my.package.var.double"), "my.package_.var.double_");
		Assert.assertEquals(ClassBridge.makeJavaPackage("final"), "final_");
	}

	@Test
	public void testPackageName() {
		Assert.assertFalse(ClassBridge.VALID_IDENTIFIER_NAME.matcher("12abc").matches());
		Assert.assertTrue(ClassBridge.VALID_IDENTIFIER_NAME.matcher("_12abc").matches());
		Assert.assertFalse(ClassBridge.VALID_IDENTIFIER_NAME.matcher("abc?").matches());
		Assert.assertTrue(ClassBridge.VALID_IDENTIFIER_NAME.matcher("abc_").matches());
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
