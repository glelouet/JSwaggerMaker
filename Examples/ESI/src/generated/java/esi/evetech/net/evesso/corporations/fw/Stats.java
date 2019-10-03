package esi.evetech.net.evesso.corporations.fw;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCorporationsCorporationIdFwStats;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Stats
    extends DelegateTransfer<Evesso>
{

    public Stats(Evesso delegate) {
        super(delegate);
    }

    /**
     * Overview of a corporation involved in faction warfare
     * 
     * <p>
     * Statistics about a corporation involved in faction warfare<br />
     * This route expires daily at 11:05<br />
     * [Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/corporations/{corporation_id}/fw/stats/)
     * </p>
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCorporationsCorporationIdFwStats> getByCorporationId(int corporation_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/fw/stats/".replace("{corporation_id}", ""+corporation_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCorporationsCorporationIdFwStats.class);
    }
}
