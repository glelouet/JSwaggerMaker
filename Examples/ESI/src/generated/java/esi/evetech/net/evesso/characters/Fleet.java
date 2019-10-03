package esi.evetech.net.evesso.characters;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCharactersCharacterIdFleet;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Fleet
    extends DelegateTransfer<Evesso>
{

    public Fleet(Evesso delegate) {
        super(delegate);
    }

    /**
     * Get character fleet info
     * 
     * <p>
     * Return the fleet ID the character is in, if any.<br />
     * This route is cached for up to 60 seconds<br />
     * Warning: This route has an upgrade available<br />
     * [Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/characters/{character_id}/fleet/)
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
    public Requested<GetCharactersCharacterIdFleet> getByCharacterId(int character_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/fleet/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdFleet.class);
    }
}
