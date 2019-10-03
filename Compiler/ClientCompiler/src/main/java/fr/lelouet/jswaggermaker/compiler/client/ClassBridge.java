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
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.impl.securities.APIKey;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Disconnected;
import fr.lelouet.jswaggermaker.client.common.impl.securities.Oauth2;
import io.swagger.models.Model;
import io.swagger.models.Swagger;
import io.swagger.models.auth.ApiKeyAuthDefinition;
import io.swagger.models.auth.In;
import io.swagger.models.auth.OAuth2Definition;
import io.swagger.models.auth.SecuritySchemeDefinition;
import io.swagger.models.parameters.HeaderParameter;
import io.swagger.models.parameters.QueryParameter;
import io.swagger.models.properties.ArrayProperty;
import io.swagger.models.properties.BooleanProperty;
import io.swagger.models.properties.ComposedProperty;
import io.swagger.models.properties.DecimalProperty;
import io.swagger.models.properties.FloatProperty;
import io.swagger.models.properties.IntegerProperty;
import io.swagger.models.properties.LongProperty;
import io.swagger.models.properties.MapProperty;
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
			rootPackage = pckg(options.pckg);
		} else {
			rootPackage = pckg(swagger.getHost());
		}

		propertiesType = cm.ref(HashMap.class).narrow(cm.ref(String.class), cm.ref(String.class));

		responsePackage = subPckg(rootPackage, responsesPackageName);
		definitionsPackage = subPckg(rootPackage, definitionsPackageName);
		structurePackage = subPckg(rootPackage, structuresPackageName);
		keyPackage = subPckg(rootPackage, keysPackageName);
		connectedPackage = subPckg(rootPackage, connectedPackageName);
		disconnectedPackage = subPckg(rootPackage, disconnectedPackageName);

	}

	private JDefinedClass swaggerDCClass;

	private HashMap<String, JDefinedClass> singleSecurityClasses = new HashMap<>();

	/**
	 * get the class that is accessible through the fetcher for given security,
	 * and following given subpaths.
	 *
	 * @param security
	 * @param subPaths
	 * @return
	 */
	public JDefinedClass getFetcherClass(String securityName, List<String> subPaths) {
		logger.trace("getting fetcher for security " + securityName + " for subpaths " + subPaths);
		JDefinedClass fetcherclass = getFetcherClass(securityName);
		JDefinedClass theclass = fetcherclass;
		for (String subPath : subPaths) {
			String fieldAccess = makeJavaIdentifier(subPath);
			JFieldVar subField = theclass.fields().get(fieldAccess);
			if (subField == null) {
				JPackage subpck = subPckg(theclass._package(), theclass.name());
				JDefinedClass subclass = createDelegateTransfer(subpck, subPath, fetcherclass);
				JFieldVar thefield = theclass.field(JMod.PUBLIC | JMod.FINAL, subclass, fieldAccess);
				if (fetcherclass == theclass) {
					// we are in a security class : init the field with the security as
					// delegate
					thefield.init(subclass._new().arg(JExpr._this()));
				} else {
					// we are in a sub class field : init the field in the constructor.
					JMethod constructor = theclass.constructors().next();
					constructor.body().add(JExpr.assign(thefield, subclass._new().arg(JExpr.direct("delegate"))));
				}
				theclass = subclass;
			} else {
				theclass = (JDefinedClass) subField.type();
			}
		}
		return theclass;
	}

	/**
	 * create a new {@link DelegateTransfer} class in given package with given
	 * name. create a constructor that takes a specific "transfer" class as
	 * parameter and call super with that transfer. This transfer class will be
	 * delegated the global parameters and the http requests.
	 *
	 * @param pck
	 *          package in which we crate the class.
	 * @param name
	 *          name of the class
	 * @param transfer
	 *          the root delegate that this class delegates calls to.
	 * @return an existing class, if exists, or a newly created one.
	 */
	protected JDefinedClass createDelegateTransfer(JPackage pck, String name, JDefinedClass transfer) {
		String className = makeJavaTypeIdentifier(name);
		try {
			JDefinedClass subclass = pck._class(JMod.PUBLIC, className);
			subclass._extends(cm.ref(DelegateTransfer.class).narrow(transfer));
			JMethod construct = subclass.constructor(JMod.PUBLIC);
			JVar delegate = construct.param(transfer, "delegate");
			construct.body().add(JExpr.invokeSuper().arg(delegate));
			return subclass;
		} catch (JClassAlreadyExistsException e) {
			return pck.classes().stream().filter(cl -> cl.name().equals(className)).findFirst().get();
		}
	}

	/** create if needed, and return, a class for given security and path */
	public JDefinedClass getFetcherClass(String securityName) {
		if (securityName == null) {
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
			JDefinedClass ret = singleSecurityClasses.get(securityName);
			if (ret == null) {
				synchronized (singleSecurityClasses) {
					ret = singleSecurityClasses.get(securityName);
					if (ret == null) {
						ret = makeClassForSecurity(securityName);
						singleSecurityClasses.put(securityName, ret);
					}
				}
			}
			return ret;
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

			JDefinedClass ret = rootPackage._class(makeJavaTypeIdentifier(secName))._extends(parent);
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
							name = parentConsNameReplace[i];
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
		logger.trace("merging " + names + " into " + common);
		return common;
	}

	////
	// translate swagger properties to class
	////

	public AbstractJType translateToClass(Model m, JPackage pck) {
		if (m == null) {
			return cm.VOID;
		}
		logger.trace("translate to class model=" + m + " title=" + m.getTitle() + " modelclass="
				+ m.getClass().getSimpleName() + " package=" + (pck == null ? null : pck.name()));
		return translateToClass(new PropertyModelConverter().modelToProperty(m), pck, m.getTitle());
	}

	/**
	 * translate a property into a JClass . Create it if needed, return any
	 * already created if exists.
	 *
	 * @param p
	 *          The property to transform
	 * @param pck
	 *          the package to create the new class into, if required
	 * @param name
	 *          the new name of the class to create, if required and can' be
	 *          deduced
	 * @return
	 */
	public AbstractJType translateToClass(Property p, JPackage pck, String name) {
		logger.trace("translatetoclass name=" + name + " package=" + (pck == null ? null : pck.name()) + " prop.type="
				+ (p == null ? null : p.getType()) + " prop.title=" + (p == null ? null : p.getTitle()));
		if (p == null) {
			logger.warn("return object for property null, name=" + name);
			return cm.ref(Object.class);
		}
		AbstractJType ret = getExistingClass(p.getType(), name, p.getFormat(),
				p instanceof StringProperty ? ((StringProperty) p).getEnum() : null);
		if (ret != null) {
			return ret;
		}

		switch (p.getType()) {
		case ObjectProperty.TYPE:
			if (p.getClass() == MapProperty.class) {
				return translateToClass((MapProperty) p, pck, name);
			} else if (p.getClass() == ComposedProperty.class) {
				return translateToClass((ComposedProperty) p, pck, name);
			} else {
				ObjectProperty op = (ObjectProperty) p;
				if (op.getProperties() == null || op.getProperties().isEmpty()) {
					return cm._ref(Object.class);
				}
				return translateToClass(op, pck, name);
			}
		case ArrayProperty.TYPE:
			return translateToClass((ArrayProperty) p, pck, name);
		case RefProperty.TYPE:
			return translateDefToClass(((RefProperty) p).getSimpleRef());
		default:
			throw new UnsupportedOperationException("case not handled " + p.getType());
		}
	}

	public AbstractJType getExistingClass(String type, String name, String format, List<String> enums) {
		logger.trace("get existing class type=" + type + " name=" + name + " format=" + format + " enums=" + enums);
		if (type == null) {
			return cm.ref(Object.class);
		}
		switch (type) {
		case IntegerProperty.TYPE:
			if (format == null) {
				return cm.LONG;
			}
			switch (format) {
			case LongProperty.FORMAT:
			case "uint32":
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
			if (format == null) {
				return cm.DOUBLE;
			}
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
		logger.trace("create string enum " + name + " values " + enums);
		JDefinedClass ret = null;
		try {
			name = makeJavaIdentifier(name);
			ret = structurePackage._enum(JMod.PUBLIC, name);
			JFieldVar toStringf = ret.field(JMod.PUBLIC | JMod.FINAL, cm.ref(String.class), "toString");
			JMethod constr = ret.constructor(0);
			JVar toStringp = constr.param(cm.ref(String.class), "toString");
			constr.body().assign(JExpr.refthis(toStringf), toStringp);
			JMethod toStringm = ret.method(JMod.PUBLIC, cm.ref(String.class), "toString");
			toStringm.body()._return(toStringf);
			toStringm.annotate(Override.class);
			for (String s : enums) {
				JEnumConstant enumcst = ret.enumConstant(makeJavaIdentifier(s)).arg(JExpr.lit(s));
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

	/**
	 * java reserved keywords we can't use as a name
	 * https://docs.oracle.com/javase/specs/jls/se12/html/jls-3.html#jls-Identifier
	 */
	public static final Set<String> RESERVED_JAVA_KEYWORDS = Collections
			.unmodifiableSet(new HashSet<>(Arrays.asList("abstract", "assert", "boolean", "break", "byte", "case", "catch",
					"char", "class", "const", "continue", "default", "do", "double", "else", "extends", "final", "finally",
					"float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
					"new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
					"switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while", "_")));

	/**
	 * java literals we can't use as an identifier
	 * https://docs.oracle.com/javase/specs/jls/se12/html/jls-3.html#jls-Identifier
	 */
	public static final Set<String> RESERVED_JAVA_LITERALS = Collections
			.unmodifiableSet(new HashSet<>(Arrays.asList("false", "null", "true")));

	/**
	 * names that java does not specifically allow as a class name
	 * https://docs.oracle.com/javase/specs/jls/se12/html/jls-3.html#jls-3.8
	 */
	public static final Set<String> FORBIDDEN_CLASS_NAMES = Collections
			.unmodifiableSet(new HashSet<>(Arrays.asList("var")));

	public static final Pattern VALID_IDENTIFIER_NAME = Pattern.compile("[A-Za-z_][A-Za-z0-9_]*");

	/**
	 * make a correct string to use for identifiers.
	 * <ol>
	 * <li>if it is a reserved keyword or a reserved literal, suffix it with
	 * underscore</li>
	 * <li>remove all the non-alphanum characters except underscore and
	 * dollar</li>
	 * <li>if starts with a number, prefix it with underscore</li> </om>
	 *
	 * @param s
	 * @return
	 */
	public static String makeJavaIdentifier(String s) {
		if (RESERVED_JAVA_KEYWORDS.contains(s) || RESERVED_JAVA_LITERALS.contains(s)) {
			s = s + "_";
		}
		String ret = s.replaceAll("[^A-Za-z0-9$_]", "_");
		if (ret.matches("^[0-9].*")) {
			ret = "_" + ret;
		}
		return ret;
	}

	/**
	 * cache of the java classes names we now or not if they are in the java.lang
	 * package.
	 */
	private static final HashMap<String, Boolean> resolvedJavaLangNames = new HashMap<>();

	/**
	 * check if a name already represents a class in the java.lang package. eg
	 * String should return true, but LeetH4X0R should not.
	 *
	 * @param className
	 *          name to test
	 * @return the existence of such a class in the java.lang (cached)
	 */
	public static boolean isJavaLangClass(String className) {
		if (resolvedJavaLangNames.containsKey(className)) {
			return resolvedJavaLangNames.get(className);
		}
		boolean isJavaLang = true;
		try {
			Class.forName("java.lang." + className);
		} catch (Exception e) {
			isJavaLang = false;
		}
		resolvedJavaLangNames.put(className, isJavaLang);
		return isJavaLang;
	}

	/**
	 * Make a correct string for use of Type identifier (class name)
	 * <ol>
	 * <li>split the name by underscore, hyphen, space and uppercase the first
	 * character of each token : my-b becomes MyB</li>
	 * <li>suffix with underscore if the name is a forbidden type identifier</li>
	 * <li>sanitize the identifier to remove all non-alphanum characters and be
	 * sure the name is correct.</li>
	 * </ol>
	 *
	 * @param s
	 *          the name for the class, excludingthe package. Eg MyClass, or
	 *          1337Class or idontknowwhatnametochoose.
	 * @return
	 */
	public static String makeJavaTypeIdentifier(String s) {
		if (s == null) {
			return s;
		}
		String ret = Stream.of(s.split("[ _-]")).filter(str -> str.length() > 0).map(str -> camelcase(str))
				.collect(Collectors.joining());
		if (FORBIDDEN_CLASS_NAMES.contains(ret) || isJavaLangClass(ret)) {
			ret = ret + "_";
		}
		return makeJavaIdentifier(ret);
	}

	/**
	 * make a package name correct. for each token of the path, sanitize the
	 * token.
	 *
	 * @see https://docs.oracle.com/javase/tutorial/java/package/namingpkgs.html
	 * @param name
	 *          a full package name, including the dots or not. eg com.integer.123
	 *          or simply 123.
	 * @return the name of the package, ensured to be correct for java class.
	 */
	public static String makeJavaPackage(String name) {
		if (name == null) {
			return name;
		}
		List<String> sb = new ArrayList<>();
		for (String s : name.split("\\.")) {
			sb.add(makeJavaIdentifier(s.toLowerCase()));
		}
		return sb.stream().collect(Collectors.joining("."));
	}

	public static String camelcase(String token) {
		if (token == null) {
			return null;
		}
		if (token.length() < 2) {
			return token.toUpperCase();
		}
		return token.substring(0, 1).toUpperCase() + token.substring(1, token.length());
	}

	/**
	 * create a package from the /. The package name is normalized to be
	 * java-compliant
	 *
	 * @param packageName
	 *          name of the package, eg in.my.ass
	 * @return a correct java package.
	 */
	public JPackage pckg(String packageName) {
		return cm._package(makeJavaPackage(packageName));
	}

	/**
	 * create a child package in another one . The subpath is normalized to be
	 * java-compliant
	 *
	 * @param root
	 *          the root package to which append the child, eg "in.your"
	 * @param packageName
	 *          the sub path, eg "1337.Brain!"
	 * @return a correct java subpackage, in this case "in.your._1337.brain_"
	 */
	public JPackage subPckg(JPackage root, String packageName) {
		return root.subPackage(makeJavaPackage(packageName));
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

	protected AbstractJType translateToClass(ObjectProperty p, JPackage pck, String name) {
		logger.trace("translate objectproperty name=" + name + " objectproperty=" + p.getProperties());
		Map<String, String> classDef = p.getProperties().entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, e -> propertyTypeEnumerated(e.getValue())));
		JDefinedClass createdClass = createdClasses.get(classDef);
		if (createdClass != null) {
			return createdClass;
		}
		if (name == null || pck == null) {
			logger.warn("returning Object for class creation pck=" + (pck == null ? null : pck.name()) + " name=" + name
					+ " propertyclass=" + (p == null ? null : p.getClass()));
			return cm._ref(Object.class);
		}
		try {
			JDefinedClass cl = pck._class(makeJavaTypeIdentifier(name.replaceAll("_ok", "")));
			createdClasses.put(classDef, cl);
			makeClass(cl, p);
			return cl;
		} catch (JClassAlreadyExistsException e) {
			throw new UnsupportedOperationException("already exists " + e.getExistingClass().fullName(), e);
		}
	}

	/**
	 * create the fields, the equal and hashcode methods, in a class
	 *
	 * @param tobuild
	 * @param prop
	 */
	protected void makeClass(JDefinedClass cl, Property property) {
		createFields(cl, property);
		createEquals(cl);
		createHashCode(cl);
	}

	/**
	 * add the enumerations to a property typed String.
	 *
	 * @param structure
	 * @return
	 */
	public static String propertyTypeEnumerated(Property structure) {

		String ret = structure.getType();// + (structure.getFormat() != null ? "(" +
		// structure.getFormat() + ")" : "");
		if (ret == null) {
			return "object";
		}
		if (structure instanceof StringProperty) {
			List<String> enums = ((StringProperty) structure).getEnum();
			if (enums != null) {
				enums = new ArrayList<>(enums);
				Collections.sort(enums);
				ret += enums;
			}
		}
		logger.trace("structure=" + structure + " format=" + structure.getFormat() + " extended=" + ret);
		return ret;
	}

	protected AbstractJClass translateToClass(ArrayProperty p, JPackage pck, String name) {
		AbstractJType arraCl = translateToClass(p.getItems(), pck, name);
		return arraCl.array();
	}

	protected AbstractJClass translateToClass(MapProperty mp, JPackage pck, String name) {
		logger.trace("translate mapproperty map=" + mp + " pck=" + pck + " name=" + name);
		AbstractJType valueType = translateToClass(mp.getAdditionalProperties(), pck, null);
		return cm.ref(Map.class).narrow(String.class).narrow(valueType);
	}

	/** cache of existing definitions */
	private HashMap<String, AbstractJType> definitions = new HashMap<>();

	/**
	 * get the type for a definition.
	 * <p>
	 * A big issue here is to handle recursive definitions : eg a linkedlist
	 * refers to itself, or a constraint specification can refer to an expression
	 * tree, that refers to constraints. For this reason, we first find the
	 * highest complex model we need, eg if it is an array of X we find X, we
	 * create the class for this X, we store the array of X as the type for that
	 * definition, and after that is stored, we create the fields in the class
	 * </p>
	 *
	 * @param defName
	 * @return
	 */
	protected AbstractJType translateDefToClass(String defName) {
		logger.trace("translate def " + defName);
		AbstractJType ret = definitions.get(defName);
		JDefinedClass tobuild = null;
		Property compilation = null;
		Model m = null;
		if (ret == null) {
			synchronized (definitions) {
				ret = definitions.get(defName);
				if (ret == null) {
					m = swagger.getDefinitions().get(defName);
					if (m == null) {
						throw new UnsupportedOperationException(
								"got no model for definition " + defName + " existing are " + swagger.getDefinitions().keySet());
					}
					PartiallyCompiled pc = partCompile(new PropertyModelConverter().modelToProperty(m), definitionsPackage,
							makeJavaTypeIdentifier(defName));
					ret = pc.returned;
					tobuild = pc.toCompile;
					compilation = pc.compilationProperties;
					definitions.put(defName, ret);
				}
			}
		}
		if (tobuild != null) {
			makeClass(tobuild, compilation);
		}
		return ret;
	}

	protected class PartiallyCompiled {
		public AbstractJType returned;
		public JDefinedClass toCompile;
		public Property compilationProperties;

		public PartiallyCompiled(AbstractJType returned) {
			this.returned = returned;
		}

		public PartiallyCompiled(AbstractJType returned, JDefinedClass toCompile, Property compilationProperties) {
			this.returned = returned;
			this.toCompile = toCompile;
			this.compilationProperties = compilationProperties;
		}

		/**
		 * replace the returned by an array of returned
		 *
		 * @return this
		 */
		public PartiallyCompiled inArray() {
			returned = returned.array();
			return this;
		}

		/**
		 * replace the reutnred by a hashmap from string to returned.
		 *
		 * @return this
		 */
		public PartiallyCompiled inMap() {
			returned = cm.ref(Map.class).narrow(String.class).narrow(returned);
			return this;
		}

	}

	/**
	 * translate a property as much as possible, with
	 *
	 * @param property
	 * @param pck
	 * @param defName
	 * @return
	 */
	protected PartiallyCompiled partCompile(Property property, JPackage pck, String definedClassName) {
		logger.trace("part compiling property=" + property + " package=" + pck.name());
		if (property == null) {
			return new PartiallyCompiled(cm.VOID);
		} else {
			if (property.getType() == null) {
				return new PartiallyCompiled(cm.ref(Object.class));
			}
			switch (property.getType()) {
			case ArrayProperty.TYPE:
				return partCompile(((ArrayProperty) property).getItems(), pck, definedClassName).inArray();
			case ObjectProperty.TYPE:
				if (property.getClass() == MapProperty.class) {
					return partCompile(((MapProperty) property).getAdditionalProperties(), pck, definedClassName).inMap();
				} else if (property.getClass() == ObjectProperty.class) {
					try {
						logger.trace("creating compilelater class name=" + definedClassName + " pck=" + pck.name() + " property="
								+ property);
						JDefinedClass newclass = pck._class(JMod.PUBLIC, definedClassName);
						return new PartiallyCompiled(newclass, newclass, property);
					} catch (JClassAlreadyExistsException e) {
						throw new UnsupportedOperationException("catch this", e);
					}
				} else {
					throw new UnsupportedOperationException("class of objectproperty not handled : " + property.getClass());
				}
			case StringProperty.TYPE:
			case IntegerProperty.TYPE:
			case BooleanProperty.TYPE:
			case DecimalProperty.TYPE:
				return new PartiallyCompiled(getExistingClass(property));
			case RefProperty.TYPE:
				return new PartiallyCompiled(translateDefToClass(((RefProperty) property).getSimpleRef()));
			default:
				throw new UnsupportedOperationException("property type " + property.getType() + " unsupported");
			}
		}
	}

	protected AbstractJType translateToClass(ComposedProperty rf, JPackage pck, String name) {
		if (rf.getAllOf() != null && !rf.getAllOf().isEmpty()) {
			return translateToClass(rf.getAllOf(), pck, name);
		}
		throw new UnsupportedOperationException("can't do " + rf);
	}

	private HashMap<Set<Property>, AbstractJType> composedTypes = new HashMap<>();

	protected AbstractJType translateToClass(List<Property> allOf, JPackage pck, String name) {
		logger.trace("creating merged item for class name " + name);

		JDefinedClass ret = cm._getClass(pck + "." + name);
		if (ret != null) {
			logger.trace("return existing class pck=" + pck.name() + " name=" + name);
			return ret;
		}
		HashSet<Property> allOfSet = new HashSet<>(allOf);
		// remove all the properties that don't add data (null and
		// untypedproperties)
		allOfSet.removeIf(p -> p == null || p.getType() == null);
		AbstractJType typeret = composedTypes.get(allOfSet);
		if (typeret != null) {
			logger.trace("return existing composite pck=" + pck.name() + " name=" + name + " allof=" + allOfSet);
			return typeret;
		} else {
			logger.trace("need to create composite type for pck=" + pck.name() + " name=" + name + " allof=" + allOfSet);
			logger.trace("existing composite are " + composedTypes);
		}
		// if only one type remains after removal of the useless ones, and this
		// property is a ref, use that ref instead
		if (allOfSet.size() == 1) {
			Property prop = allOfSet.iterator().next();
			if (prop.getType() == RefProperty.TYPE) {
				String refName = ((RefProperty) prop).getSimpleRef();
				typeret = translateDefToClass(refName);
				logger.trace("replaced one-ref composite type name=" + name + " wiith reference type=" + typeret);
				composedTypes.put(allOfSet, typeret);
				return typeret;
			}
		}
		try {
			ret = cm._class(JMod.PUBLIC, pck.name() + "." + name);
			logger.trace("created class for composite " + allOfSet);
		} catch (JClassAlreadyExistsException e) {
			throw new UnsupportedOperationException("catch this", e);
		}
		composedTypes.put(allOfSet, ret);
		for (Property prop : allOf) {
			createFields(ret, prop);
		}
		createEquals(ret);
		createHashCode(ret);
		return ret;
	}

	/**
	 * create the fields in a class, following a property. If the property is
	 * array, or map type, throws an exception
	 */
	public void createFields(JDefinedClass cl, Property property) {
		logger.trace("create fields in class=" + cl + " prop=" + property);
		// if it is a ref, we get the property of the ref and recursively call it
		if (property.getType() == null) {
			logger.trace("got untyped property name=" + property.getName() + " desc=" + property.getDescription() + " format="
					+ property.getFormat());
		} else if (property.getType().equals(RefProperty.TYPE)) {
			RefProperty rp = (RefProperty) property;
			Model refModel = swagger.getDefinitions().get(rp.getSimpleRef());
			if (refModel == null) {
				throw new UnsupportedOperationException(
						"got no model for definition " + rp.getSimpleRef() + " existing are " + swagger.getDefinitions().keySet());
			}
			createFields(cl, new PropertyModelConverter().modelToProperty(refModel));
		} else if (property.getType().equals(ObjectProperty.TYPE)) {
			ObjectProperty p = (ObjectProperty) property;
			if (p.getProperties() != null) {
				for (Entry<String, Property> e : p.getProperties().entrySet()) {
					String propName = e.getKey();
					logger.trace("making field for property " + propName);
					String propFieldName = makeJavaIdentifier(propName);
					Property prop = e.getValue();
					String propClassName = makeJavaTypeIdentifier(prop.getTitle() == null ? propFieldName : prop.getTitle());
					AbstractJType type = translateToClass(prop, subPckg(cl.getPackage(), cl.name()), propClassName);
					logger.trace("call field for name=" + e.getKey() + " type=" + type);
					JFieldVar field = cl.field(JMod.PUBLIC, type, propFieldName);
					field.javadoc().add(prop.getDescription());
					if (!propFieldName.equals(propName)) {
						field.annotate(JsonProperty.class).param("value", propName);
					}
				}
			}
		} else {
			throw new UnsupportedOperationException("can't create class data from property class " + property.getClass());
		}

	}

	public void createEquals(JDefinedClass cl) {
		if (cl.fields().isEmpty()) {
			return;
		}
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
		if (cl.fields().isEmpty()) {
			return;
		}
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
		String fieldName = makeJavaIdentifier(name);
		JFieldVar ret = fetcherClass.fields().get(fieldName);
		if (ret == null) {
			ret = fetcherClass.field(JMod.PUBLIC, pt, fieldName);
			ret.javadoc().add(description);
		}
		return ret;
	}
}
