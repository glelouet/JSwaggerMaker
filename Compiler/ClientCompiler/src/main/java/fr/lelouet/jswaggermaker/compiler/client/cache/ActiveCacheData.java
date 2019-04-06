package fr.lelouet.jswaggermaker.compiler.client.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.helger.jcodemodel.AbstractJType;
import com.helger.jcodemodel.IJExpression;
import com.helger.jcodemodel.JArray;
import com.helger.jcodemodel.JBlock;
import com.helger.jcodemodel.JCodeModel;
import com.helger.jcodemodel.JDefinedClass;
import com.helger.jcodemodel.JExpr;
import com.helger.jcodemodel.JInvocation;
import com.helger.jcodemodel.JLambda;
import com.helger.jcodemodel.JLambdaParam;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JMod;
import com.helger.jcodemodel.JVar;

import fr.lelouet.collectionholders.interfaces.ObsListHolder;
import fr.lelouet.collectionholders.interfaces.ObsMapHolder;
import fr.lelouet.collectionholders.interfaces.ObsObjHolder;
import fr.lelouet.jswaggermaker.compiler.client.ClassBridge;
import fr.lelouet.jswaggermaker.compiler.client.CompilerOptions;
import fr.lelouet.jswaggermaker.compiler.client.FetchTranslation;
import fr.lelouet.jswaggermaker.compiler.client.FetchTranslation.RETURNTYPE;
import io.swagger.models.Operation;
import io.swagger.models.parameters.Parameter;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

public class ActiveCacheData {

	final FetchTranslation translation;
	final ActiveCacheTranslator translator;
	final JCodeModel cm;
	final Operation operation;
	final ClassBridge bridge;
	final CompilerOptions options;

	public ActiveCacheData(ActiveCacheTranslator translator, FetchTranslation ft, CompilerOptions options) {
		this.translator = translator;
		translation = ft;
		cm = ft.cm;
		operation = ft.operation;
		bridge = ft.bridge;
		this.options = options;
	}

	protected String cacheFieldName;
	protected JDefinedClass cacheGroup;

	protected List<JVar> cacheParams = new ArrayList<>();

	protected AbstractJType cacheRetType;
	/**
	 * type of the object we transmit to the scheduled fetcher to hold the data
	 */
	protected AbstractJType cacheHolderType;

	protected JMethod cacheMeth;

	protected AbstractJType cacheKeyType;
	protected JVar cacheContainer;
	protected JVar cacheParam;

