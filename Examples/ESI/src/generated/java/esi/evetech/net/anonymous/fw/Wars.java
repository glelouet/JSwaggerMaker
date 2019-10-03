package esi.evetech.net.anonymous.fw;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetFwWars;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Wars
    extends DelegateTransfer<Anonymous>
{

    public Wars(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Data about which NPC factions are at war
     * 
     * <p>
     * Data about which NPC factions are at war<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<GetFwWars[]> get(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/fw/wars/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetFwWars[].class);
    }
}
