package fr.lelouet.jswaggermaker.examples.esi;

import java.io.IOException;

import com.helger.jcodemodel.JClassAlreadyExistsException;

import fr.lelouet.jswaggermaker.compiler.client.SwaggerCompiler;

public class CompileESI {

	/**
	 * launch this to test the compiling in your IDE
	 */
	public static void main(String[] args) throws IOException, JClassAlreadyExistsException {
		SwaggerCompiler.main("url=https://esi.evetech.net/_latest/swagger.json", "folder=src/generated/java/",
				"globals=token,datasource");
	}
}
