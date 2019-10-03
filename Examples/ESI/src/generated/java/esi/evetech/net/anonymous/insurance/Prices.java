package esi.evetech.net.anonymous.insurance;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetInsurancePrices;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Prices
    extends DelegateTransfer<Anonymous>
{

    public Prices(Anonymous delegate) {
        super(delegate);
    }

    /**
     * List insurance levels
     * 
     * <p>
     * Return available insurance levels for all ship types<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param Accept_Language
     *     Language to use in the response
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     */
    public Requested<GetInsurancePrices[]> get(esi.evetech.net.structures.Accept_Language Accept_Language, String If_None_Match, esi.evetech.net.structures.language language) {
        String url = ("https://esi.evetech.net/v1/insurance/prices/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, GetInsurancePrices[].class);
    }
}
