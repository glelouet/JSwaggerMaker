package esi.evetech.net.anonymous.fw;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetFwSystems;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Systems
    extends DelegateTransfer<Anonymous>
{

    public Systems(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Ownership of faction warfare systems
     * 
     * <p>
     * An overview of the current ownership of faction warfare solar systems<br />
     * This route is cached for up to 1800 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<GetFwSystems[]> get(String If_None_Match) {
        String url = ("https://esi.evetech.net/v2/fw/systems/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetFwSystems[].class);
    }
}
