package fr.lelouet.jswaggermaker.examples.github;

import java.io.IOException;

import com.helger.jcodemodel.JClassAlreadyExistsException;

import fr.lelouet.jswaggermaker.compiler.client.SwaggerCompiler;

public class CompileGithub {

	public static void main(String[] args) throws IOException, JClassAlreadyExistsException {
		SwaggerCompiler.main("url=https://api.apis.guru/v2/specs/github.com/v3/swagger.json", "folder=src/generated/java/",
				"globals=token,datasource");
	}
}
