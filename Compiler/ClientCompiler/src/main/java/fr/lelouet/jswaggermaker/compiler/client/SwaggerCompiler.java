package fr.lelouet.jswaggermaker.compiler.client;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.jcodemodel.JClassAlreadyExistsException;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.writer.JCMWriter;

import fr.lelouet.jswaggermaker.compiler.client.FetchTranslation.OpType;
import fr.lelouet.jswaggermaker.compiler.client.cache.ActiveCacheTranslator;
import fr.lelouet.jswaggermaker.compiler.client.cache.CacheTranslator;
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

	/**
	 *
	 * @param args
	 *          a list of args that are translated as the compiler options.
	 * @see CompilerOptions for the list of arguments
	 * @throws IOException
	 * @throws JClassAlreadyExistsException
	 */
	public static void main(String... args) throws IOException, JClassAlreadyExistsException {
		long startTime = System.currentTimeMillis();
		logger.info("compiling swagger with params " + Arrays.asList(args));
		SwaggerCompiler c = new SwaggerCompiler(args);
		JCodeModel cm = c.compile();
		c.export(cm);
		logger.info("compiled swagger in " + (System.currentTimeMillis() - startTime) / 1000 + "s");
	}

	public static void delDir(File delete) {
		if (delete.exists()) {
			if (delete.isDirectory()) {
				for (File child : delete.listFiles()) {
					delDir(child);
				}
			}
			delete.delete();
		}
	}

	public CompilerOptions options;

	public SwaggerCompiler(String... args) {
		options = new CompilerOptions(args);
	}

	CacheTranslator cachemaker;

	public JCodeModel compile() throws JClassAlreadyExistsException {
		Swagger swagger = fetchSwagger();
		JCodeModel cm = new JCodeModel();
		if (swagger == null) {
			return null;
		}

		String baseURL = swagger.getSchemes().get(0).toValue()
				+ "://"
				+ swagger.getHost()
				+ (swagger.getBasePath() == null ? "" : swagger.getBasePath());

		ClassBridge cltrans = new ClassBridge(cm, swagger, options);

		cachemaker = null;
		if (options.cache != null) {
			switch (options.cache) {
			case "active":
				cachemaker = new ActiveCacheTranslator(cm, cltrans, options);
				break;
			case "lazy": break;
			default :
				logger.warn("can't create cache for option [ "+options.cache+" ] , no cache made");
			}
		}

		swagger.getPaths().entrySet().forEach(e -> {
			String resource = e.getKey();
			Path p = e.getValue();
			for (OpType optype : OpType.values()) {
				Operation op = optype.getOp(p);
				if (op == null) {
					continue;
				}
				// first remake the map securityName -> scopes
				Map<String, Set<String>> mapSec = new HashMap<>();
				if (op.getSecurity() == null || op.getSecurity().isEmpty()) {
					mapSec.put(null, null);
				} else {
					for (Map<String, List<String>> sec : op.getSecurity()) {
						if (sec == null || sec.isEmpty()) {
							mapSec.put(null, null);
						}
						for (Entry<String, List<String>> secEntry : sec.entrySet()) {
							Set<String> set = mapSec.get(secEntry.getKey());
							if (set == null) {
								set = new HashSet<>();
								mapSec.put(secEntry.getKey(), set);
							}
							set.addAll(secEntry.getValue());
						}
					}
				}
				apptyToPath(op, optype, baseURL, resource, cltrans, mapSec);

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

	protected void apptyToPath(Operation op, OpType optype, String baseURL, String path, ClassBridge cltrans,
			Map<String, Set<String>> securities) {
		logger.debug("applyToPath [" + optype + "]" + path);
		for (Entry<String, Set<String>> security : securities.entrySet()) {
			logger.debug("path=[" + optype + "]" + path + " security=" + security.getKey());
			FetchTranslation f = new FetchTranslation(op, optype, baseURL, path, cltrans, security.getKey(),
					security.getValue());
			f.apply();
			if (cachemaker != null) {
				cachemaker.apply(f);
			}
		}
	}

	public void export(JCodeModel cm) throws IOException {
		File dir = new File(options.outDir);
		if (options.clearFolder) {
			delDir(dir);
		}
		dir.mkdirs();
		new JCMWriter(cm).build(dir, dir, null);
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
