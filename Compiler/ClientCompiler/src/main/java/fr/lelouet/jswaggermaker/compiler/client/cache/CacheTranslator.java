package fr.lelouet.jswaggermaker.compiler.client.cache;

import fr.lelouet.jswaggermaker.compiler.client.PathTranslation;

public interface CacheTranslator {

	public void apply(PathTranslation ft);

}
