package esi.evetech.net.anonymous.universe;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetUniverseAsteroidBeltsAsteroidBeltId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class AsteroidBelts
    extends DelegateTransfer<Anonymous>
{

    public AsteroidBelts(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get asteroid belt information
     * 
     * <p>
     * Get information on an asteroid belt<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param asteroid_belt_id
     *     asteroid_belt_id integer
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<GetUniverseAsteroidBeltsAsteroidBeltId> getByAsteroidBeltId(int asteroid_belt_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/universe/asteroid_belts/{asteroid_belt_id}/".replace("{asteroid_belt_id}", ""+asteroid_belt_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetUniverseAsteroidBeltsAsteroidBeltId.class);
    }
}