	protected void apply() {
		if (operation == null) {
			return;
		}

		// create the correct names, method

		cacheFieldName = operation.getOperationId().split("_")[1];
		cacheGroup = translator.getCacheGroupClass(cacheFieldName, translation.connected);

		String cacheMethName = operation.getOperationId().replaceAll("^get_", "").replaceAll("^" + cacheFieldName + "_",
				"");
		for (JVar v : translation.allParams) {
			cacheMethName = cacheMethName.replaceAll(v.name(), "");
		}
		cacheMethName = cacheMethName.replaceAll("__", "_").replaceAll("^_", "").replaceAll("_$", "");
		if (cacheMethName.length() < 2) {
			cacheMethName = "get";
		}

		if (ClassBridge.keywords.contains(cacheMethName)) {
			cacheMethName = "get" + cacheMethName;
		}

		switch (translation.resourceStructure) {
		case NONE:
			return;
		case OBJECT:
			cacheRetType = cm.ref(ObsObjHolder.class).narrow(translation.resourceFlatType.boxify());
			cacheHolderType = cm.ref(SimpleObjectProperty.class).narrow(translation.resourceFlatType.boxify());
			break;
		case LIST:
			cacheRetType = cm.ref(ObsListHolder.class).narrow(translation.resourceFlatType.boxify());
			cacheHolderType = cm.ref(ObservableList.class).narrow(translation.resourceFlatType.boxify());
			break;
		case MAP:
			cacheRetType = cm.ref(ObsMapHolder.class).narrow(translation.resourceFlatType.boxify());
			cacheHolderType = cm.ref(ObservableMap.class).narrow(cm.ref(String.class))
					.narrow(translation.resourceFlatType.boxify());
			break;
		default:
			throw new UnsupportedOperationException("can't handle case " + translation.resourceStructure);
		}

		cacheMeth = cacheGroup.method(JMod.PUBLIC, cacheRetType, cacheMethName);
		cacheMeth.javadoc().add(operation.getDescription().split("---")[0]);
		cacheMeth.javadoc().add("cache over {@link Swagger#" + translation.fetchMeth.name() + "}<br />");

		// after that we need to know the parameters for the method

		for (JVar v : translation.allParams) {
			if (!v.name().equals(translation.propsParamName) && !v.name().equals("page")) {
				cacheParams.add(cacheMeth.param(v.type(), v.name()));
				Parameter vp = operation.getParameters().stream().filter(p -> p.getName().equals(v.name())).findFirst()
						.orElse(null);
				if (vp != null) {
					cacheMeth.javadoc().addParam(v).add(vp.getDescription());
				}
			}
		}


		switch (cacheParams.size()) {
		case 0:
			cacheKeyType = null;
			switch (translation.resourceStructure) {
			case OBJECT:
				createCache_NoParam_Container();
				break;
			case LIST:
				createCache_NoParam_List();
				break;
			case MAP:
				createCache_NoParam_Map();
				break;
			default:
				throw new UnsupportedOperationException("handle case " + translation.resourceStructure);
			}
			break;
		case 1:
			cacheKeyType = cacheParams.get(0).type().boxify();
			cacheContainer = cacheGroup.field(JMod.PRIVATE | JMod.FINAL,
					cm.ref(Map.class).narrow(cacheKeyType).narrow(cacheRetType), operation.getOperationId() + "_holder")
					.init(JExpr._new(cm.ref(HashMap.class).narrowEmpty()));
			cacheParam = cacheParams.get(0);
			switch (translation.resourceStructure) {
			case OBJECT:
				createCache_Param_Container();
				break;
			case LIST:
				createCache_Param_List();
				break;
			case MAP:
				createCache_Param_Map();
				break;
			default:
				throw new UnsupportedOperationException("handle case " + translation.resourceStructure);
			}
			break;
		default:
			cacheKeyType = makeKeyParam(cacheParams);
			cacheContainer = cacheGroup.field(JMod.PRIVATE | JMod.FINAL,
					cm.ref(Map.class).narrow(cacheKeyType).narrow(cacheRetType), operation.getOperationId() + "_holder")
					.init(JExpr._new(cm.ref(HashMap.class).narrowEmpty()));
			cacheParam = cacheMeth.body().decl(cacheKeyType, "param");
			JMethod cons = ((JDefinedClass) cacheKeyType).constructors().next();
			JInvocation callNew = JExpr._new(cacheKeyType);
			for (JVar b : cons.params()) {
				callNew = callNew.arg(b);
			}
			cacheParam.init(callNew);
			switch (translation.resourceStructure) {
			case OBJECT:
				createCache_Param_Container();
				break;
			case LIST:
				createCache_Param_List();
				break;
			case MAP:
				createCache_Param_Map();
				break;
			default:
				throw new UnsupportedOperationException("handle case " + translation.resourceStructure);
			}
		}
	}

	protected JDefinedClass makeKeyParam(List<JVar> cacheParams2) {
		JDefinedClass ret = translator
				.getCacheKeyClass(cacheParams2.stream().collect(Collectors.toMap(JVar::name, JVar::type)));
		ret.javadoc().append("@see " + translation.path + "\n");
		return ret;
	}

