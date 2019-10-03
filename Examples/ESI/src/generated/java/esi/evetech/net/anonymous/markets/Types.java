package esi.evetech.net.anonymous.markets;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Types
    extends DelegateTransfer<Anonymous>
{

    public Types(Anonymous delegate) {
        super(delegate);
    }

    /**
     * List type IDs relevant to a market
     * 
     * <p>
     * Return a list of type IDs that have active orders in the region, for efficient market indexing.<br />
     * This route is cached for up to 600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     * @param region_id
     *     Return statistics in this region
     */
    public Requested<int[]> getByRegionId(String If_None_Match, Integer page, int region_id) {
        String url = ("https://esi.evetech.net/v1/markets/{region_id}/types/".replace("{region_id}", ""+region_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, int[].class);
    }
}
