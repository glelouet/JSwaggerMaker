package esi.evetech.net.evesso.characters;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCharactersCharacterIdFittings;
import esi.evetech.net.responses.PostCharactersCharacterIdFittingsCreated;
import esi.evetech.net.responses.getcharacterscharacteridfittings.GetCharactersCharacterIdFittingsItems;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Fittings
    extends DelegateTransfer<Evesso>
{

    public Fittings(Evesso delegate) {
        super(delegate);
    }

    /**
     * Delete fitting
     * 
     * <p>
     * Delete a fitting from a character
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param fitting_id
     *     ID for a fitting of this character
     * @param token
     *     Access token to use if unable to set a header
     */
    public void deleteByCharacterIdFittingId(int character_id, int fitting_id) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/fittings/{fitting_id}/".replace("{character_id}", ""+character_id).replace("{fitting_id}", ""+fitting_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        requestDel(url, null, Void.class);
    }

    /**
     * Get fittings
     * 
     * <p>
     * Return fittings of a character<br />
     * This route is cached for up to 300 seconds
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
    public Requested<GetCharactersCharacterIdFittings[]> getByCharacterId(int character_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v2/characters/{character_id}/fittings/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdFittings[].class);
    }

    /**
     * Create fitting
     * 
     * <p>
     * Save a new fitting for a character
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param description
     *     description string
     * @param items
     *     items array
     * @param name
     *     name string
     * @param ship_type_id
     *     ship_type_id integer
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<PostCharactersCharacterIdFittingsCreated> postByCharacterId(int character_id,
        String description,
        GetCharactersCharacterIdFittingsItems[] items,
        String name,
        int ship_type_id) {
        String url = ("https://esi.evetech.net/v2/characters/{character_id}/fittings/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        Map<String, Object> content = new HashMap<>();
        content.put("description", description);
        content.put("items", items);
        content.put("name", name);
        content.put("ship_type_id", ship_type_id);
        return requestPost(url, null, content, PostCharactersCharacterIdFittingsCreated.class);
    }
}
