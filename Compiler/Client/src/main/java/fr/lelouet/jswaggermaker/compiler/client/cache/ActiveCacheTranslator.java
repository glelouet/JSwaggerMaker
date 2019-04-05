package fr.lelouet.jswaggermaker.compiler.client.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.helger.jcodemodel.AbstractJClass;
import com.helger.jcodemodel.AbstractJType;
import com.helger.jcodemodel.EClassType;
import com.helger.jcodemodel.JArrayClass;
import com.helger.jcodemodel.JClassAlreadyExistsException;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JExpr;
import com.helger.jcodemodel.JFieldVar;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMod;
import com.helger.jcodemodel.JTypeVar;
import com.helger.jcodemodel.JVar;

import fr.lelouet.jswaggermaker.client.common.interfaces.cache.ICacheHelper;
import fr.lelouet.jswaggermaker.compiler.client.CacheTranslator;
import fr.lelouet.jswaggermaker.compiler.client.ClassBridge;
import fr.lelouet.jswaggermaker.compiler.client.CompilerOptions;
import fr.lelouet.jswaggermaker.compiler.client.FetchTranslation;

public class ActiveCacheTranslator implements CacheTranslator {

	private final CompilerOptions options;
	private final JCodeModel cm;
	private final ClassBridge cb;

	public ActiveCacheTranslator(JCodeModel cm, ClassBridge cb, CompilerOptions options) {
		this.options = options;
		this.cm = cm;
		this.cb = cb;
		try {
			createCacheMethods();
		} catch (JClassAlreadyExistsException e) {
			throw new UnsupportedOperationException("catch this", e);
		}
	}

	@Override
	public void apply(FetchTranslation ft) {
		new ActiveCacheData(this, ft, options).apply();
	}

	public void createCacheMethods() throws JClassAlreadyExistsException {

		cacheItf = cm.ref(ICacheHelper.class);
		cacheCOClass = cm._class(JMod.PUBLIC | JMod.ABSTRACT, cb.rootPackage + "." + cacheCOName, EClassType.CLASS)
				._implements(cacheItf);
		cacheDCClass = cm._class(JMod.PUBLIC | JMod.ABSTRACT, cb.rootPackage + "." + cacheDCName, EClassType.CLASS)
				._implements(cacheItf);

		// we need to add generics to allow the cache to be built on a more specific
		// class, ie to bring more functions to be called.

		JTypeVar cacheCOParam = cacheCOClass.generify("T", cb.swaggerCOClass);
		JFieldVar cacheParent = cacheCOClass.field(JMod.PUBLIC | JMod.FINAL, cacheCOParam, "swagger");
		// add a constructor with swagger param
		JMethod cachecons = cacheCOClass.constructor(JMod.PUBLIC);
		JVar swag = cachecons.param(cacheCOParam, "swag");
		cachecons.body().assign(cacheParent, swag);

		JTypeVar cacheDCParam = cacheDCClass.generify("T", cb.swaggerDCClass);
		cacheParent = cacheDCClass.field(JMod.PUBLIC | JMod.FINAL, cacheDCParam, "swagger");
		// add a constructor with swagger param
		cachecons = cacheDCClass.constructor(JMod.PUBLIC);
		swag = cachecons.param(cacheDCParam, "swag");
		cachecons.body().assign(cacheParent, swag);

	}

	////
	// cache generation classes
	////

	protected String cacheCOName = "SwaggerCOCache";
	protected String cacheDCName = "SwaggerDCCache";

	private AbstractJClass cacheItf;
	private JDefinedClass cacheCOClass;
	private JDefinedClass cacheDCClass;

	public JDefinedClass cacheClass(boolean connected) {
		return connected ? cacheCOClass : cacheDCClass;
	}

	public String methFetchCacheObject() {
		return "addFetchCacheObject";
	}

	public String methFetchCacheArray() {
		return "addFetchCacheArray";
	}

	public String methFetchCacheMap() {
		return "addFetchCacheMap";
	}

	protected Map<String, JDefinedClass> cacheCOGroups = new HashMap<>();
	protected Map<String, JDefinedClass> cacheDCGroups = new HashMap<>();

	/**
	 * get the group cache class for given group name. also create a field of
	 * given type in the {@link #cacheCOName} class .
	 *
	 * <br />
	 * eg calling this with "bla" will create a Bla class in the
	 * {@link #cacheCOName} class, as well as a field
	 * <code>public final bla = new Bla();</code> in it.
	 *
	 * @param groupName
	 * @return
	 */
	public JDefinedClass getCacheGroupClass(String groupName, boolean connected) {
		Map<String, JDefinedClass> map = connected ? cacheCOGroups : cacheDCGroups;
		JDefinedClass ret = map.get(groupName);
		if (ret == null) {
			try {
				ret = (connected ? cb.connectedPackage : cb.disconnectedPackage)._class(JMod.PUBLIC,
						groupName.substring(0, 1).toUpperCase() + groupName.substring(1));
				JDefinedClass cachecl = cacheClass(connected);
				// add a final field swagger and constructor Ret(Swagger){this.swagger =
				// swagger;}
				JFieldVar cacheField = ret.field(JMod.PUBLIC | JMod.FINAL, cachecl.narrowAny(), "cache");
				JMethod groupCons = ret.constructor(JMod.PUBLIC);
				JVar swagParam = groupCons.param(cachecl.narrowAny(), "parent");
				groupCons.body().assign(cacheField, swagParam);
				map.put(groupName, ret);
				// need to make direct call or the generated class is ugly(makes
				// reference to the enclosing unparametrized class)
				cacheClass(connected).field(JMod.PUBLIC | JMod.FINAL, ret, groupName).init(JExpr._new(ret).arg(JExpr._this()));
			} catch (JClassAlreadyExistsException e) {
				throw new UnsupportedOperationException("while getting cache group for " + groupName, e);
			}
		}
		return ret;
	}

	////
	// cache key classes
	////

	Map<Map<String, AbstractJType>, JDefinedClass> existingKeyTypes = new HashMap<>();

	public JDefinedClass getCacheKeyClass(Map<String, AbstractJType> map) {
		JDefinedClass ret = existingKeyTypes.get(map);
		if (ret == null) {
			synchronized (existingKeyTypes) {
				if (ret == null) {
					try {
						String className = "K_" + existingKeyTypes.size();
						for (AbstractJType v : map.values()) {
							className += "_" + compilableName(v);
						}
						ret = cb.keyPackage._class(className);

						JMethod methcons = ret.constructor(JMod.PUBLIC);

						for (Entry<String, AbstractJType> e : map.entrySet()) {
							JFieldVar field = ret.field(JMod.PUBLIC | JMod.FINAL, e.getValue(), e.getKey());

							JVar consParam = methcons.param(e.getValue(), e.getKey());
							methcons.body().assign(JExpr.refthis(field), consParam);
						}

						cb.createEquals(ret);
						cb.createHashCode(ret);

						existingKeyTypes.put(map, ret);
					} catch (JClassAlreadyExistsException e) {
						throw new UnsupportedOperationException("catch this", e);
					}
				}
			}
		}
		return ret;
	}

	protected String compilableName(AbstractJType t) {
		if (t.isArray()) {
			return "L" + compilableName(((JArrayClass) t).elementType());
		} else {
			return t.name();
		}
	}

}
