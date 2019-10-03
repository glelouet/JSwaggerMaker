package esi.evetech.net.evesso.characters.mail;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCharactersCharacterIdMailLists;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Lists
    extends DelegateTransfer<Evesso>
{

    public Lists(Evesso delegate) {
        super(delegate);
    }

    /**
     * Return mailing list subscriptions
     * 
     * <p>
     * Return all mailing lists that the character is subscribed to<br />
     * This route is cached for up to 120 seconds
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
    public Requested<GetCharactersCharacterIdMailLists[]> getByCharacterId(int character_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/mail/lists/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdMailLists[].class);
    }
}
