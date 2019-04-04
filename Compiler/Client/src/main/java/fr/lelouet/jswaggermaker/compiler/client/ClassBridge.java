package fr.lelouet.jswaggermaker.compiler.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.AbstractJType;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.JArray;
import com.helger.jcodemodel.JClassAlreadyExistsException;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JExpr;
import com.helger.jcodemodel.JFieldRef;
import com.helger.jcodemodel.JFieldVar;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMod;
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.JVar;

import fr.lelouet.jswaggermaker.client.common.interfaces.ITransfer;
import io.swagger.models.ArrayModel;
import io.swagger.models.Model;
import io.swagger.models.ModelImpl;
import io.swagger.models.Path;
import io.swagger.models.RefModel;
import io.swagger.models.Response;
import io.swagger.models.Swagger;
import io.swagger.models.parameters.QueryParameter;
import io.swagger.models.properties.ArrayProperty;
import io.swagger.models.properties.BooleanProperty;
import io.swagger.models.properties.DecimalProperty;
import io.swagger.models.properties.FloatProperty;
import io.swagger.models.properties.IntegerProperty;
import io.swagger.models.properties.LongProperty;
import io.swagger.models.properties.ObjectProperty;
import io.swagger.models.properties.Property;
import io.swagger.models.properties.RefProperty;
import io.swagger.models.properties.StringProperty;

/**
 * bridge between a {@link Swagger} and the classes we create in a
 * {@link JCodeModel}
 */
public class ClassBridge {

	private static final Logger logger = LoggerFactory.getLogger(ClassBridge.class);

	public final JCodeModel cm;
	public final Swagger swagger;
	public final CompilerOptions options;

	public String rootPackage;
	public JPackage responsePackage = null;
	public JPackage definitionsPackage = null;
	public JPackage structurePackage = null;
	public JPackage keyPackage = null;
	public JPackage connectedPackage = null;
	public JPackage disconnectedPackage = null;

	protected String responsesPackageName = "responses";
	protected String definitionsPackageName = "definitions";
	protected String structuresPackageName = "structures";
	protected String keysPackageName = "keys";
	protected String connectedPackageName = "connected";
	protected String disconnectedPackageName = "disconnected";
	protected AbstractJClass swaggerItf;
	public JDefinedClass swaggerCOClass;
	public JDefinedClass swaggerDCClass;

	private AbstractJClass propertiesType;

	public AbstractJClass propertiesType() {
		return propertiesType;
	}

	public ClassBridge(JCodeModel cm, Swagger swagger, CompilerOptions options) {
		this.cm = cm;
		this.swagger = swagger;
		this.options = options;
		rootPackage = SwaggerCompiler.class.getPackage().getName() + ".compiled";

		try {
			swaggerItf = (AbstractJClass) cm._ref(ITransfer.class);

			swaggerDCClass = cm._class(rootPackage + "." + "G_IDCAccess", EClassType.INTERFACE)._extends(swaggerItf);
			swaggerDCClass.javadoc().add("interface to access the ESI without an account.<br />"
					+ "This gives access to static data, eg items, markets, etc.");

			swaggerCOClass = cm._class(rootPackage + "." + "G_ICOAccess", EClassType.INTERFACE)._extends(swaggerItf);
			swaggerCOClass.javadoc().add("interface to access the ESI with a connected account.<br />"
					+ "This typically gives access to the character information, corporation, etc.");

		} catch (JClassAlreadyExistsException e) {
			throw new UnsupportedOperationException("catch this", e);
		}

		propertiesType = cm.ref(Map.class).narrow(cm.ref(String.class), cm.ref(String.class));
		createSwaggerCalls();

		responsePackage = cm._package(rootPackage + "." + responsesPackageName);
		definitionsPackage = cm._package(rootPackage + "." + definitionsPackageName);
		structurePackage = cm._package(rootPackage + "." + structuresPackageName);
		keyPackage = cm._package(rootPackage + "." + keysPackageName);
		connectedPackage = cm._package(rootPackage + "." + connectedPackageName);
		disconnectedPackage = cm._package(rootPackage + "." + disconnectedPackageName);

		// create the classes in the definitions

		for (Entry<String, Model> def : swagger.getDefinitions().entrySet()) {
			addDefinition(def.getKey(), def.getValue());
		}

		// first pass to fetch all the responses
		for (Path path : swagger.getPaths().values()) {
			addResponseType(SwaggerCompiler.getResponse(path.getGet()));
			addResponseType(SwaggerCompiler.getResponse(path.getPost()));
		}
		// then we merge all response types that have same structure.
		// this makes a map of renames
		mergeResponseTypes();
	}

