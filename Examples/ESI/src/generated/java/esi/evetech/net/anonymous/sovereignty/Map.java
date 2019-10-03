package esi.evetech.net.anonymous.sovereignty;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetSovereigntyMap;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Map
    extends DelegateTransfer<Anonymous>
{

    public Map(Anonymous delegate) {
        super(delegate);
    }

    /**
     * List sovereignty of systems
     * 
     * <p>
     * Shows sovereignty information for solar systems<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<GetSovereigntyMap[]> get(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/sovereignty/map/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetSovereigntyMap[].class);
    }
}
