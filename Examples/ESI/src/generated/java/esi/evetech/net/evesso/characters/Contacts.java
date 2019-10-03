package esi.evetech.net.evesso.characters;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.characters.contacts.Labels;
import esi.evetech.net.responses.GetCharactersCharacterIdContacts;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Contacts
    extends DelegateTransfer<Evesso>
{
    public final Labels labels;

    public Contacts(Evesso delegate) {
        super(delegate);
        labels = new Labels((delegate));
    }

    /**
     * Get contacts
     * 
     * <p>
     * Return contacts of a character<br />
     * This route is cached for up to 300 seconds
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCharactersCharacterIdContacts[]> getByCharacterId(int character_id, String If_None_Match, Integer page) {
        String url = ("https://esi.evetech.net/v2/characters/{character_id}/contacts/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdContacts[].class);
    }

    /**
     * Add contacts
     * 
     * <p>
     * Bulk add contacts with same settings
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param contact_ids
     *     A list of contacts
     * @param datasource
     *     The server name you would like data from
     * @param label_ids
     *     Add custom labels to the new contact
     * @param standing
     *     Standing for the contact
     * @param token
     *     Access token to use if unable to set a header
     * @param watched
     *     Whether the contact should be watched, note this is only effective on characters
     */
    public Requested<int[]> postByCharacterId(int character_id,
        int[] contact_ids,
        long[] label_ids,
        float standing,
        Boolean watched) {
        String url = ("https://esi.evetech.net/v2/characters/{character_id}/contacts/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(label_ids==null?"":"&label_ids="+flatten(label_ids))+"&standing="+flatten(standing)+(delegate.token==null?"":"&token="+flatten(delegate.token))+(watched==null?"":"&watched="+flatten(watched)));
        Map<String, Object> content = new HashMap<>();
        content.put("contact_ids", contact_ids);
        return requestPost(url, null, content, int[].class);
    }

    /**
     * Edit contacts
     * 
     * <p>
     * Bulk edit contacts with same settings
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param contact_ids
     *     A list of contacts
     * @param datasource
     *     The server name you would like data from
     * @param label_ids
     *     Add custom labels to the contact
     * @param standing
     *     Standing for the contact
     * @param token
     *     Access token to use if unable to set a header
     * @param watched
     *     Whether the contact should be watched, note this is only effective on characters
     */
    public void putByCharacterId(int character_id,
        int[] contact_ids,
        long[] label_ids,
        float standing,
        Boolean watched) {
        String url = ("https://esi.evetech.net/v2/characters/{character_id}/contacts/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(label_ids==null?"":"&label_ids="+flatten(label_ids))+"&standing="+flatten(standing)+(delegate.token==null?"":"&token="+flatten(delegate.token))+(watched==null?"":"&watched="+flatten(watched)));
        Map<String, Object> content = new HashMap<>();
        content.put("contact_ids", (contact_ids));
        requestPut(url, null, content, Void.class);
    }

    /**
     * Delete contacts
     * 
     * <p>
     * Bulk delete contacts
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param contact_ids
     *     A list of contacts to delete
     * @param datasource
     *     The server name you would like data from
     * @param token
     *     Access token to use if unable to set a header
     */
    public void deleteByCharacterId(int character_id, int[] contact_ids) {
        String url = ("https://esi.evetech.net/v2/characters/{character_id}/contacts/".replace("{character_id}", ""+character_id)+"?"+(contact_ids==null?"":"&contact_ids="+flatten(contact_ids))+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        requestDel(url, null, Void.class);
    }
}
