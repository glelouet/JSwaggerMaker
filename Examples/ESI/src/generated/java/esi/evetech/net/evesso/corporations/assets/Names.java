package esi.evetech.net.evesso.corporations.assets;

import java.util.HashMap;
import java.util.Map;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.PostCharactersCharacterIdAssetsNames;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Names
    extends DelegateTransfer<Evesso>
{
    /**
     * the roles required for {@link #postByCorporationId this method}
     */
    public static final String[] POST_CORPORATIONS_CORPORATION_ID_ASSETS_NAMES_ROLES = new String[] {"Director"};

    public Names(Evesso delegate) {
        super(delegate);
    }

    /**
     * Get corporation asset names
     * 
     * <p>
     * Return names for a set of item ids, which you can get from corporation assets endpoint. Only valid for items that can customize names, like containers or ships<br />
     * Requires one of the following EVE corporation role(s): Director
     * </p>
     * <p>
     * require the roles specified {@link #POST_CORPORATIONS_CORPORATION_ID_ASSETS_NAMES_ROLES here}
     * </p>
     * 
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param item_ids
     *     A list of item ids
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<PostCharactersCharacterIdAssetsNames[]> postByCorporationId(int corporation_id, long[] item_ids) {
        String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/assets/names/".replace("{corporation_id}", ""+corporation_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        Map<String, Object> content = new HashMap<>();
        content.put("item_ids", item_ids);
        return requestPost(url, null, content, PostCharactersCharacterIdAssetsNames[].class);
    }
}
