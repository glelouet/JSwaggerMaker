package fr.lelouet.jswaggermaker.compiler.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.jcodemodel.AbstractJType;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.JArray;
import com.helger.jcodemodel.JBlock;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JExpr;
import com.helger.jcodemodel.JFieldVar;
import com.helger.jcodemodel.JInvocation;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMod;
import com.helger.jcodemodel.JNarrowedClass;
import com.helger.jcodemodel.JPrimitiveType;
import com.helger.jcodemodel.JSynchronizedBlock;
import com.helger.jcodemodel.JTryBlock;
import com.helger.jcodemodel.JVar;

import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import fr.lelouet.syncbarker.LockWatchDog;
import io.swagger.models.ArrayModel;
import io.swagger.models.Model;
import io.swagger.models.ModelImpl;
import io.swagger.models.Operation;
import io.swagger.models.Path;
import io.swagger.models.RefModel;
import io.swagger.models.Response;
import io.swagger.models.parameters.BodyParameter;
import io.swagger.models.parameters.HeaderParameter;
import io.swagger.models.parameters.Parameter;
import io.swagger.models.parameters.PathParameter;
import io.swagger.models.parameters.QueryParameter;
import io.swagger.models.properties.Property;

public class PathTranslation {

	private static final Logger logger = LoggerFactory.getLogger(PathTranslation.class);

	/**
	 * how to handle the result of the fetch method in the cache method :
	 * Container puts in it a property, list put all the results in an observable
	 * list, and map puts the results in a map , with the key being specified by
	 * {@link #cacheRetUniqueField}
	 */
	public static enum RETURNTYPE {
		NONE, OBJECT, LIST, MAP
	}

	public final Operation operation;
	public final OpType optype;
	public final String baseURL;
	public final String path;
	public final ClassBridge bridge;
	public final String securityName;
	public final Set<String> securityScopes;

	public final JCodeModel cm;
	public JDefinedClass fetcherClass;
	public JDefinedClass rootHolderClass;

	public static enum OpType {
		get {
			@Override
			public Operation getOp(Path path) {
				return path.getGet();
			}
		},
		post {
			@Override
			public Operation getOp(Path path) {
				return path.getPost();
			}
		},
		put {
			@Override
			public Operation getOp(Path path) {
				return path.getPut();
			}
		},
		delete {
			@Override
			public Operation getOp(Path path) {
				return path.getDelete();
			}
		};

		public abstract Operation getOp(Path path);
	};

	public String propsParamName = "properties";

	public PathTranslation(Operation operation, OpType optype, String baseURL, String path, ClassBridge bridge,
			String securityName, Set<String> securityScopes) {
		this.operation = operation;
		this.optype = optype;
		this.baseURL = baseURL;
		this.path = path;
		this.bridge = bridge;
		this.securityName = securityName;
		this.securityScopes = securityScopes;
		cm = bridge.cm;
	}

	protected Response response;

	/**
	 * flat type of resource produced by the http fetch. if the fetch actually
	 * produces an array, this is the item type of the array, eg int[] will
	 * resolve to int.
	 */
	public AbstractJType resourceFlatType;

	/**
	 * type we convert the resource into. typically the exact translation of the
	 * response's model.
	 */
	protected AbstractJType resourceType;

	/** the structure of the resource we fetch : none, map, list, object */
	public RETURNTYPE resourceStructure;

	/**
	 * return type of the fetch method. if resourcestructure is object, then it
	 * will be resourceType; if map, then map string=>resourcetype ; if list, list
	 * resourcetype
	 */
	protected AbstractJType fetchRetType;

	public JMethod fetchMeth;

	public List<String> requiredRoles;

	/**
	 * parts of the resource path that are parameters. <br/>
	 * eg for path= /names/{charid} should contain charid
	 */
	protected ArrayList<String> pathsParams = new ArrayList<>();

	/**
	 * parts of the resource path that are not parameters. <br/>
	 * eg for path= /names/{charid} should contain names
	 */
	protected ArrayList<String> pathsNoParam = new ArrayList<>();

