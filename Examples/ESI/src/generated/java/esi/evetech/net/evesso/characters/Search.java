package esi.evetech.net.evesso.characters;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCharactersCharacterIdSearch;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Search
    extends DelegateTransfer<Evesso>
{

    public Search(Evesso delegate) {
        super(delegate);
    }

    /**
     * Search on a string
     * 
     * <p>
     * Search for entities that match a given sub-string.<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param Accept_Language
     *     Language to use in the response
     * @param categories
     *     Type of entities to search for
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param language
     *     Language to use in the response, takes precedence over Accept-Language
     * @param search
     *     The string to search on
     * @param strict
     *     Whether the search should be a strict match
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCharactersCharacterIdSearch> getByCharacterId(esi.evetech.net.structures.Accept_Language Accept_Language,
        String[] categories,
        int character_id,
        String If_None_Match,
        esi.evetech.net.structures.language language,
        String search,
        Boolean strict) {
        String url = ("https://esi.evetech.net/v3/characters/{character_id}/search/".replace("{character_id}", ""+character_id)+"?"+(categories==null?"":"&categories="+flatten(categories))+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(language==null?"":"&language="+flatten(language))+(search==null?"":"&search="+flatten(search))+(strict==null?"":"&strict="+flatten(strict))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        if (Accept_Language!= null) {
            headerProperties.put("Accept-Language", (""+ Accept_Language));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdSearch.class);
    }
}
