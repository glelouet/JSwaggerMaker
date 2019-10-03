package esi.evetech.net.evesso.characters.contracts;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCharactersCharacterIdContractsContractIdItems;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Items
    extends DelegateTransfer<Evesso>
{

    public Items(Evesso delegate) {
        super(delegate);
    }

    /**
     * Get contract items
     * 
     * <p>
     * Lists items of a particular contract<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param character_id
     *     An EVE character ID
     * @param contract_id
     *     ID of a contract
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCharactersCharacterIdContractsContractIdItems[]> getByCharacterIdContractId(int character_id, int contract_id, String If_None_Match) {
        String url = ("https://esi.evetech.net/v1/characters/{character_id}/contracts/{contract_id}/items/".replace("{character_id}", ""+character_id).replace("{contract_id}", ""+contract_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdContractsContractIdItems[].class);
    }
}
