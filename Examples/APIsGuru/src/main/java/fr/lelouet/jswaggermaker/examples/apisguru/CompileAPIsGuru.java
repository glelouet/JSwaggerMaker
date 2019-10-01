package fr.lelouet.jswaggermaker.examples.apisguru;

import java.io.IOException;

import com.helger.jcodemodel.JClassAlreadyExistsException;

import fr.lelouet.jswaggermaker.compiler.client.SwaggerCompiler;

public class CompileAPIsGuru {

	/**
	 * launch this to test the compiling in your IDE
	 */
	public static void main(String[] args) throws IOException, JClassAlreadyExistsException {
		SwaggerCompiler.main("url=https://api.apis.guru/v2/swagger.yaml", "folder=src/generated/java/");
	}
}
