package esi.evetech.net.anonymous.markets;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetMarketsRegionIdHistory;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class History
    extends DelegateTransfer<Anonymous>
{

    public History(Anonymous delegate) {
        super(delegate);
    }

    /**
     * List historical market statistics in a region
     * 
     * <p>
     * Return a list of historical market statistics for the specified type in a region<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param region_id
     *     Return statistics in this region
     * @param type_id
     *     Return statistics for this type
     */
    public Requested<GetMarketsRegionIdHistory[]> getByRegionId(String If_None_Match, int region_id, int type_id) {
        String url = ("https://esi.evetech.net/v1/markets/{region_id}/history/".replace("{region_id}", ""+region_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+"&type_id="+flatten(type_id));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetMarketsRegionIdHistory[].class);
    }
}
