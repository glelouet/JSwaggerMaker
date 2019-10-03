package esi.evetech.net.anonymous;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.corporations.Alliancehistory;
import esi.evetech.net.anonymous.corporations.Icons;
import esi.evetech.net.anonymous.corporations.Npccorps;
import esi.evetech.net.responses.GetCorporationsCorporationId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Corporations
    extends DelegateTransfer<Anonymous>
{
    public final Npccorps npccorps;
    public final Icons icons;
    public final Alliancehistory alliancehistory;

    public Corporations(Anonymous delegate) {
        super(delegate);
        npccorps = new Npccorps((delegate));
        icons = new Icons((delegate));
        alliancehistory = new Alliancehistory((delegate));
    }

    /**
     * Get corporation information
     * 
     * <p>
     * Public information about a corporation<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<GetCorporationsCorporationId> getByCorporationId(int corporation_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v4/corporations/{corporation_id}/".replace("{corporation_id}", ""+corporation_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCorporationsCorporationId.class);
    }
}
