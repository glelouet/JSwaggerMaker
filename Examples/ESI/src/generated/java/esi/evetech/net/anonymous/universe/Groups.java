package esi.evetech.net.anonymous.universe;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetUniverseGroupsGroupId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Groups
    extends DelegateTransfer<Anonymous>
{

    public Groups(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get item groups
     * 
     * <p>
     * Get a list of item groups<br />
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
        String url = ("https://esi.evetech.net/v1/universe/groups/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, int[].class);
    }

    /**
     * Get item group information
     * 
     * <p>
     * Get information on an item group<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param Accept_Language
     *     Language to use in the response
     * @param datasource
     *     The server name you would like data from
     * @param group_id
     *     An Eve item group ID
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     */
    public Requested<GetUniverseGroupsGroupId> getByGroupId(esi.evetech.net.structures.Accept_Language Accept_Language,
        int group_id,
        String If_None_Match,
        esi.evetech.net.structures.language language) {
        String url = ("https://esi.evetech.net/v1/universe/groups/{group_id}/".replace("{group_id}", ""+group_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, GetUniverseGroupsGroupId.class);
    }
}
