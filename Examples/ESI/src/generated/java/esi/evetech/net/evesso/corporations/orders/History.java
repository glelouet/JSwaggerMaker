package esi.evetech.net.evesso.corporations.orders;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCorporationsCorporationIdOrdersHistory;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class History
    extends DelegateTransfer<Evesso>
{
    /**
     * the roles required for {@link #getByCorporationId this method}
     */
    public static final String[] GET_CORPORATIONS_CORPORATION_ID_ORDERS_HISTORY_ROLES = new String[] {"Accountant", "Trader"};

    public History(Evesso delegate) {
        super(delegate);
    }

    /**
     * List historical orders from a corporation
     * 
     * <p>
     * List cancelled and expired market orders placed on behalf of a corporation up to 90 days in the past.<br />
     * This route is cached for up to 3600 seconds<br />
     * Requires one of the following EVE corporation role(s): Accountant, Trader
     * </p>
     * <p>
     * require the roles specified {@link #GET_CORPORATIONS_CORPORATION_ID_ORDERS_HISTORY_ROLES here}
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
    public Requested<GetCorporationsCorporationIdOrdersHistory[]> getByCorporationId(int corporation_id, String If_None_Match, Integer page) {
        String url = ("https://esi.evetech.net/v2/corporations/{corporation_id}/orders/history/".replace("{corporation_id}", ""+corporation_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCorporationsCorporationIdOrdersHistory[].class);
    }
}
