package esi.evetech.net.evesso.corporations;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCorporationsCorporationIdStarbases;
import esi.evetech.net.responses.GetCorporationsCorporationIdStarbasesStarbaseId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Starbases
    extends DelegateTransfer<Evesso>
{
    /**
     * the roles required for {@link #getByCorporationId this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_STARBASES_ROLES = new String[] {"Director"};
    /**
     * the roles required for {@link #getByCorporationIdStarbaseId this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_STARBASES_STARBASE_ID_ROLES = new String[] {"Director"};

    public Starbases(Evesso delegate) {
        super(delegate);
    }

    /**
     * Get corporation starbases (POSes)
     * 
     * <p>
     * Returns list of corporation starbases (POSes)<br />
     * This route is cached for up to 3600 seconds<br />
     * Requires one of the following EVE corporation role(s): Director
     * </p>
     * <p>
     * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_STARBASES_ROLES here}
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
    public Requested<GetCorporationsCorporationIdStarbases[]> getByCorporationId(int corporation_id, String If_None_Match, Integer page) {
        String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/starbases/".replace("{corporation_id}", ""+corporation_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCorporationsCorporationIdStarbases[].class);
    }

    /**
     * Get starbase (POS) detail
     * 
     * <p>
     * Returns various settings and fuels of a starbase (POS)<br />
     * This route is cached for up to 3600 seconds<br />
     * Requires one of the following EVE corporation role(s): Director
     * </p>
     * <p>
     * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_STARBASES_STARBASE_ID_ROLES here}
     * </p>
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param starbase_id
     *     An EVE starbase (POS) ID
     * @param system_id
     *     The solar system this starbase (POS) is located in,
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCorporationsCorporationIdStarbasesStarbaseId> getByCorporationIdStarbaseId(int corporation_id,
        String If_None_Match,
        long starbase_id,
        int system_id) {
        String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/starbases/{starbase_id}/".replace("{corporation_id}", ""+corporation_id).replace("{starbase_id}", ""+starbase_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+"&system_id="+flatten(system_id)+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCorporationsCorporationIdStarbasesStarbaseId.class);
    }
}
