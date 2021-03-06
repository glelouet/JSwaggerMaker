package fr.lelouet.jswaggermaker.examples.petstore;

import java.io.IOException;

import com.helger.jcodemodel.JClassAlreadyExistsException;

import fr.lelouet.jswaggermaker.compiler.client.SwaggerCompiler;

public class CompilePetStore {

	/**
	 * launch this to test the compiling in your IDE
	 */
	public static void main(String[] args) throws IOException, JClassAlreadyExistsException {
		SwaggerCompiler.main("url=https://petstore.swagger.io/v2/swagger.json", "folder=src/generated/java/");
	}

}
