package esi.evetech.net.evesso.characters;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCharactersCharacterIdPlanets;
import esi.evetech.net.responses.GetCharactersCharacterIdPlanetsPlanetId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Planets
    extends DelegateTransfer<Evesso>
{

    public Planets(Evesso delegate) {
        super(delegate);
    }

    /**
     * Get colonies
     * 
     * <p>
     * Returns a list of all planetary colonies owned by a character.<br />
     * This route is cached for up to 600 seconds
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCharactersCharacterIdPlanets[]> getByCharacterId(int character_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/planets/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdPlanets[].class);
    }

    /**
     * Get colony layout
     * 
     * <p>
     * Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information will not update until this criteria is met.<br />
     * This route is cached for up to 600 seconds
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param planet_id
     *     Planet id of the target planet
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCharactersCharacterIdPlanetsPlanetId> getByCharacterIdPlanetId(int character_id, String If_None_Match, int planet_id) {
        String url = ("https://esi.evetech.net/v3/characters/{character_id}/planets/{planet_id}/".replace("{character_id}", ""+character_id).replace("{planet_id}", ""+planet_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdPlanetsPlanetId.class);
    }
}