	public void apply() {
		if (operation == null) {
			return;
		}
		response = SwaggerCompiler.getResponse(operation);
		HashSet<String> alternateRoute = new HashSet<>();
		Object alternateversions = operation.getVendorExtensions().get("x-alternate-versions");
		if (alternateversions != null) {
			@SuppressWarnings("unchecked")
			List<String> versionsl = (List<String>) alternateversions;
			if (!versionsl.isEmpty()) {
				alternateRoute.addAll(versionsl);
			}
		}
		for (String pathToken : path.split("\\?")[0].split("/")) {
			if (!alternateRoute.contains(pathToken)) {
				if (pathToken.length() > 0) {
					// some token can have several params, eg {itemid}of{charid}
					if (pathToken.contains("{")) {
						for (String subtoken : pathToken.split("\\{")) {
							if (subtoken.length() > 0) {
								pathsParams.add(subtoken.split("\\}")[0]);
							}
						}
					} else {
						pathsNoParam.add(pathToken.toLowerCase());
					}
				}
			}
		}
		logger.trace("path=" + path + " params=" + pathsParams);
		fetcherClass = bridge.getFetcherClass(securityName, pathsNoParam);
		rootHolderClass = bridge.getFetcherClass(securityName);
		makeFetchMethInit();
		addPathJavadoc();
		IJExpression propsParam = JExpr._null();
		if (!headerParameters.isEmpty()) {
			JVar propsParamVar = fetchMeth.body().decl(bridge.propertiesType(), "headerProperties")
					.init(bridge.propertiesType()._new());
			for (Entry<String, JVar> headerParamEntry : headerParameters.entrySet()) {
				JVar param = headerParamEntry.getValue();
				JInvocation putcall = propsParamVar.invoke("put").arg(headerParamEntry.getKey()).arg(JExpr.lit("").plus(param));
				if (param.type().isPrimitive()) {
					fetchMeth.body().add(putcall);
				} else {
					fetchMeth.body()._if(param.neNull())._then().add(putcall);
				}
			}
			propsParam = propsParamVar;
		}

		JInvocation possibleRet;
		switch (optype) {
		case post:
			JVar content = null;
			if (!bodyparameters.isEmpty()) {
				content = fetchMeth.body().decl(cm.ref(Map.class).narrow(cm.ref(String.class)).narrow(cm.ref(Object.class)),
						"content");
				content.init(JExpr._new(cm.ref(HashMap.class).narrowEmpty()));
				for (JVar p : bodyparameters) {
					fetchMeth.body().directStatement("content.put(\"" + p.name() + "\", " + varAccess(p) + ");");
				}
			}
			if (resourceStructure == RETURNTYPE.MAP) {
				possibleRet = JExpr.invoke("requestPostMap").arg(url).arg(propsParam)
						.arg(content == null ? JExpr._null() : content).arg(JExpr.dotClass(resourceFlatType.boxify()));
			} else {
				possibleRet = JExpr.invoke("requestPost").arg(url).arg(propsParam)
						.arg(content == null ? JExpr._null() : content).arg(JExpr.dotClass(resourceType.boxify()));
			}
			break;
		case put:
			content = null;
			if (!bodyparameters.isEmpty()) {
				content = fetchMeth.body().decl(cm.ref(Map.class).narrow(cm.ref(String.class)).narrow(cm.ref(Object.class)),
						"content");
				content.init(JExpr._new(cm.ref(HashMap.class).narrowEmpty()));
				for (JVar p : bodyparameters) {
					fetchMeth.body().add(content.invoke("put").arg(p.name()).arg(JExpr.direct(varAccess(p))));
				}
			}
			possibleRet = JExpr.invoke("requestPut").arg(url).arg(propsParam).arg(content == null ? JExpr._null() : content)
					.arg(JExpr.dotClass(resourceType.boxify()));
			break;
		case get:
			if (resourceStructure == RETURNTYPE.MAP) {
				possibleRet = JExpr.invoke("requestGetMap").arg(url).arg(propsParam)
						.arg(JExpr.dotClass(resourceFlatType.boxify()));
			} else {
				possibleRet = JExpr.invoke("requestGet").arg(url).arg(propsParam).arg(JExpr.dotClass(resourceType.boxify()));
			}
			break;
		case delete:
			possibleRet = JExpr.invoke("requestDel").arg(url).arg(propsParam).arg(JExpr.dotClass(resourceType.boxify()));
			break;
		default:
			throw new UnsupportedOperationException("unsupported type " + optype + " for path " + path);
		}

		if (fetchRetType != cm.VOID) {
			fetchMeth.body()._return(possibleRet);
		} else {
			fetchMeth.body().add(possibleRet);
		}
	}

