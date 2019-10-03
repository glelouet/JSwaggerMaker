package esi.evetech.net.anonymous.universe;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetUniverseStarsStarId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Stars
    extends DelegateTransfer<Anonymous>
{

    public Stars(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get star information
     * 
     * <p>
     * Get information on a star<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param star_id
     *     star_id integer
     */
    public Requested<GetUniverseStarsStarId> getByStarId(String If_None_Match, int star_id) {
        String url = ("https://esi.evetech.net/v1/universe/stars/{star_id}/".replace("{star_id}", ""+star_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetUniverseStarsStarId.class);
    }
}
