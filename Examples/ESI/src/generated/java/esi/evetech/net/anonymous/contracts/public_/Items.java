package esi.evetech.net.anonymous.contracts.public_;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetContractsPublicItemsContractId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Items
    extends DelegateTransfer<Anonymous>
{

    public Items(Anonymous delegate) {
        super(delegate);
    }

    /**
     * Get public contract items
     * 
     * <p>
     * Lists items of a public contract<br />
     * This route is cached for up to 3600 seconds
     * </p>
     * 
     * @param contract_id
     *     ID of a contract
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     */
    public Requested<GetContractsPublicItemsContractId[]> getByContractId(int contract_id, String If_None_Match, Integer page) {
        String url = ("https://esi.evetech.net/v1/contracts/public/items/{contract_id}/".replace("{contract_id}", ""+contract_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetContractsPublicItemsContractId[].class);
    }
}