	/** the url to fetch the resource from */
	private JVar url;

	/**
	 * create the fetch method, as well as its url assignement variable.
	 */
	@SuppressWarnings("unchecked")
	protected void makeFetchMethInit() {
		String fetchMethName = optype.name();
		if (pathsParams.size() > 0) {
			fetchMethName += "By" + pathsParams.stream()
			.map(token -> ClassBridge.camelcase(ClassBridge.makeJavaTypeIdentifier(token))).collect(Collectors.joining());
		}

		/** rename the method in case of existingone already. */
		String fFetchName = fetchMethName;
		String renamed = Stream
				.concat(Stream.of(fetchMethName), IntStream.iterate(2, i -> i + 1).mapToObj(i -> fFetchName + i))
				.filter(name -> !fetcherClass.methods().stream().filter(meth -> meth.name().equals(name)).findAny().isPresent())
				.findFirst().orElse(null);

		makeFetchRetType();
		// create the method
		fetchMeth = fetcherClass.method(JMod.PUBLIC, fetchRetType, renamed);
		// add the parameters
		extractFetchParameters();

		if (operation.getVendorExtensions().containsKey("x-required-roles")) {
			requiredRoles = (List<String>) operation.getVendorExtensions().get("x-required-roles");
		} else {
			requiredRoles = Collections.emptyList();
		}

		String urlAssign = "\"" + baseURL + path + "\"";
		for (JVar jv : pathparameters) {
			urlAssign += ".replace(\"{" + jv.name() + "}\", \"\"+" + varAccess(jv) + ")";
		}
		if (queryparameters.size() > 0) {
			urlAssign += "+\"?\"";
		}
		for (JVar qp : queryparameters) {
			if (qp.type() instanceof JPrimitiveType) {
				urlAssign += "+\"&" + qp.name() + "=\"+flatten(" + varAccess(qp) + ")";
			} else {
				urlAssign += "+(" + varAccess(qp) + "==null?\"\":\"&" + qp.name() + "=\"+flatten(" + varAccess(qp) + "))";
			}
		}
		url = fetchMeth.body().decl(cm.ref(String.class), "url");
		url.init(JExpr.direct(urlAssign));
	}

	/**
	 * make the resolution of a variable. If the variable is in the global param
	 * list, use the delegate to access it, otherwise access it directly
	 *
	 * @param jv
	 *          the variable
	 * @return the access to the variable.
	 */
	protected String varAccess(JVar jv) {
		return bridge.options.globals.contains(jv.name()) && rootHolderClass != fetcherClass ? "delegate." + jv.name()
		: jv.name();
	}

	/**
	 * get the existing fetch type for this response
	 */
	protected void makeFetchRetType() {
		Model m = response == null ? null : response.getResponseSchema();
		logger.trace("making response type for path=" + path + " responsemodel=" + m);
		if (m == null) {
			resourceStructure = RETURNTYPE.NONE;
			resourceType = resourceFlatType = cm.VOID;
			fetchRetType = cm.VOID;
		} else {
			resourceType = bridge.translateToClass(m, bridge.responsePackage);
			if (resourceType.isArray()) {
				resourceStructure = RETURNTYPE.LIST;
				resourceFlatType = resourceType.elementType();
				fetchRetType = cm.ref(Requested.class).narrow(resourceType);
			} else if (resourceType.erasure().equals(cm.ref(Map.class))) {
				resourceStructure = RETURNTYPE.MAP;
				resourceFlatType = ((JNarrowedClass) resourceType).getTypeParameters().get(1);
				fetchRetType = cm.ref(Requested.class).narrow(resourceType);
			} else if (m.getClass() == ModelImpl.class && ((ModelImpl) m).getAdditionalProperties() != null) {
				throw new UnsupportedOperationException("class not a map with map properties " + resourceType.fullName());
			} else {
				resourceStructure = RETURNTYPE.OBJECT;
				resourceFlatType = resourceType;
				fetchRetType = cm.ref(Requested.class).narrow(resourceType);
			}
		}
	}

