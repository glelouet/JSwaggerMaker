package esi.evetech.net.anonymous;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.characters.Affiliation;
import esi.evetech.net.anonymous.characters.Corporationhistory;
import esi.evetech.net.anonymous.characters.Portrait;
import esi.evetech.net.responses.GetCharactersCharacterId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Characters
    extends DelegateTransfer<Anonymous>
{
    public final Affiliation affiliation;
    public final Corporationhistory corporationhistory;
    public final Portrait portrait;

    public Characters(Anonymous delegate) {
        super(delegate);
        affiliation = new Affiliation((delegate));
        corporationhistory = new Corporationhistory((delegate));
        portrait = new Portrait((delegate));
    }

    /**
     * Get character's public information
     * 
     * <p>
     * Public information about a character<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     */
    public Requested<GetCharactersCharacterId> getByCharacterId(int character_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v4/characters/{character_id}/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterId.class);
    }
}
