package esi.evetech.net.anonymous.characters;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.PostCharactersAffiliation;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Affiliation
    extends DelegateTransfer<Anonymous>
{

    public Affiliation(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Character affiliation
     * 
     * <p>
     * Bulk lookup of character IDs to corporation, alliance and faction<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param characters
     *     The character IDs to fetch affiliations for. All characters must exist, or none will be returned
     * @param datasource
     *     The server name you would like data from
     */
    public Requested<PostCharactersAffiliation[]> post(int[] characters) {
        String url = ("https://esi.evetech.net/v1/characters/affiliation/"+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        Map<String, Object> content = new HashMap<>();
        content.put("characters", characters);
        return requestPost(url, null, content, PostCharactersAffiliation[].class);
    }
}
