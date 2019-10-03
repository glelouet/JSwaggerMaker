package esi.evetech.net.evesso.characters.notifications;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCharactersCharacterIdNotificationsContacts;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Contacts
    extends DelegateTransfer<Evesso>
{

    public Contacts(Evesso delegate) {
        super(delegate);
    }

    /**
     * Get new contact notifications
     * 
     * <p>
     * Return notifications about having been added to someone's contact list<br />
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
    public Requested<GetCharactersCharacterIdNotificationsContacts[]> getByCharacterId(int character_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/notifications/contacts/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdNotificationsContacts[].class);
    }
}
