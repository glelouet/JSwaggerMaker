package esi.evetech.net.evesso.characters;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.characters.notifications.Contacts;
import esi.evetech.net.responses.GetCharactersCharacterIdNotifications;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Notifications
    extends DelegateTransfer<Evesso>
{
    public final Contacts contacts;

    public Notifications(Evesso delegate) {
        super(delegate);
        contacts = new Contacts((delegate));
    }

    /**
     * Get character notifications
     * 
     * <p>
     * Return character notifications<br />
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
    public Requested<GetCharactersCharacterIdNotifications[]> getByCharacterId(int character_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v5/characters/{character_id}/notifications/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdNotifications[].class);
    }
}
