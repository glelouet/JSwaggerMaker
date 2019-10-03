package esi.evetech.net.anonymous;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetSearch;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Search
    extends DelegateTransfer<Anonymous>
{

    public Search(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Search on a string
     * 
     * <p>
     * Search for entities that match a given sub-string.<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param Accept_Language
     *     Language to use in the response
     * @param categories
     *     Type of entities to search for
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     * @param search
     *     The string to search on
     * @param strict
     *     Whether the search should be a strict match
     */
    public Requested<GetSearch> get(esi.evetech.net.structures.Accept_Language Accept_Language,
        String[] categories,
        String If_None_Match,
        esi.evetech.net.structures.language language,
        String search,
        Boolean strict) {
        String url = ("https://esi.evetech.net/v2/search/"+"?"+(categories==null?"":"&categories="+flatten(categories))+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(language==null?"":"&language="+flatten(language))+(search==null?"":"&search="+flatten(search))+(strict==null?"":"&strict="+flatten(strict)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, GetSearch.class);
    }
}
