package esi.evetech.net.evesso.characters.wallet;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCharactersCharacterIdWalletTransactions;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Transactions
    extends DelegateTransfer<Evesso>
{

    public Transactions(Evesso delegate) {
        super(delegate);
    }

    /**
     * Get wallet transactions
     * 
     * <p>
     * Get wallet transactions of a character<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param datasource
     *     The server name you would like data from
     * @param from_id
     *     Only show transactions happened before the one referenced by this id
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCharactersCharacterIdWalletTransactions[]> getByCharacterId(int character_id, Long from_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/wallet/transactions/".replace("{character_id}", ""+character_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(from_id==null?"":"&from_id="+flatten(from_id))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdWalletTransactions[].class);
    }
}
