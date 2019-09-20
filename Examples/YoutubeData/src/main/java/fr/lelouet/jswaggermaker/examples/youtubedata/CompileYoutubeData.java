package fr.lelouet.jswaggermaker.examples.youtubedata;

import java.io.IOException;

import com.helger.jcodemodel.JClassAlreadyExistsException;

import fr.lelouet.jswaggermaker.compiler.client.SwaggerCompiler;

public class CompileYoutubeData {

	public static void main(String[] args) throws IOException, JClassAlreadyExistsException {
		SwaggerCompiler.main("url=https://api.apis.guru/v2/specs/googleapis.com/youtube/v3/swagger.json",
				"folder=src/generated/java/");
	}

}
