package fr.lelouet.jswaggermaker.compiler.client;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
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
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.JArray;
import com.helger.jcodemodel.JClassAlreadyExistsException;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JEnumConstant;
import com.helger.jcodemodel.JExpr;
import com.helger.jcodemodel.JFieldRef;
import com.helger.jcodemodel.JFieldVar;
import com.helger.jcodemodel.JInvocation;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMod;
import com.helger.jcodemodel.JPackage;
import com.helger.jcodemodel.JVar;

import fr.lelouet.jswaggermaker.client.common.impl.ATransfer;
import fr.lelouet.jswaggermaker.client.common.impl.securities.APIKey;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Disconnected;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Oauth2;
import io.swagger.models.ArrayModel;
import io.swagger.models.Model;
import io.swagger.models.ModelImpl;
import io.swagger.models.RefModel;
import io.swagger.models.Swagger;
import io.swagger.models.auth.ApiKeyAuthDefinition;
import io.swagger.models.auth.In;
import io.swagger.models.auth.OAuth2Definition;
import io.swagger.models.auth.SecuritySchemeDefinition;
import io.swagger.models.parameters.HeaderParameter;
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
import io.swagger.models.utils.PropertyModelConverter;

/**
 * bridge between a {@link Swagger} and the classes we create in a
 * {@link JCodeModel}
 */
public class ClassBridge {

	private static final Logger logger = LoggerFactory.getLogger(ClassBridge.class);

	public final JCodeModel cm;
	public final Swagger swagger;
	public final CompilerOptions options;

	public JPackage rootPackage;
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


	private AbstractJClass propertiesType;

	public AbstractJClass propertiesType() {
		return propertiesType;
	}

	public ClassBridge(JCodeModel cm, Swagger swagger, CompilerOptions options) {
		this.cm = cm;
		this.swagger = swagger;
		this.options = options;
		if (options.pckg != null) {
			rootPackage = cm._package(options.pckg);
		} else {
			rootPackage = cm._package(swagger.getHost());
		}

		propertiesType = cm.ref(HashMap.class).narrow(cm.ref(String.class), cm.ref(String.class));

		responsePackage = rootPackage.subPackage(responsesPackageName);
		definitionsPackage = rootPackage.subPackage(definitionsPackageName);
		structurePackage = rootPackage.subPackage(structuresPackageName);
		keyPackage = rootPackage.subPackage(keysPackageName);
		connectedPackage = rootPackage.subPackage(connectedPackageName);
		disconnectedPackage = rootPackage.subPackage(disconnectedPackageName);

	}


	private JDefinedClass swaggerDCClass;

	private HashMap<String, JDefinedClass> singleSecurityClasses = new HashMap<>();

	public JDefinedClass getFetcherClass(Map<String, List<String>> security) {
		if (security == null || security.isEmpty()) {
			if (swaggerDCClass == null) {
				synchronized (this) {
					if (swaggerDCClass == null) {
						try {
							swaggerDCClass = rootPackage._class("Anonymous")._extends((AbstractJClass) cm._ref(Disconnected.class));
							swaggerDCClass.javadoc().add("access " + swagger.getHost() + " with no authorization.");
						} catch (JClassAlreadyExistsException e) {
							throw new UnsupportedOperationException("catch this", e);
						}
					}
				}
			}
			return swaggerDCClass;
		} else {
			if (security.size() == 1) {
				Entry<String, List<String>> secEntry = security.entrySet().iterator().next();
				String secName = secEntry.getKey();
				JDefinedClass ret = singleSecurityClasses.get(secName);
				if (ret == null) {
					synchronized (singleSecurityClasses) {
						ret = singleSecurityClasses.get(secName);
						if (ret == null) {
							ret = makeClassForSecurity(secName);
							singleSecurityClasses.put(secName, ret);
						}
					}
				}
				return ret;
			}
			throw new UnsupportedOperationException("can't create security class for " + security);
		}
	}