	/**
	 * create the lambda method to call the fetch inside the cache method.<br />
	 * The result is transformed into an array of Integer if the fetch returns
	 * integer[]. The lambda takes an additional page parameter iff the
	 * transformation is not into a container (list or map)
	 *
	 * @return
	 */
	protected JLambda lambdaFetch() {
		JLambda lambdaFetch = new JLambda();
		Map<String, IJExpression> paramsByName = new HashMap<>();
		if (translation.resourceStructure != RETURNTYPE.OBJECT) {
			JLambdaParam page = lambdaFetch.addParam("page");
			paramsByName.put(page.name(), page);
		}
		JLambdaParam head = lambdaFetch.addParam(translation.propsParamName);
		paramsByName.put(head.name(), head);
		for (JVar p : cacheParams) {
			paramsByName.put(p.name(), p);
		}
		JInvocation callmeth = JExpr.direct("cache.swagger").invoke(translation.fetchMeth);
		for (JVar v : translation.fetchMeth.params()) {
			IJExpression v2 = paramsByName.get(v.name());
			if (v2 == null) {
				System.err.println("getting arg " + v.name() + " from " + paramsByName);
			}
			callmeth.arg(v2);
		}
		lambdaFetch.body().add(callmeth);
		return lambdaFetch;
	}

	////
	// creation of cache method based on fetch method
	////

	/**
	 * create the cache body when cache has no parameter and the fetch method
	 * returns an object
	 */
	protected void createCache_NoParam_Container() {
		cacheContainer = cacheGroup.field(JMod.PRIVATE,
				cm.ref(ObsObjHolder.class).narrow(translation.resourceFlatType.boxify()),
				operation.getOperationId() + "_holder");
		JBlock instanceBlock = translation.sync(cacheMeth.body()._if(cacheContainer.eqNull())._then(), JExpr._this()).body()
				._if(cacheContainer.eqNull())._then();
		JVar holder = instanceBlock
				.decl(cacheHolderType, "holder")
				.init(JExpr._new(cm.ref(SimpleObjectProperty.class).narrowEmpty()));
		instanceBlock.assign(cacheContainer, JExpr.invoke(JExpr.direct("cache"), "toHolder").arg(holder));
		JInvocation invoke = JExpr.invoke(JExpr.direct("cache"), translator.methFetchCacheObject())
				.arg(operation.getOperationId());
		invoke.arg(lambdaFetch());
		instanceBlock.add(invoke);
		JLambda lambdaset = new JLambda();
		JLambdaParam item = lambdaset.addParam("item");
		translation.sync(lambdaset.body(), holder).body().add(JExpr.invoke(holder, "set").arg(item));
		invoke.arg(lambdaset);
		if (!translation.requiredRoles.isEmpty()) {
			JArray array = JExpr.newArray(cm.ref(String.class));
			for (String s : translation.requiredRoles) {
				array.add(JExpr.lit(s));
			}
			invoke.arg(array);
		}
		cacheMeth.body()._return(cacheContainer);
	}

	/**
	 * create the cache body when no parameter and the fetch method returns a list
	 * of items with no unique field.
	 */
	protected void createCache_NoParam_List() {
		cacheContainer = cacheGroup.field(JMod.PRIVATE, cacheRetType, operation.getOperationId() + "_holder");
		JBlock instanceBlock = translation.sync(cacheMeth.body()._if(cacheContainer.eqNull())._then(), JExpr._this()).body()
				._if(cacheContainer.eqNull())._then();
		// _holder = FXCollections.observableArrayList();
		JVar holder = instanceBlock.decl(cacheHolderType, "holder")
				.init(cm.ref(FXCollections.class).staticInvoke("observableArrayList"));
		instanceBlock.assign(cacheContainer, JExpr.invoke(JExpr.direct("cache"), "toHolder").arg(holder));
		JVar finalRet = instanceBlock.decl(cacheRetType, "finalRet").init(cacheContainer);
		JInvocation invoke = JExpr.invoke(JExpr.direct("cache"), translator.methFetchCacheArray())
				.arg(operation.getOperationId());

		invoke.arg(lambdaFetch());

		JLambda lambdaSet = new JLambda();
		JLambdaParam arr = lambdaSet.addParam("arr");
		JBlock setBody = translation.sync(lambdaSet.body(), holder).body();
		setBody.add(JExpr.invoke(holder, "clear"));
		setBody._if(arr.neNull())._then().add(JExpr.invoke(holder, "addAll").arg(arr));
		lambdaSet.body().invoke(finalRet, "dataReceived");
		invoke.arg(lambdaSet);
		if (!translation.requiredRoles.isEmpty()) {
			JArray array = JExpr.newArray(cm.ref(String.class));
			for (String s : translation.requiredRoles) {
				array.add(JExpr.lit(s));
			}
			invoke.arg(array);
		}
		instanceBlock.add(invoke);
		cacheMeth.body()._return(cacheContainer);
	}

