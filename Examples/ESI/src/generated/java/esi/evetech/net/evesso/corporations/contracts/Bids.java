package esi.evetech.net.evesso.corporations.contracts;

import java.util.HashMap;
import esi.evetech.net.Evesso;
import esi.evetech.net.responses.GetCharactersCharacterIdContractsContractIdBids;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Bids
    extends DelegateTransfer<Evesso>
{

    public Bids(Evesso delegate) {
        super(delegate);
    }

    /**
     * Get corporation contract bids
     * 
     * <p>
     * Lists bids on a particular auction contract<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param contract_id
     *     ID of a contract
     * @param corporation_id
     *     An EVE corporation ID
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     * @param token
     *     Access token to use if unable to set a header
     */
    public Requested<GetCharactersCharacterIdContractsContractIdBids[]> getByCorporationIdContractId(int contract_id,
        int corporation_id,
        String If_None_Match,
        Integer page) {
        String url = ("https://esi.evetech.net/v1/corporations/{corporation_id}/contracts/{contract_id}/bids/".replace("{contract_id}", ""+contract_id).replace("{corporation_id}", ""+corporation_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page))+(delegate.token==null?"":"&token="+flatten(delegate.token)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetCharactersCharacterIdContractsContractIdBids[].class);
    }
}
