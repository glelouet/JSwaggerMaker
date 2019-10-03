package esi.evetech.net.anonymous.loyalty.stores;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetLoyaltyStoresCorporationIdOffers;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Offers
    extends DelegateTransfer<Anonymous>
{

    public Offers(Anonymous delegate) {
        super(delegate);
    }

    /**
     * List loyalty store offers
     * 
     * <p>
     * Return a list of offers from a specific corporation's loyalty store<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<GetLoyaltyStoresCorporationIdOffers[]> getByCorporationId(int corporation_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/loyalty/stores/{corporation_id}/offers/".replace("{corporation_id}", ""+corporation_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetLoyaltyStoresCorporationIdOffers[].class);
    }
}