	/**
	 * create the cache body when only one parameter.
	 */
	protected void createCache_Param_List() {
		// System.err.println("create with cacherettype=" + cacheRetType + "
		// cacheparam=" + cacheParam + " cachecontainer="
		// + cacheContainer + " cacheholdertype=" + cacheHolderType);
		JVar ret = cacheMeth.body().decl(cacheRetType, "ret");
		JBlock instanceBlock = translation.createTestNullCase(cacheMeth.body(), ret,
				cacheContainer.invoke("get").arg(cacheParam),
				cacheContainer);
		JVar holder = instanceBlock.decl(cacheHolderType, "holder")
				.init(cm.ref(FXCollections.class).staticInvoke("observableArrayList"));
		instanceBlock.assign(ret, JExpr.invoke(JExpr.direct("cache"), "toHolder").arg(holder));
		instanceBlock.add(JExpr.invoke(cacheContainer, "put").arg(cacheParam).arg(ret));
		JVar finalRet = instanceBlock.decl(cacheRetType, "finalRet").init(ret);
		JInvocation invoke = JExpr.invoke(JExpr.direct("cache"), translator.methFetchCacheArray())
				.arg(operation.getOperationId());
		invoke.arg(lambdaFetch());
		instanceBlock.add(invoke);

		JLambda lambdaSet = new JLambda();
		JLambdaParam arr = lambdaSet.addParam("arr");
		JBlock setBody = translation.sync(lambdaSet.body(), holder).body();
		setBody.add(JExpr.invoke(holder, "clear"));
		setBody._if(arr.neNull())._then().add(JExpr.invoke(holder, "addAll").arg(arr));
		lambdaSet.body().invoke(finalRet, "dataReceived");
		invoke.arg(lambdaSet);
		if (!translation.requiredRoles.isEmpty()) {
			JArray array = JExpr.newArray(cm.ref(String.class));
			for (String s : translation.requiredRoles) {
				array.add(JExpr.lit(s));
			}
			invoke.arg(array);
		}
		cacheMeth.body()._return(ret);
	}

	/**
	 * create the cache body when only one parameter and returns an map of String
	 * to resource
	 */
	protected void createCache_Param_Map() {
		JVar ret = cacheMeth.body().decl(cacheRetType, "ret");
		JBlock instanceBlock = translation.createTestNullCase(cacheMeth.body(), ret,
				cacheContainer.invoke("get").arg(cacheParam),
				cacheContainer);
		JVar holder = instanceBlock.decl(cacheHolderType, "holder")
				.init(cm.ref(FXCollections.class).staticInvoke("observableHashMap"));
		instanceBlock.assign(ret, JExpr.invoke(JExpr.direct("cache"), "toHolder").arg(holder));
		instanceBlock.add(JExpr.invoke(cacheContainer, "put").arg(cacheParam).arg(ret));
		JVar finalRet = instanceBlock.decl(cacheRetType, "finalRet").init(ret);
		JInvocation invoke = JExpr.invoke(JExpr.direct("cache"), translator.methFetchCacheMap())
				.arg(operation.getOperationId());

		invoke.arg(lambdaFetch());
		instanceBlock.add(invoke);

		JLambda lambdaSet = new JLambda();
		JLambdaParam newmap = lambdaSet.addParam("newmap");
		JBlock setBody = translation.sync(lambdaSet.body(), holder).body();
		JBlock ifnotnull = setBody._if(newmap.neNull())._then();
		// container.entrySet().retainAll(newMap.entrySet())
		ifnotnull.add(JExpr.invoke(holder, "keySet").invoke("retainAll").arg(newmap.invoke("keySet")));
		// container.putAll(newmap)
		ifnotnull.add(JExpr.invoke(holder, "putAll").arg(newmap));
		lambdaSet.body().invoke(finalRet, "dataReceived");
		invoke.arg(lambdaSet);
		if (!translation.requiredRoles.isEmpty()) {
			JArray array = JExpr.newArray(cm.ref(String.class));
			for (String s : translation.requiredRoles) {
				array.add(JExpr.lit(s));
			}
			invoke.arg(array);
		}
		cacheMeth.body()._return(ret);
	}

