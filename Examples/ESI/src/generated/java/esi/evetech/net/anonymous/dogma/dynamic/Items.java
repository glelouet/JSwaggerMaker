package esi.evetech.net.anonymous.dogma.dynamic;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetDogmaDynamicItemsTypeIdItemId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Items
    extends DelegateTransfer<Anonymous>
{

    public Items(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get dynamic item information
     * 
     * <p>
     * Returns info about a dynamic item resulting from mutation with a mutaplasmid.<br />
     * This route expires daily at 11:05
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param item_id
     *     item_id integer
     * @param type_id
     *     type_id integer
     */
    public Requested<GetDogmaDynamicItemsTypeIdItemId> getByTypeIdItemId(String If_None_Match, long item_id, int type_id) {
        String url = ("https://esi.evetech.net/v1/dogma/dynamic/items/{type_id}/{item_id}/".replace("{item_id}", ""+item_id).replace("{type_id}", ""+type_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetDogmaDynamicItemsTypeIdItemId.class);
    }
}