	private HashMap<String, AbstractJType> definitions = new HashMap<>();

	private void addDefinition(String name, Model m) {
		if(m.getClass()==ArrayModel.class) {
			definitions.put(name, translateToClass(((ArrayModel) m).getItems(), definitionsPackage, name));
		} else if (m.getClass() == ModelImpl.class) {
			ModelImpl mi = (ModelImpl) m;
			if (mi.getAdditionalProperties() != null) {
				throw new UnsupportedOperationException("handle here");
			} else if (mi.getProperties() != null) {
				// object description
				// TODO
				// registerOPType(m.getTitle(), mi.getProperties());
			} else {
				throw new UnsupportedOperationException("handle here");
			}
		} else {
			throw new UnsupportedOperationException("can't add definition for name "+name+" and model class "+m.getClass());
		}
	}

	protected void createSwaggerCalls() {
		Set<String> allScopes = swagger.getPaths().values().stream().flatMap(p -> p.getOperations().stream())
				.filter(ope -> ope.getSecurity() != null).flatMap(ope -> ope.getSecurity().stream())
				.flatMap(m -> m.values().stream()).flatMap(l -> l.stream()).collect(Collectors.toSet());
		JFieldVar scopesField = swaggerCOClass.field(JMod.PUBLIC | JMod.STATIC | JMod.FINAL, cm.ref(String[].class),
				"SCOPES");
		JArray scopesinit = JExpr.newArray(cm.ref(String.class));
		for (String scope : allScopes) {
			scopesinit.add(JExpr.lit(scope));
		}
		scopesField.init(scopesinit);
	}

	////
	// response merging. Some responses have same structure, we merge them in a
	// first pass
	////

	protected HashMap<Map<String, String>, Set<String>> responseStructures = new HashMap<>();

	protected void addResponseType(Response r) {
		if (r == null || r.getResponseSchema() == null) {
			return;
		}
		Model m = r.getResponseSchema();
		// according to the type of response we have
		if (m.getClass() == ModelImpl.class) {
			ModelImpl mi = (ModelImpl) m;
			if (mi.getAdditionalProperties() != null) {
				// map string > additionalproperties
				registerPropertyType(m.getTitle(), mi.getAdditionalProperties());
			} else if (mi.getProperties() != null) {
				// object description
				registerOPType(m.getTitle(), mi.getProperties());
			} else {
				// format represents the type. simple types are already added.
			}
		} else if (m.getClass() == ArrayModel.class) {
			ArrayModel am = (ArrayModel) m;
			registerPropertyType(am.getItems().getTitle(), am.getItems());
		} else if (m.getClass() == RefModel.class) {
			// do nothing : response ref are created by the bridge
		} else {
			throw new UnsupportedOperationException("can't load model class " + m.getClass());
		}
	}

	protected void registerPropertyType(String name, Property prop) {
		ObjectProperty op = SwaggerCompiler.getPropertyObject(prop);
		if (op != null) {
			for (Property subprop : op.getProperties().values()) {
				if (subprop != null) {
					registerPropertyType(subprop.getTitle(), subprop);
				}
			}
			registerOPType(name, op.getProperties());
		}
	}

