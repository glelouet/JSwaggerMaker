package esi.evetech.net.anonymous.universe;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Structures
    extends DelegateTransfer<Anonymous>
{

    public Structures(Anonymous delegate) {
        super(delegate);
    }

    /**
     * List all public structures
     * 
     * <p>
     * List all public structures<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param filter
     *     Only list public structures that have this service online
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<long[]> get(esi.evetech.net.structures.filter filter, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/universe/structures/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(filter==null?"":"&filter="+flatten(filter)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, long[].class);
    }
}
