package esi.evetech.net.evesso.characters;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.evesso.characters.orders.History;
import esi.evetech.net.responses.GetCharactersCharacterIdOrders;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Orders
    extends DelegateTransfer<Evesso>
{
    public final History history;

    public Orders(Evesso delegate) {
        super(delegate);
        history = new History((delegate));
    }

    /**
     * List open orders from a character
     * 
     * <p>
     * List open market orders placed by a character<br />
     * This route is cached for up to 1200 seconds
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
    public Requested<GetCharactersCharacterIdOrders[]> getByCharacterId(int character_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v2/characters/{character_id}/orders/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdOrders[].class);
    }
}
