package esi.evetech.net.anonymous.universe;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetUniverseConstellationsConstellationId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Constellations
    extends DelegateTransfer<Anonymous>
{

    public Constellations(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get constellations
     * 
     * <p>
     * Get a list of constellations<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<int[]> get(String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/universe/constellations/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, int[].class);
    }

    /**
     * Get constellation information
     * 
     * <p>
     * Get information on a constellation<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param Accept_Language
     *     Language to use in the response
     * @param constellation_id
     *     constellation_id integer
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     */
    public Requested<GetUniverseConstellationsConstellationId> getByConstellationId(esi.evetech.net.structures.Accept_Language Accept_Language,
        int constellation_id,
        String If_None_Match,
        esi.evetech.net.structures.language language) {
        String url = ("https://esi.evetech.net/v1/universe/constellations/{constellation_id}/".replace("{constellation_id}", ""+constellation_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(language==null?"":"&language="+flatten(language)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, GetUniverseConstellationsConstellationId.class);
    }
}
