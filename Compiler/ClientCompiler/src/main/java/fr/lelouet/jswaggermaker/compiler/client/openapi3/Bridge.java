package fr.lelouet.jswaggermaker.compiler.client.openapi3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JPackage;

import fr.lelouet.jswaggermaker.compiler.client.CompilerOptions;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;

public class Bridge {

	public final JCodeModel cm;
	public final OpenAPI schema;
	public final CompilerOptions options;

	protected JPackage rootPackage;
	protected Server mainServer;

	public Bridge(JCodeModel cm, OpenAPI schema, CompilerOptions options) {
		this.cm = cm;
		this.schema = schema;
		this.options = options;
		mainServer = schema.getServers().get(0);
		if (options.pckg != null) {
			rootPackage = pckg(options.pckg);
		} else {
			rootPackage = pckg(urlToPackage(mainServer.getUrl()));
		}
	}

	//
	// making correct names for packages, variables and classes.
	//

	/**
	 * java reserved keywords we can't use as a name
	 *
	 * @see https://docs.oracle.com/javase/specs/jls/se12/html/jls-3.html#jls-Identifier
	 */
	public static final Set<String> RESERVED_JAVA_KEYWORDS = Collections
			.unmodifiableSet(new HashSet<>(Arrays.asList("abstract", "assert", "boolean", "break", "byte", "case", "catch",
					"char", "class", "const", "continue", "default", "do", "double", "else", "extends", "final", "finally",
					"float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
					"new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
					"switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while", "_")));

	/**
	 * java literals we can't use as an identifier
	 *
	 * @see https://docs.oracle.com/javase/specs/jls/se12/html/jls-3.html#jls-Identifier
	 */
	public static final Set<String> RESERVED_JAVA_LITERALS = Collections
			.unmodifiableSet(new HashSet<>(Arrays.asList("false", "null", "true")));

	/**
	 * names that java does not specifically allow as a class name, but allows as
	 * variable or package name.
	 *
	 * @see https://docs.oracle.com/javase/specs/jls/se12/html/jls-3.html#jls-3.8
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
	 * cache of the java classes names we know or not if they are in the java.lang
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
	protected JPackage pckg(String packageName) {
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

	/**
	 * create a subpackage in the root package
	 *
	 * @param packagename
	 *          name of the package to create, eg "my.structures"
	 * @return a correct java subpackage, eg "com.server.my.structure"
	 */
	public JPackage subPckg(String packagename) {
		return subPckg(rootPackage, packagename);
	}

	/**
	 * get the package name for a serve from its url. removes the path, eg
	 * https://www.my.website.com/index.php will translate to com.website.my <br/>
	 * this is needed because we create the classes in a specific (static)
	 * package, so we need a static package.
	 */
	public static String urlToPackage(String url) {
		LinkedList<String> reversed = new LinkedList<>();
		String stripped =
				// strip the starting [protocole]://
				url.replaceAll("^.*://", "")
				// remove the www. that can be prefixed
				.replaceAll("^www.", "")
				// remove anything after : or / (port and path)
				.replaceAll("[:/].*", "");
		for (String token : stripped.split("\\.")) {
			// remove any parameter. Those are in the format {paramname}
			token = token.replaceAll("\\{[^\\}]*\\}", "");
			if (token.length() > 0) {
				reversed.add(0, token);
			}
		}
		return reversed.stream().collect(Collectors.joining("."));
	}

}
