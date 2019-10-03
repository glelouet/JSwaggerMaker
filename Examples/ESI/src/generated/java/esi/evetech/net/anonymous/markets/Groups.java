package esi.evetech.net.anonymous.markets;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetMarketsGroupsMarketGroupId;
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
     */
    public Requested<int[]> get(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/markets/groups/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
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
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     * @param market_group_id
     *     An Eve item group ID
     */
    public Requested<GetMarketsGroupsMarketGroupId> getByMarketGroupId(esi.evetech.net.structures.Accept_Language Accept_Language,
        String If_None_Match,
        esi.evetech.net.structures.language language,
        int market_group_id) {
        String url = ("https://esi.evetech.net/v1/markets/groups/{market_group_id}/".replace("{market_group_id}", ""+market_group_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, GetMarketsGroupsMarketGroupId.class);
    }
}
