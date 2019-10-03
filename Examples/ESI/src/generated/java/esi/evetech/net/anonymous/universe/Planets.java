package esi.evetech.net.anonymous.universe;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetUniversePlanetsPlanetId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Planets
    extends DelegateTransfer<Anonymous>
{

    public Planets(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get planet information
     * 
     * <p>
     * Get information on a planet<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param planet_id
     *     planet_id integer
     */
    public Requested<GetUniversePlanetsPlanetId> getByPlanetId(String If_None_Match, int planet_id) {
        String url = ("https://esi.evetech.net/v1/universe/planets/{planet_id}/".replace("{planet_id}", ""+planet_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetUniversePlanetsPlanetId.class);
    }
}
