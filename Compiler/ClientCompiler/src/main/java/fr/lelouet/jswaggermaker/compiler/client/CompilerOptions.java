package fr.lelouet.jswaggermaker.compiler.client;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class CompilerOptions {

	public static final String SWAGGERURLPREFIX = "url=";

	public String swaggerURL;

	public static final String OUTDIRPREFIX = "folder=";

	public String outDir = "compiled/";

	public static final String CLEARFOLDERPREFIX = "clear=";

	public Boolean clearFolder = true;

	public static final String LOADPREFIX = "load=";

	public CompilerOptions(String... args) {
		if (args != null) {
			for (String arg : args) {
				load(arg);
			}
		}
	}

	public static final String PACKAGEPREFIX = "package=";

	public String pckg = null;

	public static final String GLOBALPARAMSPREFIX = "globals=";

	public HashSet<String> globals = new HashSet<>();

	public static final String CACHEPREFIX = "cache=";

	public String cache = null;

	private void load(String arg) {
		if (arg.startsWith(CACHEPREFIX)) {
			cache = arg.substring(CACHEPREFIX.length());
		} else if (arg.startsWith(CLEARFOLDERPREFIX)) {
			clearFolder = Boolean.parseBoolean(arg.substring(CLEARFOLDERPREFIX.length()));
		} else if (arg.startsWith(LOADPREFIX)) {
			loadFile(arg.substring(LOADPREFIX.length()));
		} else if (arg.startsWith(OUTDIRPREFIX)) {
			outDir = arg.substring(OUTDIRPREFIX.length());
		} else if (arg.startsWith(PACKAGEPREFIX)) {
			pckg = arg.substring(PACKAGEPREFIX.length());
		} else if (arg.startsWith(GLOBALPARAMSPREFIX)) {
			globals = new HashSet<>(Arrays.asList(arg.substring(GLOBALPARAMSPREFIX.length()).split(",")));
		} else if (arg.startsWith(SWAGGERURLPREFIX)) {
			swaggerURL = arg.substring(SWAGGERURLPREFIX.length());
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