	protected JDefinedClass makeClassForSecurity(String secName) {
		SecuritySchemeDefinition secDef = swagger.getSecurityDefinitions().get(secName);
		if (secDef == null) {
			throw new UnsupportedOperationException("can't find security definition for " + secName + " , existing are "
					+ swagger.getSecurityDefinitions().keySet());
		}
		/** the parent we inherit from */
		AbstractJClass parent = null;
		/** the super constructor to call */
		Constructor<? extends ATransfer> parentCons = null;
		/** possible replacements for the parameters of the parent constructor */
		IJExpression[] parentConsValueReplace = null;
		String[] parentConsNameReplace = null;
		switch (secDef.getType().toLowerCase()) {
		case "oauth2":
			parent = (AbstractJClass) cm._ref(Oauth2.class);
			try {
				parentCons = Oauth2.class.getConstructor(String.class, String.class, String.class);
				parentConsNameReplace = new String[] { "refreshToken", "basicAuth", null };
			} catch (NoSuchMethodException | SecurityException e1) {
				throw new UnsupportedOperationException("catch this", e1);
			}
			OAuth2Definition oauthDef = (OAuth2Definition) secDef;
			parentConsValueReplace = new IJExpression[] { null, null, JExpr.lit(oauthDef.getAuthorizationUrl()) };
			break;
		case "apikey":
			parent = (AbstractJClass) cm._ref(APIKey.class);
			try {
				parentCons = APIKey.class.getConstructor(String.class, String.class, In.class);
				parentConsNameReplace = new String[] { "key" };
			} catch (NoSuchMethodException | SecurityException e1) {
				throw new UnsupportedOperationException("catch this", e1);
			}
			ApiKeyAuthDefinition apikDef = (ApiKeyAuthDefinition) secDef;
			parentConsValueReplace = new IJExpression[] { null, JExpr.lit(apikDef.getName()),
					JExpr.enumConstantRef(cm.ref(In.class), apikDef.getIn().name()) };
			break;
		default:
			throw new UnsupportedOperationException("can't create class for security type " + secDef.getType());
		}
		try {
			JDefinedClass ret = rootPackage._class(secName)._extends(parent);
			ret.javadoc().add("access " + swagger.getHost() + " with authorization type " + secDef.getType() + ".");
			// if the parent class has a constructor to call, we create the same
			// constructor
			if (parentCons != null) {
				JMethod cons = ret.constructor(JMod.PUBLIC);
				JInvocation consbody = JInvocation._super();
				for (int i = 0; i < parentCons.getParameterCount(); i++) {
					if (parentConsValueReplace != null && i < parentConsValueReplace.length
							&& parentConsValueReplace[i] != null) {
						consbody.arg(parentConsValueReplace[i]);
					} else {
						Parameter p = parentCons.getParameters()[i];
						String name = p.getName();
						if (parentConsNameReplace != null && i < parentConsNameReplace.length && parentConsNameReplace[i] != null) {
							name= parentConsNameReplace[i];
						}
						consbody.arg(cons.param(p.getType(), name));
					}
				}
				cons.body().add(consbody);
			}
			Set<String> allScopes = swagger.getPaths().values().stream().flatMap(p -> p.getOperations().stream())
					.filter(ope -> ope.getSecurity() != null && !ope.getSecurity().isEmpty())
					.flatMap(ope -> ope.getSecurity().stream()).map(secs -> secs.get(secName)).filter(sec -> sec != null)
					.flatMap(l -> l.stream()).collect(Collectors.toSet());
			JFieldVar scopesField = ret.field(JMod.PUBLIC | JMod.STATIC | JMod.FINAL, cm.ref(String[].class), "SCOPES");
			JArray scopesinit = JExpr.newArray(cm.ref(String.class));
			for (String scope : allScopes) {
				scopesinit.add(JExpr.lit(scope));
			}
			scopesField.init(scopesinit);
			return ret;
		} catch (JClassAlreadyExistsException e) {
			throw new UnsupportedOperationException("catch this", e);
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
			return translateToClass((ObjectProperty) p, pck, name);
		case ArrayProperty.TYPE:
			return translateToClass((ArrayProperty) p, pck, name);
		case RefProperty.TYPE:
			return translateDefToClass(((RefProperty) p).getSimpleRef());
		default:
			throw new UnsupportedOperationException("case not handled " + p.getType());
		}
	}

