package esi.evetech.net.anonymous;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetStatus;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Status
    extends DelegateTransfer<Anonymous>
{

    public Status(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Retrieve the uptime and player counts
     * 
     * <p>
     * EVE Server status<br />
     * This route is cached for up to 30 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<GetStatus> get(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/status/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetStatus.class);
    }
}
