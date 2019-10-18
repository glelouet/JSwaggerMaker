package fr.lelouet.jswaggermaker.compiler.client.openapi3;

import com.helger.jcodemodel.JCodeModel;

import fr.lelouet.jswaggermaker.compiler.client.CompilerOptions;
import io.swagger.v3.oas.models.OpenAPI;

public class OpenAPICompiler {

	public static JCodeModel generate(OpenAPI schema, CompilerOptions options) {
		return new OpenAPICompiler(schema, options).generate();
	}

	public final OpenAPI schema;
	public final CompilerOptions options;

	protected OpenAPICompiler(OpenAPI schema, CompilerOptions options) {
		this.schema = schema;
		this.options = options;
	}

	protected JCodeModel generate() {
		JCodeModel cm = new JCodeModel();
		Bridge bdg = new Bridge(cm, schema, options);
		return cm;
	}

}
