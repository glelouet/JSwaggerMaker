package fr.lelouet.jswaggermaker.examples.petstore;

import java.io.IOException;

import com.helger.jcodemodel.JClassAlreadyExistsException;

import fr.lelouet.jswaggermaker.compiler.client.SwaggerCompiler;

public class CompilePetStore {

	public static void main(String[] args) throws IOException, JClassAlreadyExistsException {
		SwaggerCompiler.main("load=options.txt");
	}

}
