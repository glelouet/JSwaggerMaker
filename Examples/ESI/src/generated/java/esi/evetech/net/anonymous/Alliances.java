package esi.evetech.net.anonymous;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.alliances.Corporations;
import esi.evetech.net.anonymous.alliances.Icons;
import esi.evetech.net.responses.GetAlliancesAllianceId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Alliances
    extends DelegateTransfer<Anonymous>
{
    public final Corporations corporations;
    public final Icons icons;

    public Alliances(Anonymous delegate) {
        super(delegate);
        corporations = new Corporations((delegate));
        icons = new Icons((delegate));
    }

    /**
     * List all alliances
     * 
     * <p>
     * List all active player alliances<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<int[]> get(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/alliances/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, int[].class);
    }

    /**
     * Get alliance information
     * 
     * <p>
     * Public information about an alliance<br />
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
    public Requested<GetAlliancesAllianceId> getByAllianceId(int alliance_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v3/alliances/{alliance_id}/".replace("{alliance_id}", ""+alliance_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetAlliancesAllianceId.class);
    }
}
