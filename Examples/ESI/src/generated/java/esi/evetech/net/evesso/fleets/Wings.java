package esi.evetech.net.evesso.fleets;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.fleets.wings.Squads;
import esi.evetech.net.responses.GetFleetsFleetIdWings;
import esi.evetech.net.responses.PostFleetsFleetIdWingsCreated;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Wings
    extends DelegateTransfer<Evesso>
{
    public final Squads squads;

    public Wings(Evesso delegate) {
        super(delegate);
        squads = new Squads((delegate));
    }

    /**
     * Get fleet wings
     * 
     * <p>
     * Return information about wings in a fleet<br />
     * This route is cached for up to 5 seconds
     * </p>
     * 
     * @param Accept_Language
     *     Language to use in the response
     * @param datasource
     *     The server name you would like data from
     * @param fleet_id
     *     ID for a fleet
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetFleetsFleetIdWings[]> getByFleetId(esi.evetech.net.structures.Accept_Language Accept_Language,
        long fleet_id,
        String If_None_Match,
        esi.evetech.net.structures.language language) {
        String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/wings/".replace("{fleet_id}", ""+fleet_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(language==null?"":"&language="+flatten(language))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, GetFleetsFleetIdWings[].class);
    }

    /**
     * Create fleet wing
     * 
     * <p>
     * Create a new wing in a fleet
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param fleet_id
     *     ID for a fleet
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<PostFleetsFleetIdWingsCreated> postByFleetId(long fleet_id) {
        String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/wings/".replace("{fleet_id}", ""+fleet_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        return requestPost(url, null, null, PostFleetsFleetIdWingsCreated.class);
    }

    /**
     * Rename fleet wing
     * 
     * <p>
     * Rename a fleet wing
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param fleet_id
     *     ID for a fleet
     * @param name
     *     name string
     * @param token
     *     Access token to use if unable to set a header
     * @param wing_id
     *     The wing to rename
     */
    public void putByFleetIdWingId(long fleet_id, String name, long wing_id) {
        String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/wings/{wing_id}/".replace("{fleet_id}", ""+fleet_id).replace("{wing_id}", ""+wing_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        Map<String, Object> content = new HashMap<>();
        content.put("name", (name));
        requestPut(url, null, content, Void.class);
    }

    /**
     * Delete fleet wing
     * 
     * <p>
     * Delete a fleet wing, only empty wings can be deleted. The wing may contain squads, but the squads must be empty
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param fleet_id
     *     ID for a fleet
     * @param token
     *     Access token to use if unable to set a header
     * @param wing_id
     *     The wing to delete
     */
    public void deleteByFleetIdWingId(long fleet_id, long wing_id) {
        String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/wings/{wing_id}/".replace("{fleet_id}", ""+fleet_id).replace("{wing_id}", ""+wing_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        requestDel(url, null, Void.class);
    }
}
