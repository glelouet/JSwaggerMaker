package fr.lelouet.jswaggermaker.examples.discourse;

import java.io.IOException;

import com.helger.jcodemodel.JClassAlreadyExistsException;

import fr.lelouet.jswaggermaker.compiler.client.SwaggerCompiler;

public class CompileDiscourse {

	/**
	 * launch this to test the compiling in your IDE
	 */
	public static void main(String[] args) throws IOException, JClassAlreadyExistsException {
		SwaggerCompiler.main("url=https://docs.discourse.org/swagger.json", "folder=src/generated/java/");
	}

}