	/** method is fetch()-> map (param, rettype) */
	protected void createCache_NoParam_Map() {
		cacheContainer = cacheGroup.field(JMod.PRIVATE, cacheRetType, operation.getOperationId() + "_holder");
		JBlock instanceBlock = translation.sync(cacheMeth.body()._if(cacheContainer.eqNull())._then(), JExpr._this()).body()
				._if(cacheContainer.eqNull())._then();
		// _holder = FXCollections.observableHashMap();
		JVar holder = instanceBlock
				.decl(cacheHolderType,
						"holder")
				.init(cm.ref(FXCollections.class).staticInvoke("observableHashMap"));
		instanceBlock.assign(cacheContainer, JExpr.invoke(JExpr.direct("cache"), "toHolder").arg(holder));
		JVar finalRet = instanceBlock.decl(cacheRetType, "finalRet").init(cacheContainer);
		JInvocation invoke = JExpr.invoke(JExpr.direct("cache"), translator.methFetchCacheMap())
				.arg(operation.getOperationId());

		invoke.arg(lambdaFetch());
		instanceBlock.add(invoke);

		JLambda lambdaSet = new JLambda();
		JLambdaParam newmap = lambdaSet.addParam("newmap");
		JBlock setBody = translation.sync(lambdaSet.body(), holder).body();
		// container.entrySet().retainAll(newMap.entrySet())
		JBlock ifnotnull = setBody._if(newmap.neNull())._then();
		ifnotnull.add(JExpr.invoke(holder, "keySet").invoke("retainAll").arg(newmap.invoke("keySet")));
		// container.putAll(newmap)
		ifnotnull.add(JExpr.invoke(holder, "putAll").arg(newmap));
		lambdaSet.body().invoke(finalRet, "dataReceived");
		invoke.arg(lambdaSet);

		if (!translation.requiredRoles.isEmpty()) {
			JArray array = JExpr.newArray(cm.ref(String.class));
			for (String s : translation.requiredRoles) {
				array.add(JExpr.lit(s));
			}
			invoke.arg(array);
		}

		cacheMeth.body()._return(cacheContainer);
	}

	/**
	 * Create the cache body when only one parameter and return a container of
	 * resourcetype.<br />
	 * Typically produces a map<cachekey, cacheret>
	 */
	protected void createCache_Param_Container() {
		JVar ret = cacheMeth.body().decl(cacheRetType, "ret");
		JBlock instanceBlock = translation.createTestNullCase(cacheMeth.body(), ret,
				cacheContainer.invoke("get").arg(cacheParam),
				cacheContainer);
		JVar holder = instanceBlock.decl(cacheHolderType, "holder")
				.init(JExpr._new(cm.ref(SimpleObjectProperty.class).narrowEmpty()));
		instanceBlock.assign(ret, JExpr.invoke(JExpr.direct("cache"), "toHolder").arg(holder));
		instanceBlock.add(JExpr.invoke(cacheContainer, "put").arg(cacheParam).arg(ret));
		JInvocation invoke = JExpr.invoke(JExpr.direct("cache"), translator.methFetchCacheObject())
				.arg(operation.getOperationId());

		invoke.arg(lambdaFetch());
		instanceBlock.add(invoke);

		JLambda lambdaset = new JLambda();
		JLambdaParam item = lambdaset.addParam("item");
		translation.sync(lambdaset.body(), holder).body().add(JExpr.invoke(holder, "set").arg(item));
		invoke.arg(lambdaset);
		if (!translation.requiredRoles.isEmpty()) {
			JArray array = JExpr.newArray(cm.ref(String.class));
			for (String s : translation.requiredRoles) {
				array.add(JExpr.lit(s));
			}
			invoke.arg(array);
		}

		cacheMeth.body()._return(ret);
	}

}
