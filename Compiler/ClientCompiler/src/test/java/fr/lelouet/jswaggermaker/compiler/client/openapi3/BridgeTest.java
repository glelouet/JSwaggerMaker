package fr.lelouet.jswaggermaker.compiler.client.openapi3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BridgeTest {

	@Test
	public void testUrlToPackage() {
		Assert.assertEquals(Bridge.urlToPackage("wft-geo-db.p.mashape.com"), "com.mashape.p.wft-geo-db");
		Assert.assertEquals(Bridge.urlToPackage("api.github.com"), "com.github.api");
		Assert.assertEquals(Bridge.urlToPackage("petstore.swagger.io"), "io.swagger.petstore");
		Assert.assertEquals(Bridge.urlToPackage("www.googleapis.com"), "com.googleapis");
		Assert.assertEquals(Bridge.urlToPackage("https://development.gigantic-server.com/v1"),
				"com.gigantic-server.development");
		Assert.assertEquals(Bridge.urlToPackage("https://{username}.gigantic-server.com:{port}/{basePath}"),
				"com.gigantic-server");
	}

}
