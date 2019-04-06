package fr.lelouet.jswaggermaker.compiler.client;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CompilerOptionsTest {

	@Test
	public void testLoad() {
		CompilerOptions test = new CompilerOptions("clear=true", "folder=out");
		Assert.assertTrue(test.clearFolder);
		Assert.assertEquals(test.outDir, "out");
		test = new CompilerOptions("clear=true", "folder=out", "load=src/test/resources/exampleload.txt");
		Assert.assertFalse(test.clearFolder);
		Assert.assertEquals(test.outDir, "nope");
	}

}
