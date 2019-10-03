package esi.evetech.net.evesso.corporation.mining;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCorporationCorporationIdMiningExtractions;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Extractions
    extends DelegateTransfer<Evesso>
{
    /**
     * the roles required for {@link #getByCorporationId this method}
     */
    public static final String[] GET_CORPORATION_CORPORATION_ID_MINING_EXTRACTIONS_ROLES = new String[] {"Station_Manager"};

    public Extractions(Evesso delegate) {
        super(delegate);
    }

    /**
     * Moon extraction timers
     * 
     * <p>
     * Extraction timers for all moon chunks being extracted by refineries belonging to a corporation.<br />
     * This route is cached for up to 1800 seconds<br />
     * Requires one of the following EVE corporation role(s): Station_Manager
     * </p>
     * <p>
     * require the roles specified {@link #GET_CORPORATION_CORPORATION_ID_MINING_EXTRACTIONS_ROLES here}
     * </p>
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCorporationCorporationIdMiningExtractions[]> getByCorporationId(int corporation_id, String If_None_Match, Integer page) {
        String url = ("https://esi.evetech.net/v1/corporation/{corporation_id}/mining/extractions/".replace("{corporation_id}", ""+corporation_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCorporationCorporationIdMiningExtractions[].class);
    }
}
