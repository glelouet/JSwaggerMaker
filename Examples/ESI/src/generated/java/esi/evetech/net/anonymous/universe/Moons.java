package esi.evetech.net.anonymous.universe;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetUniverseMoonsMoonId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Moons
    extends DelegateTransfer<Anonymous>
{

    public Moons(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get moon information
     * 
     * <p>
     * Get information on a moon<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param moon_id
     *     moon_id integer
     */
    public Requested<GetUniverseMoonsMoonId> getByMoonId(String If_None_Match, int moon_id) {
        String url = ("https://esi.evetech.net/v1/universe/moons/{moon_id}/".replace("{moon_id}", ""+moon_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetUniverseMoonsMoonId.class);
    }
}
