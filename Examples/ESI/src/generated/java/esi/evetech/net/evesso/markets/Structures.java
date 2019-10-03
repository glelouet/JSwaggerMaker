package esi.evetech.net.evesso.markets;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetMarketsStructuresStructureId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Structures
    extends DelegateTransfer<Evesso>
{

    public Structures(Evesso delegate) {
        super(delegate);
    }

    /**
     * List orders in a structure
     * 
     * <p>
     * Return all orders in a structure<br />
     * This route is cached for up to 300 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     * @param structure_id
     *     Return orders in this structure
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetMarketsStructuresStructureId[]> getByStructureId(String If_None_Match, Integer page, long structure_id) {
        String url = ("https://esi.evetech.net/v1/markets/structures/{structure_id}/".replace("{structure_id}", ""+structure_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetMarketsStructuresStructureId[].class);
    }
}
