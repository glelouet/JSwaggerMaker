package esi.evetech.net.anonymous.universe;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetUniverseStargatesStargateId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Stargates
    extends DelegateTransfer<Anonymous>
{

    public Stargates(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get stargate information
     * 
     * <p>
     * Get information on a stargate<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param stargate_id
     *     stargate_id integer
     */
    public Requested<GetUniverseStargatesStargateId> getByStargateId(String If_None_Match, int stargate_id) {
        String url = ("https://esi.evetech.net/v1/universe/stargates/{stargate_id}/".replace("{stargate_id}", ""+stargate_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetUniverseStargatesStargateId.class);
    }
}
