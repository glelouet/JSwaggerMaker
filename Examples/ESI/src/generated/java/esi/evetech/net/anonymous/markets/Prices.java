package esi.evetech.net.anonymous.markets;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetMarketsPrices;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Prices
    extends DelegateTransfer<Anonymous>
{

    public Prices(Anonymous delegate) {
        super(delegate);
    }

    /**
     * List market prices
     * 
     * <p>
     * Return a list of prices<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<GetMarketsPrices[]> get(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/markets/prices/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetMarketsPrices[].class);
    }
}
