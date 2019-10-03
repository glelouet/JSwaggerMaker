package esi.evetech.net.evesso.characters.assets;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.PostCharactersCharacterIdAssetsNames;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Names
    extends DelegateTransfer<Evesso>
{

    public Names(Evesso delegate) {
        super(delegate);
    }

    /**
     * Get character asset names
     * 
     * <p>
     * Return names for a set of item ids, which you can get from character assets endpoint. Typically used for items that can customize names, like containers or ships.
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param item_ids
     *     A list of item ids
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<PostCharactersCharacterIdAssetsNames[]> postByCharacterId(int character_id, long[] item_ids) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/assets/names/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        Map<String, Object> content = new HashMap<>();
        content.put("item_ids", item_ids);
        return requestPost(url, null, content, PostCharactersCharacterIdAssetsNames[].class);
    }
}
