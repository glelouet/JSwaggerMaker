package esi.evetech.net.anonymous.universe;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetUniverseTypesTypeId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Types
    extends DelegateTransfer<Anonymous>
{

    public Types(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get types
     * 
     * <p>
     * Get a list of type ids<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     */
    public Requested<int[]> get(String If_None_Match, Integer page) {
        String url = ("https://esi.evetech.net/v1/universe/types/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, int[].class);
    }

    /**
     * Get type information
     * 
     * <p>
     * Get information on a type<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param Accept_Language
     *     Language to use in the response
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     * @param type_id
     *     An Eve item type ID
     */
    public Requested<GetUniverseTypesTypeId> getByTypeId(esi.evetech.net.structures.Accept_Language Accept_Language,
        String If_None_Match,
        esi.evetech.net.structures.language language,
        int type_id) {
        String url = ("https://esi.evetech.net/v3/universe/types/{type_id}/".replace("{type_id}", ""+type_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, GetUniverseTypesTypeId.class);
    }
}
