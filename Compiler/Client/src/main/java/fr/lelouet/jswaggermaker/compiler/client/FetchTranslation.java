package fr.lelouet.jswaggermaker.compiler.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.jcodemodel.AbstractJType;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.JArray;
import com.helger.jcodemodel.JBlock;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JExpr;
import com.helger.jcodemodel.JFieldVar;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMod;
import com.helger.jcodemodel.JPrimitiveType;
import com.helger.jcodemodel.JSynchronizedBlock;
import com.helger.jcodemodel.JVar;

import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import fr.lelouet.syncbarker.LockWatchDog;
import io.swagger.models.ArrayModel;
import io.swagger.models.Model;
import io.swagger.models.ModelImpl;
import io.swagger.models.Operation;
import io.swagger.models.Path;
import io.swagger.models.Response;
import io.swagger.models.parameters.BodyParameter;
import io.swagger.models.parameters.Parameter;
import io.swagger.models.parameters.PathParameter;
import io.swagger.models.parameters.QueryParameter;
import io.swagger.models.properties.Property;
import io.swagger.models.utils.PropertyModelConverter;

public class FetchTranslation {

	private static final Logger logger = LoggerFactory.getLogger(FetchTranslation.class);

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
	public final String path;
	public final ClassBridge bridge;

	public final JCodeModel cm;

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

