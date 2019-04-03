package fr.lelouet.jswaggermaker.compiler.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.jcodemodel.JClassAlreadyExistsException;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.writer.JCMWriter;

import fr.lelouet.jswaggermaker.compiler.client.FetchTranslation.OpType;
import io.swagger.models.ArrayModel;
import io.swagger.models.Model;
import io.swagger.models.Operation;
import io.swagger.models.Path;
import io.swagger.models.Response;
import io.swagger.models.Swagger;
import io.swagger.models.properties.ArrayProperty;
import io.swagger.models.properties.ObjectProperty;
import io.swagger.models.properties.Property;
import io.swagger.parser.SwaggerParser;

public class SwaggerCompiler {

	private static final Logger logger = LoggerFactory.getLogger(SwaggerCompiler.class);

	public static class Options {

		public static final String SWAGGERURLPREFIX = "url=";

		public String swaggerURL;

		public static final String OUTDIRPREFIX = "folder=";

		public String outDir = "compiled/";

		public static final String CLEARFOLDERPREFIX = "clear=";

		public Boolean clearFolder = true;

		public static final String LOADPREFIX = "load=";

		public Options(String... args) {
			if (args != null) {
				for (String arg : args) {
					load(arg);
				}
			}
		}

		private void load(String arg) {
			if (arg.startsWith(SWAGGERURLPREFIX)) {
				swaggerURL = arg.substring(SWAGGERURLPREFIX.length());
			} else if (arg.startsWith(OUTDIRPREFIX)) {
				outDir = arg.substring(OUTDIRPREFIX.length());
			} else if (arg.startsWith(CLEARFOLDERPREFIX)) {
				clearFolder = Boolean.parseBoolean(arg.substring(CLEARFOLDERPREFIX.length()));
			} else if (arg.startsWith(LOADPREFIX)) {
				loadFile(arg.substring(LOADPREFIX.length()));
			} else {
				System.err.println("can't parse argument " + arg);
			}
		}

		private void loadFile(String fileName) {
			try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
				br.lines().forEachOrdered(this::load);
			} catch (IOException e) {
				throw new UnsupportedOperationException("catch this", e);
			}
		}
	}

	public Options options = new Options();

	/**
	 *
	 * @param args
	 *          { base url , destination folder } .base url is typically the
	 *          swagger URL without the swagger.json at the end.
	 * @throws IOException
	 * @throws JClassAlreadyExistsException
	 */
	public static void main(String... args) throws IOException, JClassAlreadyExistsException {
		long startTime = System.currentTimeMillis();
		logger.info("compiling esi with params " + Arrays.asList(args));
		SwaggerCompiler c = new SwaggerCompiler(args);
		JCodeModel cm = c.compile();
		c.export(cm);
		logger.info("compiled esi in " + (System.currentTimeMillis() - startTime) / 1000 + "s");
	}

	public SwaggerCompiler(String... args) {
		options = new Options(args);
	}

	protected static void delDir(File delete) {
		if (delete.exists()) {
			if (delete.isDirectory()) {
				for (File child : delete.listFiles()) {
					delDir(child);
				}
			}
			delete.delete();
		}
	}

	public JCodeModel compile() throws JClassAlreadyExistsException {
		Swagger swagger = fetchSwagger();
		String baseURL = swagger.getSchemes().get(0).toValue()
				+ "://"
				+ swagger.getHost()
				+ (swagger.getBasePath() == null ? "" : swagger.getBasePath());

		JCodeModel cm = new JCodeModel();
		ClassBridge cltrans = makeClassBridge(cm, swagger);

		swagger.getPaths().entrySet().forEach(e -> {
			String resource = e.getKey();
			Path p = e.getValue();

			for (OpType optype : OpType.values()) {
				apptyToPath(optype.getOp(p), optype, baseURL + resource, cltrans);
			}
		});
		return cm;
	}

	protected Swagger fetchSwagger() {
		if (options.swaggerURL != null) {
			return new SwaggerParser().read(options.swaggerURL);
		}
		return null;
	}

	protected void apptyToPath(Operation op, OpType optype, String url, ClassBridge cltrans) {
		FetchTranslation f = new FetchTranslation(op, optype, url, cltrans);
		f.apply();
	}

	public void export(JCodeModel cm) throws IOException {
		File dir = new File(options.outDir);
		if (options.clearFolder) {
			delDir(dir);
		}
		dir.mkdirs();
		new JCMWriter(cm).build(dir);

	}

	/** Override to change the way to generate a classBridge */
	protected ClassBridge makeClassBridge(JCodeModel cm, Swagger swagger) {
		return new ClassBridge(cm, swagger);
	}

	public static Response getResponse(Operation operation) {
		if (operation == null) {
			return null;
		}
		Response r = operation.getResponses().get("200");
		if (r == null) {
			r = operation.getResponses().get("201");
		}
		if (r == null) {
			r = operation.getResponses().get("204");
		}
		return r;
	}

	public static Map<String, Property> getStructureDef(Model m) {
		if (m == null) {
			return null;
		}
		if (m.getClass() == ArrayModel.class) {
			ArrayModel am = (ArrayModel) m;
			return getPropertyObject(am.getItems()).getProperties();
		}
		logger.warn("can't translate model class " + m.getClass());
		return null;
	}

	/**
	 * get the {@link ObjectProperty} at first or second level from a property. If
	 * the property defines an object, return it ; if the property defines an
	 * array, return the item type fo the array.<br />
	 * So passing as parameters a property which defines int[] or one which
	 * defines int will both return int.
	 *
	 * @param s
	 * @return the corresponding object property, or null.
	 */
	public static ObjectProperty getPropertyObject(Property s) {
		if (s == null) {
			return null;
		}
		switch (s.getType()) {
		case ObjectProperty.TYPE:
			return (ObjectProperty) s;
		case ArrayProperty.TYPE:
			Property sublevel = ((ArrayProperty) s).getItems();
			if (sublevel.getType() == ObjectProperty.TYPE) {
				return (ObjectProperty) sublevel;
			}
			// if an Arraypropert<y??> we return null so no break;
		default:
			return null;
		}
	}

}
