package fr.lelouet.jswaggermaker.compiler.client.cache;

import fr.lelouet.jswaggermaker.compiler.client.CacheTranslator;
import fr.lelouet.jswaggermaker.compiler.client.FetchTranslation;

public class ActiveCacheTranslator implements CacheTranslator {


	@Override
	public void apply(FetchTranslation ft) {
		new ActiveCacheTranslator().apply(ft);
	}

}