	public FetchTranslation(Operation operation, OpType optype, String path, ClassBridge bridge) {
		this.operation = operation;
		this.optype = optype;
		this.path = path;
		this.bridge = bridge;
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

	public void apply() {
		if (operation == null) {
			return;
		}
		response = SwaggerCompiler.getResponse(operation);
		if (response == null) {
			logger.error("can't find response for path " + path + " " + optype);
			return;
		}
		makeFetchMethInit();
		addPathJavadoc();

		switch (optype) {
		case post:
			JVar content = null;
			if (!bodyparameters.isEmpty()) {
				content = fetchMeth.body().decl(cm.ref(Map.class).narrow(cm.ref(String.class)).narrow(cm.ref(Object.class)),
						"content");
				content.init(JExpr._new(cm.ref(HashMap.class).narrowEmpty()));
				for (JVar p : bodyparameters) {
					fetchMeth.body().directStatement("content.put(\"" + p.name() + "\", " + p.name() + ");");
				}
			}
			fetchMeth.body()._return(JExpr.invoke("requestPost").arg(url).arg(propsParam)
					.arg(content == null ? JExpr._null() : content).arg(JExpr.dotClass(resourceType.boxify())));
			break;
		case put:
			content = null;
			if (!bodyparameters.isEmpty()) {
				content = fetchMeth.body().decl(cm.ref(Map.class).narrow(cm.ref(String.class)).narrow(cm.ref(Object.class)),
						"content");
				content.init(JExpr._new(cm.ref(HashMap.class).narrowEmpty()));
				for (JVar p : bodyparameters) {
					fetchMeth.body().add(content.invoke("put").arg(p.name()).arg(p));
				}
			}
			fetchMeth.body()
			._return(JExpr.invoke("requestPut").arg(url).arg(propsParam).arg(content == null ? JExpr._null() : content));
			break;
		case get:
			fetchMeth.body()._return(JExpr.invoke("requestGet").arg(url).arg(propsParam).arg(JExpr.dotClass(resourceType)));
			break;
		case delete:
			fetchMeth.body()._return(JExpr.invoke("requestDel").arg(url).arg(propsParam));
			break;
		default:
			throw new UnsupportedOperationException("unsupported type " + optype + " for path " + path);
		}
	}

	/** the url to fetch the resource from */
	private JVar url;

	/**
	 * create the fetch method, as well as its url assignement variable.
	 */
	@SuppressWarnings("unchecked")
	protected void makeFetchMethInit() {
		String fetchMethName = operation.getOperationId();
		for (Parameter p : operation.getParameters()) {
			fetchMethName = fetchMethName.replaceAll(p.getName(), "");
		}
		fetchMethName = fetchMethName.replaceAll("__", "_").replaceAll("_$", "");

		makeFetchRetType();
		findConnected();
		// create the method
		fetchMeth = (connected ? bridge.swaggerCOClass : bridge.swaggerDCClass).method(JMod.PUBLIC | JMod.DEFAULT,
				fetchRetType, fetchMethName);
		// add the parameters
		extractFetchParameters();

		if (operation.getVendorExtensions().containsKey("x-required-roles")) {
			requiredRoles = (List<String>) operation.getVendorExtensions().get("x-required-roles");
		} else {
			requiredRoles = Collections.emptyList();
		}

		String urlAssign = "\"" + path + "\"";
		for (JVar jv : pathparameters) {
			urlAssign += ".replace(\"{" + jv.name() + "}\", \"\"+" + jv.name() + ")";
		}
		if (queryparameters.size() > 0) {
			urlAssign += "+\"?\"";
		}
		for (int pi = 0; pi < queryparameters.size(); pi++) {
			JVar qp = queryparameters.get(pi);
			if (qp.type() instanceof JPrimitiveType) {
				urlAssign += "+\"&" + qp.name() + "=\"+flatten(" + qp.name() + ")";
			} else {
				urlAssign += "+(" + qp.name() + "==null?\"\":\"&" + qp.name() + "=\"+flatten(" + qp.name() + "))";
			}
		}
		url = fetchMeth.body().decl(cm.ref(String.class), "url");
		url.init(JExpr.direct(urlAssign));

		propsParam = fetchMeth.param(bridge.propertiesType(), propsParamName);
	}

	/**
	 * get the existing fetch type for this response
	 */
	protected void makeFetchRetType() {
		Model m = response.getResponseSchema();
		if (m == null) {
			resourceStructure = RETURNTYPE.NONE;
			resourceType = resourceFlatType = cm.VOID;
			fetchRetType = cm.ref(Requested.class).narrow(resourceType);
		} else if (m.getClass() == ArrayModel.class) {
			ArrayModel am = (ArrayModel) m;
			resourceStructure = RETURNTYPE.LIST;
			resourceFlatType = bridge.getReponseClass(am.getItems());
			resourceType = resourceFlatType.boxify().array();
			fetchRetType = cm.ref(Requested.class).narrow(resourceType);
		} else if (m.getClass() == ModelImpl.class) {
			ModelImpl mi = (ModelImpl) m;
			if (mi.getAdditionalProperties() != null) {
				resourceStructure = RETURNTYPE.MAP;
				resourceFlatType = bridge.getReponseClass(mi.getAdditionalProperties());
				resourceType = cm.ref(Map.class).narrow(cm.ref(String.class), resourceFlatType.boxify());
				fetchRetType = cm.ref(Requested.class).narrow(resourceType);
			} else {
				resourceStructure = RETURNTYPE.OBJECT;
				resourceType = resourceFlatType = bridge
						.getReponseClass(new PropertyModelConverter().modelToProperty(response.getResponseSchema()));
				fetchRetType = cm.ref(Requested.class).narrow(resourceType);
			}
		} else {
			logger.warn("can't apply to path class " + m.getClass());
		}
	}

	/** true iff the path requires connection */
	public boolean connected;

	protected void findConnected() {
		connected = operation.getParameters().stream().filter(p -> p.getName().equals("token")).findAny().isPresent();
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

	public List<JVar> allParams = new ArrayList<>();

	/** argument of the fetch method for the header handler */
	JVar propsParam;

	/**
	 * extract the parameters from an operation and put them in corresponding
	 * list. also add javadoc on the method for those parameters.
	 */
	protected void extractFetchParameters() {
		for (Parameter p : operation.getParameters()) {
			if (ignoreparameter(p)) {
				continue;
			}
			String in = p.getIn();
			AbstractJType pt;
			JVar param;
			switch (in) {
			case "path":
				fetchMeth.javadoc().addParam(p.getName()).add(p.getDescription());
				PathParameter pp = (PathParameter) p;
				pt = bridge.getExistingClass(pp.getType(), pp.getName(), pp.getFormat(), pp.getEnum());
				if (!pp.getRequired() && pt.isPrimitive()) {
					pt = pt.boxify();
				}
				param = fetchMeth.param(pt, pp.getName());
				pathparameters.add(param);
				allParams.add(param);
				break;
			case "query":
				fetchMeth.javadoc().addParam(p.getName()).add(p.getDescription());
				QueryParameter qp = (QueryParameter) p;
				param = fetchMeth.param(bridge.getExistingClass(qp), qp.getName());
				queryparameters.add(param);
				allParams.add(param);
				break;
			case "body":
				BodyParameter bp = (BodyParameter) p;
				Model schema = bp.getSchema();
				if (schema instanceof ArrayModel) {
					fetchMeth.javadoc().addParam(p.getName()).add(p.getDescription());
					pt = bridge.getExistingClass((ArrayModel) schema);
					param = fetchMeth.param(pt, bp.getName());
					bodyparameters.add(param);
					allParams.add(param);
				} else {
					for (Entry<String, Property> e : schema.getProperties().entrySet()) {
						fetchMeth.javadoc().addParam(e.getKey()).add(e.getValue().getDescription());
						AbstractJType type = bridge.translateToClass(e.getValue(), bridge.structurePackage, e.getKey());
						param = fetchMeth.param(type, e.getKey());
						bodyparameters.add(param);
						allParams.add(param);
					}
				}
				break;
			default:
				logger.error("no matching type " + p.getIn() + " for parameter " + p.getName() + " in operation "
						+ operation.getOperationId());
			}
		}
	}

	protected boolean ignoreparameter(Parameter p) {
		return false;
	}

	protected void addPathJavadoc() {
		fetchMeth.javadoc().append("" + operation.getSummary());
		fetchMeth.javadoc().add(("\n<p>\n" + ("" + operation.getDescription()).replaceAll("---", "<br />") + "\n</p>")
				.replaceAll("\n\n", "\n").replaceAll("<br />\n<", "<").replaceAll("\n<br />\n", "<br />\n"));
		if (!requiredRoles.isEmpty()) {
			JFieldVar rolesfield = (connected ? bridge.swaggerCOClass : bridge.swaggerDCClass).field(
					JMod.PUBLIC | JMod.STATIC | JMod.FINAL, cm.ref(String.class).array(),
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
		JSynchronizedBlock ret = parent.synchronizedBlock(expr);
		ret.body().add(JExpr.invoke(cm.ref(LockWatchDog.class).staticRef("BARKER"), "hld").arg(expr));
		parent.add(JExpr.invoke(cm.ref(LockWatchDog.class).staticRef("BARKER"), "rel").arg(expr));
		return ret;
	}

}