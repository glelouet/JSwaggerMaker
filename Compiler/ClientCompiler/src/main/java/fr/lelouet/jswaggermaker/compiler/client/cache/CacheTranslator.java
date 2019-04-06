package fr.lelouet.jswaggermaker.compiler.client.cache;

import fr.lelouet.jswaggermaker.compiler.client.FetchTranslation;

public interface CacheTranslator {

	public void apply(FetchTranslation ft);

}
