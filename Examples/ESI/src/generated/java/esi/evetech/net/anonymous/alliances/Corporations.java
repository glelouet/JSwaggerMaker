package esi.evetech.net.anonymous.alliances;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Corporations
    extends DelegateTransfer<Anonymous>
{

    public Corporations(Anonymous delegate) {
        super(delegate);
    }

    /**
     * List alliance's corporations
     * 
     * <p>
     * List all current member corporations of an alliance<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param alliance_id
     *     An EVE alliance ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<int[]> getByAllianceId(int alliance_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/alliances/{alliance_id}/corporations/".replace("{alliance_id}", ""+alliance_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, int[].class);
    }
}
