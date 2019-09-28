package fr.lelouet.jswaggermaker.examples.geodbcities;

import java.io.IOException;

import com.helger.jcodemodel.JClassAlreadyExistsException;

import fr.lelouet.jswaggermaker.compiler.client.SwaggerCompiler;

public class CompileGeoDBCities {

	public static void main(String[] args) throws IOException, JClassAlreadyExistsException {
		SwaggerCompiler.main("url=https://api.apis.guru/v2/specs/mashape.com/geodb/1.0.0/swagger.json",
				"folder=src/generated/java/");
	}

}