	protected void registerOPType(String name, Map<String, Property> structure) {
		Map<String, String> classDef = structure.entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, e -> propertyTypeExtended(e.getValue())));
		Set<String> set = responseStructures.get(classDef);
		if (set == null) {
			set = new HashSet<>();
			responseStructures.put(classDef, set);
		}
		set.add(name);
	}

	protected static String propertyTypeExtended(Property structure) {
		String ret = structure.getType();// + (structure.getFormat() != null ? "(" +
		// structure.getFormat() + ")" : "");
		if (structure instanceof StringProperty) {
			List<String> enums = ((StringProperty) structure).getEnum();
			if (enums != null) {
				enums = new ArrayList<>(enums);
				Collections.sort(enums);
				ret += enums;
			}
		}
		return ret;
	}

	protected HashMap<String, String> structureRenames = new HashMap<>();

	protected void mergeResponseTypes() {
		for (Entry<Map<String, String>, Set<String>> e : responseStructures.entrySet()) {
			String newName = mergeClassesNames(e.getKey(), e.getValue());
			for (String oldName : e.getValue()) {
				structureRenames.put(oldName, newName);
			}
		}
	}

	/**
	 * try find a common name for several classes that have same structure.
	 * <p>
	 * first try to use common parts.<br />
	 * ex R_get_bla_bli and R_get_bla_blo will result in R_get_bla.
	 * </p>
	 * <p>
	 * then if too small, add in the structure of the class<br />
	 * ex {i:int j:char} will be translated in iint_jchar and appended to the
	 * name.
	 * </p>
	 *
	 * @param classDef
	 *          the structural definition of the classes
	 * @param names
	 *          the list of names of classes that have this structure
	 * @return the common name to use
	 */
	protected String mergeClassesNames(Map<String, String> classDef, Set<String> names) {
		if (names.size() == 1) {
			return ("R_" + names.iterator().next()).replaceAll("_ok", "").replaceAll("_[0-9]+", "");
		}
		ArrayList<String> tokens = new ArrayList<>(Arrays.asList(names.iterator().next().split("_")));
		for (String name : names) {
			tokens.retainAll(Arrays.asList(name.split("_")));
		}
		tokens.removeIf(s -> s.equals("id") || s.equals("R") || s.equals("ok") || s.matches("^[0-9]+$"));
		tokens.add(0, "M");
		tokens.add("" + classDef.size());
		String common = tokens.stream().collect(Collectors.joining("_"));
		if (tokens.size() < 3) {
			common += "_" + classDef.entrySet().stream().map(e -> e.getKey() + e.getValue()).collect(Collectors.joining("_"));
		}
		logger.debug("merging " + names + " into " + common);
		return common;
	}

	////
	// translate swagger properties to class
	////

	/**
	 * translate a property into a JClass . Create it if needed, return any
	 * already created if exists.
	 *
	 * @param p
	 *          The property to transform
	 * @param pck
	 *          the package to create the new class into
	 * @param name
	 *          the new name of the class
	 * @return
	 */
	public AbstractJType translateToClass(Property p, JPackage pck, String name) {
		AbstractJType ret = getExistingClass(p.getType(), name, p.getFormat(),
				p instanceof StringProperty ? ((StringProperty) p).getEnum() : null);
		if (ret != null) {
			return ret;
		}
		switch (p.getType()) {
		case ObjectProperty.TYPE:
			// TODO check if mapproperty
			return translateToClass((ObjectProperty) p, pck, name);
		case ArrayProperty.TYPE:
			return translateToClass((ArrayProperty) p, pck, name);
		case RefProperty.TYPE:
			return definitions.get(((RefProperty) p).get$ref());
		default:
			throw new UnsupportedOperationException("case not handled " + p.getType());
		}
	}

	public AbstractJType getExistingClass(String type, String name, String format, List<String> enums) {
		switch (type) {
		case IntegerProperty.TYPE:
			if (format == null) {
				return cm.LONG;
			}
			switch (format) {
			case LongProperty.FORMAT:
				return cm.LONG;
			case IntegerProperty.FORMAT:
				return cm.INT;
			default:
				throw new UnsupportedOperationException("can't translate property name " + name + " with format " + format);
			}
		case BooleanProperty.TYPE:
			return cm.BOOLEAN;
		case StringProperty.TYPE:
			if (enums != null && !enums.isEmpty()) {
				return getStringEnum(name, enums);
			}
			return cm.ref(String.class);
		case DecimalProperty.TYPE:
			switch (format) {
			case FloatProperty.FORMAT:
				return cm.FLOAT;
			default:
				return cm.DOUBLE;
			}
		}
		JDefinedClass created = cm._getClass(type);
		if (created != null) {
			return created;
		}
		return null;
	}

	protected AbstractJType getStringEnum(String name, List<String> enums) {
		JDefinedClass ret = null;
		try {
			ret = structurePackage._enum(JMod.PUBLIC, name);
			JFieldVar toStringf = ret.field(JMod.PUBLIC | JMod.FINAL, cm.ref(String.class), "toString");
			JMethod constr = ret.constructor(0);
			JVar toStringp = constr.param(cm.ref(String.class), "toString");
			constr.body().assign(JExpr.refthis(toStringf), toStringp);
			JMethod toStringm = ret.method(JMod.PUBLIC, cm.ref(String.class), "toString");
			toStringm.body()._return(toStringf);
			toStringm.annotate(Override.class);
			for (String s : enums) {
				JEnumConstant enumcst = ret.enumConstant(sanitizeEnumName(s)).arg(JExpr.lit(s));
				enumcst.annotate(JsonProperty.class).param("value", s);
			}
			// logger.info("created enum " + name + " with values " + enums);
			return ret;
		} catch (JClassAlreadyExistsException e) {
			// logger.info("can't recreate enum " + name + " with values " + enums);
			for (JDefinedClass cl : structurePackage.classes()) {
				if (cl.name().equals(name)) {
					return cl;
				}
			}
			return null;
		}
	}

	/** java keywords we can't use as a name */
	public static final Set<String> keywords = Collections.unmodifiableSet(new HashSet<>(
			Arrays.asList("abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
					"continue", "default", "do", "double", "else", "extends", "false", "final", "finally", "float", "for", "goto",
					"if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package",
					"private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized",
					"this", "throw", "throws", "transient", "true", "try", "void", "volatile", "while")));

	public static String sanitizeEnumName(String s) {
		if (keywords.contains(s)) {
			return "_" + s;
		}
		String ret = s.replaceAll("[- #]", "_");
		if (ret.matches("^[0-9].*")) {
			ret = "_" + ret;
		}
		return ret;
	}

	public AbstractJType getExistingClass(ArrayModel model) {
		return translateToClass(model.getItems(), structurePackage, model.getTitle()).array();
	}

	public AbstractJType getExistingClass(QueryParameter pp) {
		if (pp.getType().equals(ArrayProperty.TYPE)) {
			return getExistingClass(pp.getItems()).array();
		} else {
			AbstractJType type = getExistingClass(pp.getType(), pp.getName(), pp.getFormat(), pp.getEnum());
			if (type != null && !pp.getRequired() && type.isPrimitive()) {
				type = type.boxify();
			}
			return type;
		}
	}

	public AbstractJType getExistingClass(Property pp) {
		if (pp.getType().equals(ArrayProperty.TYPE)) {
			ArrayProperty ap = (ArrayProperty) pp;
			return getExistingClass(ap.getItems()).array();
		} else {
			return getExistingClass(pp.getType(), pp.getName(), pp.getFormat(), null);
		}
	}

	protected HashMap<Map<String, String>, JDefinedClass> createdClasses = new HashMap<>();

	protected JDefinedClass translateToClass(ObjectProperty p, JPackage pck, String name) {
		Map<String, String> classDef = p.getProperties().entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, e -> propertyTypeExtended(e.getValue())));
		JDefinedClass createdClass = createdClasses.get(classDef);
		if (createdClass != null) {
			return createdClass;
		}
		try {
			JDefinedClass cl = pck._class(name.replaceAll("_ok", ""));
			for (Entry<String, Property> e : p.getProperties().entrySet()) {
				Property prop = e.getValue();
				JFieldVar field = cl.field(JMod.PUBLIC,
						translateToClass(prop, pck, structureRenames.getOrDefault(prop.getTitle(), prop.getTitle())), e.getKey());
				field.javadoc().add(prop.getDescription());
			}
			createEquals(cl);
			createHashCode(cl);
			createdClasses.put(classDef, cl);
			return cl;
		} catch (JClassAlreadyExistsException e) {
			throw new UnsupportedOperationException("catch this", e);
		}
	}

	public void createEquals(JDefinedClass cl) {

		JMethod eqmeth = cl.method(JMod.PUBLIC, cm.BOOLEAN, "equals");
		JVar eqOther = eqmeth.param(cm.ref(Object.class), "other");
		eqmeth.annotate(Override.class);
		// if(other==this) return true;
		eqmeth.body()._if(eqOther.eq(JExpr._this()))._then()._return(JExpr.TRUE);
		// if (other==null || other.getClass!=getClass()) return false;
		eqmeth.body()._if(eqOther.eqNull().cor(eqOther.invoke("getClass").ne(JExpr.invoke("getClass"))))._then()
		._return(JExpr.FALSE);
		JVar eqOtherSame = eqmeth.body().decl(cl, "othersame").init(JExpr.cast(cl, eqOther));

		for (JFieldVar field : cl.fields().values()) {
			JFieldRef otherfield = eqOtherSame.ref(field);
			if (field.type().isPrimitive()) {
				eqmeth.body()._if(field.ne(otherfield))._then()._return(JExpr.FALSE);
			} else {
				eqmeth.body()._if(
						// field!=otherfield
						field.ne(otherfield)
						// && field==null
						.cand(field.eqNull()
								// || !field.equals(otherfield)
								.cor(field.invoke("equals").arg(otherfield).not())))
				._then()._return(JExpr.FALSE);
			}
		}

		eqmeth.body()._return(JExpr.TRUE);
	}

	public void createHashCode(JDefinedClass cl) {
		JMethod hashmeth = cl.method(JMod.PUBLIC, cm.INT, "hashCode");
		IJExpression ret = null;
		for (JFieldVar field : cl.fields().values()) {
			IJExpression newret = null;
			if (field.type().isPrimitive()) {
				newret = field;
				if (field.type() == cm.DOUBLE || field.type() == cm.FLOAT) {
					// Double.hashCode(field)
					newret = cm.ref(Double.class).staticInvoke("hashCode").arg(field);
				} else {
					if (field.type() == cm.BOOLEAN) {
						newret = cm.ref(Boolean.class).staticInvoke("hashCode").arg(field);
					} else if (field.type() == cm.LONG) {
						newret = cm.ref(Long.class).staticInvoke("hashCode").arg(field);
					}
				}
			} else {
				newret = JExpr.cond(field.eqNull(), JExpr.lit(0), field.invoke("hashCode"));
			}
			ret = ret == null ? newret : ret.plus(newret);
		}
		hashmeth.body()._return(ret);
	}

	protected AbstractJClass translateToClass(ArrayProperty p, JPackage pck, String name) {
		AbstractJType arraCl = translateToClass(p.getItems(), pck, name);
		return arraCl.array();
	}

	/**
	 * translate a property into a response class.
	 *
	 * @param s
	 * @return
	 */
	public AbstractJType getReponseClass(Property s) {
		if (s == null) {
			return cm.VOID;
		} else {
			String className = structureRenames.getOrDefault(s.getTitle(), s.getTitle());
			if (className == null) {
				System.err.println("null name for " + s + " with title " + s.getTitle());
			}
			return translateToClass(s, responsePackage, className);
		}
	}
}