	public AbstractJType getExistingClass(String type, String name, String format, List<String> enums) {
		// System.err.println("get existing class type=" + type + " name=" + name +
		// " format=" + format + " enums=" + enums);
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
		// System.err.println("create string enum " + name + " values " + enums);
		JDefinedClass ret = null;
		try {
			name = sanitizeVarName(name);
			ret = structurePackage._enum(JMod.PUBLIC, name);
			JFieldVar toStringf = ret.field(JMod.PUBLIC | JMod.FINAL, cm.ref(String.class), "toString");
			JMethod constr = ret.constructor(0);
			JVar toStringp = constr.param(cm.ref(String.class), "toString");
			constr.body().assign(JExpr.refthis(toStringf), toStringp);
			JMethod toStringm = ret.method(JMod.PUBLIC, cm.ref(String.class), "toString");
			toStringm.body()._return(toStringf);
			toStringm.annotate(Override.class);
			for (String s : enums) {
				JEnumConstant enumcst = ret.enumConstant(sanitizeVarName(s)).arg(JExpr.lit(s));
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

	public static String sanitizeVarName(String s) {
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

	public AbstractJType getExistingClass(HeaderParameter hp) {
		if (hp.getType().equals(ArrayProperty.TYPE)) {
			return getExistingClass(hp.getItems()).array();
		} else {
			AbstractJType type = getExistingClass(hp.getType(), hp.getName(), hp.getFormat(), hp.getEnum());
			if (type != null && !hp.getRequired() && type.isPrimitive()) {
				type = type.boxify();
			}
			if (type == null) {
				throw new NullPointerException("can't convert header parameters for type=" + hp.getType() + " name="
						+ hp.getName() + " format=" + hp.getFormat() + " enum=" + hp.getEnum());
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
		// System.err.println("translate to class " + name + " objectproperty=" +
		// p);
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
				String structName = prop.getTitle();
				if (structName == null) {
					structName = e.getKey().toUpperCase();
				}
				JFieldVar field = cl.field(JMod.PUBLIC, translateToClass(prop, pck, structName), e.getKey());
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

	public static String propertyTypeExtended(Property structure) {
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

	protected AbstractJClass translateToClass(ArrayProperty p, JPackage pck, String name) {
		AbstractJType arraCl = translateToClass(p.getItems(), pck, name);
		return arraCl.array();
	}

	/** cache of existing definitions */
	private HashMap<String, AbstractJType> definitions = new HashMap<>();

	protected AbstractJType translateDefToClass(String defName) {
		AbstractJType ret = definitions.get(defName);
		if (ret == null) {
			synchronized (definitions) {
				ret = definitions.get(defName);
				if (ret == null) {
					Model m = swagger.getDefinitions().get(defName);
					if (m == null) {
						throw new UnsupportedOperationException(
								"got no model for definition " + defName + " existing are " + swagger.getDefinitions().keySet());
					}
					ret = translateToClass(m, definitionsPackage, defName);
					definitions.put(defName, ret);
				}
			}
		}
		return ret;
	}

	public AbstractJType translateToClass(Model m, JPackage pck, String name) {
		if (m == null) {
			return cm.VOID;
		} else if (m.getClass() == ArrayModel.class) {
			Property s = ((ArrayModel) m).getItems();
			return translateToClass(s, pck, s.getTitle()).boxify().array();
		} else if (m.getClass() == ModelImpl.class) {
			ModelImpl mi = (ModelImpl) m;
			return translateToClass(mi, pck, name);
		} else if (m.getClass() == RefModel.class) {
			return translateToClass((RefModel) m, pck, name);
		} else {
			throw new UnsupportedOperationException("can't translate model class " + m.getClass());
		}
	}

	protected AbstractJType translateToClass(ModelImpl mi, JPackage pck, String name) {
		// System.err.println(" translating ModelImpl to class " + name);
		if (mi.getAdditionalProperties() != null) {
			Property s = mi.getAdditionalProperties();
			AbstractJType resourceFlatType = translateToClass(s, pck, s.getTitle());
			return cm.ref(Map.class).narrow(cm.ref(String.class), resourceFlatType.boxify());
		} else {
			Property s = new PropertyModelConverter().modelToProperty(mi);
			return translateToClass(s, pck, name);
		}
	}

	protected AbstractJType translateToClass(RefModel rf, JPackage pck, String name) {
		return translateDefToClass(rf.getSimpleRef());
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
			return translateToClass(s, responsePackage, s.getTitle());
		}
	}

	/** create a field or retrieve it in a class */
	public JVar getField(JDefinedClass fetcherClass, String name, AbstractJType pt, String description) {
		String fieldName = sanitizeVarName(name);
		JFieldVar ret = fetcherClass.fields().get(fieldName);
		if (ret == null) {
			ret = fetcherClass.field(JMod.PUBLIC, pt, fieldName);
			ret.javadoc().add(description);
		}
		return ret;
	}
}