	////
	// parameters management for the fetch method
	////

	/**
	 * path parameter that are passed as argument
	 */
	private List<JVar> pathparameters = new ArrayList<>();

	/**
	 * queryparameter that are passed as arguments
	 */
	private List<JVar> queryparameters = new ArrayList<>();

	/**
	 * body parameters that are passed as arguments
	 */
	private List<JVar> bodyparameters = new ArrayList<>();

	/** header name to header variable */
	private Map<String, JVar> headerParameters = new HashMap<>();

	public List<JVar> allParams = new ArrayList<>();

	protected String nameForParameter(String name) {
		String sanitizedName = ClassBridge.makeJavaIdentifier(name);
		boolean rename = allParams.stream().filter(jv -> jv.name().equals(name)).findAny().isPresent();
		String paramName = sanitizedName;
		if (rename) {
			paramName = IntStream.iterate(2, i -> i + 1).mapToObj(i -> sanitizedName + i)
					.filter(s -> !allParams.stream().filter(jv -> jv.name().equals(s)).findAny().isPresent()).findFirst().get();
		}
		return paramName;
	}

	/**
	 * extract the parameters from an operation and put them in corresponding
	 * list. also add javadoc on the method for those parameters.
	 */
	protected void extractFetchParameters() {
		for (Parameter p : operation.getParameters()) {
			String in = p.getIn();
			boolean inField = bridge.options.globals.contains(p.getName());
			String paramName = nameForParameter(p.getName());
			AbstractJType varType;
			JVar param;
			switch (in) {
			case "path":
				fetchMeth.javadoc().addParam(paramName).add(p.getDescription());
				PathParameter pp = (PathParameter) p;
				varType = bridge.getExistingClass(pp.getType(), pp.getName(), pp.getFormat(), pp.getEnum());
				if (!pp.getRequired() && varType.isPrimitive()) {
					varType = varType.boxify();
				}
				param = getParam(paramName, varType, p.getDescription(), inField);
				pathparameters.add(param);
				allParams.add(param);
				break;
			case "query":
				fetchMeth.javadoc().addParam(paramName).add(p.getDescription());
				QueryParameter qp = (QueryParameter) p;
				varType = bridge.getExistingClass(qp);
				param = getParam(paramName, varType, p.getDescription(), inField);
				queryparameters.add(param);
				allParams.add(param);
				break;
			case "body":
				BodyParameter bp = (BodyParameter) p;
				Model schema = bp.getSchema();
				logger.trace("body parameter " + bp.getName() + " model " + schema);
				if (schema instanceof ArrayModel) {
					fetchMeth.javadoc().addParam(paramName).add(p.getDescription());
					varType = bridge.translateToClass(schema, bridge.structurePackage);
					param = getParam(paramName, varType, p.getDescription(), inField);
					bodyparameters.add(param);
					allParams.add(param);
				} else if (schema instanceof RefModel) {
					fetchMeth.javadoc().addParam(paramName).add(p.getDescription());
					varType = bridge.translateDefToClass(((RefModel) schema).getSimpleRef());
					param = getParam(paramName, varType, p.getDescription(), inField);
					bodyparameters.add(param);
					allParams.add(param);
				} else {
					// if we have a complex type, since we are making a function, we
					// iterate over the fields of the actual complex type and translate
					// them to as many additional parameters
					if (schema.getProperties() != null) {
						for (Entry<String, Property> e : schema.getProperties().entrySet()) {
							String subParamName = nameForParameter(e.getKey());
							fetchMeth.javadoc().addParam(subParamName).add(e.getValue().getDescription());
							AbstractJType type = bridge.translateToClass(e.getValue(), bridge.structurePackage, subParamName);
							param = fetchMeth.param(type, subParamName);
							bodyparameters.add(param);
							allParams.add(param);
						}
					}
				}
				break;
			case "header":
				fetchMeth.javadoc().addParam(paramName).add(p.getDescription());
				HeaderParameter hp = (HeaderParameter) p;
				varType = bridge.getExistingClass(hp);
				param = getParam(paramName, varType, p.getDescription(), inField);
				headerParameters.put(hp.getName(), param);
				allParams.add(param);
				break;
			default:
				logger.error("no matching type " + p.getIn() + " for parameter " + p.getName() + " in operation "
						+ operation.getOperationId());
			}
		}
	}

