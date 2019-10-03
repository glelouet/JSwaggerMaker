package esi.evetech.net.evesso.characters.mail;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCharactersCharacterIdMailLabels;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Labels
    extends DelegateTransfer<Evesso>
{

    public Labels(Evesso delegate) {
        super(delegate);
    }

    /**
     * Delete a mail label
     * 
     * <p>
     * Delete a mail label
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param label_id
     *     An EVE label id
     * @param token
     *     Access token to use if unable to set a header
     */
    public void deleteByCharacterIdLabelId(int character_id, int label_id) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/mail/labels/{label_id}/".replace("{character_id}", ""+character_id).replace("{label_id}", ""+label_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        requestDel(url, null, Void.class);
    }

    /**
     * Create a mail label
     * 
     * <p>
     * Create a mail label
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param color
     *     Hexadecimal string representing label color, in RGB format
     * @param name
     *     name string
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<Integer> postByCharacterId(int character_id, esi.evetech.net.structures.color color, String name) {
        String url = ("https://esi.evetech.net/v2/characters/{character_id}/mail/labels/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        Map<String, Object> content = new HashMap<>();
        content.put("color", color);
        content.put("name", name);
        return requestPost(url, null, content, Integer.class);
    }

    /**
     * Get mail labels and unread counts
     * 
     * <p>
     * Return a list of the users mail labels, unread counts for each label and a total unread count.<br />
     * This route is cached for up to 30 seconds
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
    public Requested<GetCharactersCharacterIdMailLabels> getByCharacterId(int character_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v3/characters/{character_id}/mail/labels/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdMailLabels.class);
    }
}
