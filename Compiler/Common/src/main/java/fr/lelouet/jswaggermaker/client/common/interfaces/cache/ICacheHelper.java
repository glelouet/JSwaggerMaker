package fr.lelouet.jswaggermaker.client.common.interfaces.cache;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

import fr.lelouet.collectionholders.interfaces.ObsListHolder;
import fr.lelouet.collectionholders.interfaces.ObsMapHolder;
import fr.lelouet.collectionholders.interfaces.ObsObjHolder;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

public interface ICacheHelper {

	public <U> Pausable addFetchCacheArray(String name, BiFunction<Integer, Map<String, String>, Requested<U[]>> fetcher,
			Consumer<List<U>> cacheHandler, String... requiredRoles);

	public <U> Pausable addFetchCacheObject(String name, Function<Map<String, String>, Requested<U>> fetcher,
			Consumer<U> cacheHandler, String... requiredRoles);

	public <U, V> ObsMapHolder<U, V> toHolder(ObservableMap<U, V> map);

	public <U> ObsListHolder<U> toHolder(ObservableList<U> list);

	/** create an observableholder on an obersvable variable */
	public <U> ObsObjHolder<U> toHolder(ObservableValue<U> obj);

}
