package esi.evetech.net.evesso.fleets;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetFleetsFleetIdMembers;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Members
    extends DelegateTransfer<Evesso>
{

    public Members(Evesso delegate) {
        super(delegate);
    }

    /**
     * Get fleet members
     * 
     * <p>
     * Return information about fleet members<br />
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
    public Requested<GetFleetsFleetIdMembers[]> getByFleetId(esi.evetech.net.structures.Accept_Language Accept_Language,
        long fleet_id,
        String If_None_Match,
        esi.evetech.net.structures.language language) {
        String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/members/".replace("{fleet_id}", ""+fleet_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(language==null?"":"&language="+flatten(language))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, GetFleetsFleetIdMembers[].class);
    }

    /**
     * Create fleet invitation
     * 
     * <p>
     * Invite a character into the fleet. If a character has a CSPA charge set it is not possible to invite them to the fleet using ESI
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param fleet_id
     *     ID for a fleet
     * @param character_id
     *     The character you want to invite
     * @param role
     *     If a character is invited with the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified. If a character is invited with the `wing_commander` role, only `wing_id` should be specified. If a character is invited with the `squad_commander` role, both `wing_id` and `squad_id` should be specified. If a character is invited with the `squad_member` role, `wing_id` and `squad_id` should either both be specified or not specified at all. If they aren’t specified, the invited character will join any squad with available positions.
     * @param squad_id
     *     squad_id integer
     * @param wing_id
     *     wing_id integer
     * @param token
     *     Access token to use if unable to set a header
     */
    public void postByFleetId(long fleet_id,
        int character_id,
        esi.evetech.net.structures.role role,
        long squad_id,
        long wing_id) {
        String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/members/".replace("{fleet_id}", ""+fleet_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        Map<String, Object> content = new HashMap<>();
        content.put("character_id", character_id);
        content.put("role", role);
        content.put("squad_id", squad_id);
        content.put("wing_id", wing_id);
        requestPost(url, null, content, Void.class);
    }

    /**
     * Move fleet member
     * 
     * <p>
     * Move a fleet member around
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param fleet_id
     *     ID for a fleet
     * @param member_id
     *     The character ID of a member in this fleet
     * @param role
     *     If a character is moved to the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified. If a character is moved to the `wing_commander` role, only `wing_id` should be specified. If a character is moved to the `squad_commander` role, both `wing_id` and `squad_id` should be specified. If a character is moved to the `squad_member` role, both `wing_id` and `squad_id` should be specified.
     * @param squad_id
     *     squad_id integer
     * @param wing_id
     *     wing_id integer
     * @param token
     *     Access token to use if unable to set a header
     */
    public void putByFleetIdMemberId(long fleet_id,
        int member_id,
        esi.evetech.net.structures.role role,
        long squad_id,
        long wing_id) {
        String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/members/{member_id}/".replace("{fleet_id}", ""+fleet_id).replace("{member_id}", ""+member_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        Map<String, Object> content = new HashMap<>();
        content.put("role", (role));
        content.put("squad_id", (squad_id));
        content.put("wing_id", (wing_id));
        requestPut(url, null, content, Void.class);
    }

    /**
     * Kick fleet member
     * 
     * <p>
     * Kick a fleet member
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param fleet_id
     *     ID for a fleet
     * @param member_id
     *     The character ID of a member in this fleet
     * @param token
     *     Access token to use if unable to set a header
     */
    public void deleteByFleetIdMemberId(long fleet_id, int member_id) {
        String url = ("https://esi.evetech.net/v1/fleets/{fleet_id}/members/{member_id}/".replace("{fleet_id}", ""+fleet_id).replace("{member_id}", ""+member_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        requestDel(url, null, Void.class);
    }
}
