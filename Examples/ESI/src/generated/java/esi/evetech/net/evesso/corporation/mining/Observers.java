package esi.evetech.net.evesso.corporation.mining;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCorporationCorporationIdMiningObservers;
import esi.evetech.net.responses.GetCorporationCorporationIdMiningObserversObserverId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Observers
    extends DelegateTransfer<Evesso>
{
    /**
     * the roles required for {@link #getByCorporationId this method}
     */
    public static final String[] GET_CORPORATION_CORPORATION_ID_MINING_OBSERVERS_ROLES = new String[] {"Accountant"};
    /**
     * the roles required for {@link #getByCorporationIdObserverId this method}
     */
    public static final String[] GET_CORPORATION_CORPORATION_ID_MINING_OBSERVERS_OBSERVER_ID_ROLES = new String[] {"Accountant"};

    public Observers(Evesso delegate) {
        super(delegate);
    }

    /**
     * Corporation mining observers
     * 
     * <p>
     * Paginated list of all entities capable of observing and recording mining for a corporation<br />
     * This route is cached for up to 3600 seconds<br />
     * Requires one of the following EVE corporation role(s): Accountant
     * </p>
     * <p>
     * require the roles specified {@link #GET_CORPORATION_CORPORATION_ID_MINING_OBSERVERS_ROLES here}
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
    public Requested<GetCorporationCorporationIdMiningObservers[]> getByCorporationId(int corporation_id, String If_None_Match, Integer page) {
        String url = ("https://esi.evetech.net/v1/corporation/{corporation_id}/mining/observers/".replace("{corporation_id}", ""+corporation_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCorporationCorporationIdMiningObservers[].class);
    }

    /**
     * Observed corporation mining
     * 
     * <p>
     * Paginated record of all mining seen by an observer<br />
     * This route is cached for up to 3600 seconds<br />
     * Requires one of the following EVE corporation role(s): Accountant
     * </p>
     * <p>
     * require the roles specified {@link #GET_CORPORATION_CORPORATION_ID_MINING_OBSERVERS_OBSERVER_ID_ROLES here}
     * </p>
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param observer_id
     *     A mining observer id
     * @param page
     *     Which page of results to return
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCorporationCorporationIdMiningObserversObserverId[]> getByCorporationIdObserverId(int corporation_id,
        String If_None_Match,
        long observer_id,
        Integer page) {
        String url = ("https://esi.evetech.net/v1/corporation/{corporation_id}/mining/observers/{observer_id}/".replace("{corporation_id}", ""+corporation_id).replace("{observer_id}", ""+observer_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCorporationCorporationIdMiningObserversObserverId[].class);
    }
}