	protected JVar getParam(String paramName, AbstractJType pathType, String description, boolean inField) {
		JVar param;
		if (inField) {
			param = bridge.getField(rootHolderClass, paramName, pathType, description);
			// if (rootHolderClass != fetcherClass) {
			// param = fetchMeth.body().decl(pathType, paramName);
			// param.init(JExpr.ref("delegate").ref(paramName));
			// }
		} else {
			param = fetchMeth.param(pathType, paramName);
		}
		return param;
	}

	protected void addPathJavadoc() {
		if (operation.getSummary() != null) {
			fetchMeth.javadoc().append("" + operation.getSummary() + "\n");
		}
		fetchMeth.javadoc().add(("\n<p>\n" + ("" + operation.getDescription()).replaceAll("---", "<br />") + "\n</p>")
				.replaceAll("\n\n", "\n").replaceAll("<br />\n<", "<").replaceAll("\n<br />\n", "<br />\n"));
		if (!requiredRoles.isEmpty()) {
			JFieldVar rolesfield = fetcherClass.field(JMod.PUBLIC | JMod.STATIC | JMod.FINAL, cm.ref(String.class).array(),
					(operation.getOperationId() + "_roles").toUpperCase());
			JArray array = JExpr.newArray(cm.ref(String.class));
			for (String role : requiredRoles) {
				array.add(JExpr.lit(role));
			}
			rolesfield.init(array);
			rolesfield.javadoc().add("the roles required for {@link #" + fetchMeth.name() + " this method}");
			fetchMeth.javadoc().add("\n<p>\nrequire the roles specified {@link #" + rolesfield.name() + " here}\n</p>");
		}
	}
	////
	// tooling
	////

	/**
	 * create the following block : ret=getter; if(ret==null) synchronized(lock)
	 * {ret=getter; if(ret==null){BLOCK}}
	 *
	 * @return the block to assign value. in this block ret is null and we need to
	 *         create it.
	 */
	public JBlock createTestNullCase(JBlock outBlock, JVar ret, IJExpression getter, JVar lock) {
		ret.init(getter);
		return sync(outBlock._if(ret.eqNull())._then(), lock).body().add(JExpr.assign(ret, getter))._if(ret.eqNull())
				._then();
	}

	/**
	 * create a synchronized(expr) surounded by a call to barker.tak(expr) and a
	 * call to barker.rel(expr)
	 *
	 * @param parent
	 * @param expr
	 * @return
	 */
	public JSynchronizedBlock sync(JBlock parent, IJExpression expr) {
		parent.add(JExpr.invoke(cm.ref(LockWatchDog.class).staticRef("BARKER"), "tak").arg(expr));
		JTryBlock tryblock = parent._try();
		JSynchronizedBlock ret = tryblock.body().synchronizedBlock(expr);
		ret.body().add(JExpr.invoke(cm.ref(LockWatchDog.class).staticRef("BARKER"), "hld").arg(expr));
		tryblock._finally().add(JExpr.invoke(cm.ref(LockWatchDog.class).staticRef("BARKER"), "rel").arg(expr));
		return ret;
	}

}
