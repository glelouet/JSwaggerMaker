package fr.lelouet.jswaggermaker.examples.discourse;

import java.io.IOException;

import com.helger.jcodemodel.JClassAlreadyExistsException;

import fr.lelouet.jswaggermaker.compiler.client.SwaggerCompiler;

public class CompileDiscourse {

	public static void main(String[] args) throws IOException, JClassAlreadyExistsException {
		SwaggerCompiler.main("url=https://docs.discourse.org/swagger.json", "folder=src/generated/java/");
	}

}
