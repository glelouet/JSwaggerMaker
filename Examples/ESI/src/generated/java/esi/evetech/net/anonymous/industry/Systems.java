package esi.evetech.net.anonymous.industry;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetIndustrySystems;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Systems
    extends DelegateTransfer<Anonymous>
{

    public Systems(Anonymous delegate) {
        super(delegate);
    }

    /**
     * List solar system cost indices
     * 
     * <p>
     * Return cost indices for solar systems<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<GetIndustrySystems[]> get(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/industry/systems/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetIndustrySystems[].class);
    }
}
