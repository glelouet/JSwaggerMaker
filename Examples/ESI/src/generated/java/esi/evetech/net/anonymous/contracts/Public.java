package esi.evetech.net.anonymous.contracts;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.anonymous.contracts.public_.Bids;
import esi.evetech.net.anonymous.contracts.public_.Items;
import esi.evetech.net.responses.GetContractsPublicRegionId;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Public
    extends DelegateTransfer<Anonymous>
{
    public final Bids bids;
    public final Items items;

    public Public(Anonymous delegate) {
        super(delegate);
        bids = new Bids((delegate));
        items = new Items((delegate));
    }

    /**
     * Get public contracts
     * 
     * <p>
     * Returns a paginated list of all public contracts in the given region<br />
     * This route is cached for up to 1800 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param page
     *     Which page of results to return
     * @param region_id
     *     An EVE region id
     */
    public Requested<GetContractsPublicRegionId[]> getByRegionId(String If_None_Match, Integer page, int region_id) {
        String url = ("https://esi.evetech.net/v1/contracts/public/{region_id}/".replace("{region_id}", ""+region_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(page==null?"":"&page="+flatten(page)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetContractsPublicRegionId[].class);
    }
}
