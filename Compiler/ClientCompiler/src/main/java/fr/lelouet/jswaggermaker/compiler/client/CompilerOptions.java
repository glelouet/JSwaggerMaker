package fr.lelouet.jswaggermaker.compiler.client;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class CompilerOptions {

	/**
	 * cache strategy to use. default no cache
	 */
	public static final String CACHEPREFIX = "cache=";

	public String cache = null;

	/**
	 * set to false to NOT clear the destination folder prior to creating the
	 * classes. default is true.
	 */
	public static final String CLEARFOLDERPREFIX = "clear=";

	public Boolean clearFolder = true;

	/**
	 * destination folder. default is compiled/
	 */
	public static final String OUTDIRPREFIX = "folder=";

	public String outDir = "compiled/";

	/**
	 * globals are parameter names that are pushed at the connection level. eg
	 * language, datasets to work on, etc. If an anonymous connection has global
	 * parameters, it can't be singleton.
	 */
	public static final String GLOBALPARAMSPREFIX = "globals=";

	public HashSet<String> globals = new HashSet<>();

	/**
	 * request to load a specific file for the parameters. This file must be a
	 * text file containing a series of parameters to send to the Compiler.
	 */
	public static final String LOADPREFIX = "load=";

	/**
	 * root package of the definitions. Default is null, so deducted from the
	 * server URL.
	 */
	public static final String PACKAGEPREFIX = "package=";

	public String pckg = null;

	/**
	 * where to load the swagger from.
	 */
	public static final String SWAGGERURLPREFIX = "url=";

	public String swaggerURL;

	public CompilerOptions(String... args) {
		if (args != null) {
			for (String arg : args) {
				load(arg);
			}
		}
	}

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