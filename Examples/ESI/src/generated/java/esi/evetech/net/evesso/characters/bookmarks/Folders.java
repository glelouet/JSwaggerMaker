package esi.evetech.net.evesso.characters.bookmarks;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCharactersCharacterIdBookmarksFolders;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Folders
    extends DelegateTransfer<Evesso>
{

    public Folders(Evesso delegate) {
        super(delegate);
    }

    /**
     * List bookmark folders
     * 
     * <p>
     * A list of your character's personal bookmark folders<br />
     * This route is cached for up to 3600 seconds
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
    public Requested<GetCharactersCharacterIdBookmarksFolders[]> getByCharacterId(int character_id, String If_None_Match, Integer page) {
        String url = ("https://esi.evetech.net/v2/characters/{character_id}/bookmarks/folders/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdBookmarksFolders[].class);
    }
}
