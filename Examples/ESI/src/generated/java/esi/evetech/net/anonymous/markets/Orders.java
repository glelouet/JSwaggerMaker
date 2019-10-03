package esi.evetech.net.anonymous.markets;

import java.util.HashMap;
import esi.evetech.net.Anonymous;
import esi.evetech.net.responses.GetMarketsRegionIdOrders;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Orders
    extends DelegateTransfer<Anonymous>
{

    public Orders(Anonymous delegate) {
        super(delegate);
    }

    /**
     * List orders in a region
     * 
     * <p>
     * Return a list of orders in a region<br />
     * This route is cached for up to 300 seconds
     * </p>
     * 
     * @param datasource
     *     The server name you would like data from
     * @param If_None_Match
     *     ETag from a previous request. A 304 will be returned if this matches the current ETag
     * @param order_type
     *     Filter buy/sell orders, return all orders by default. If you query without type_id, we always return both buy and sell orders
     * @param page
     *     Which page of results to return
     * @param region_id
     *     Return orders in this region
     * @param type_id
     *     Return orders only for this type
     */
    public Requested<GetMarketsRegionIdOrders[]> getByRegionId(String If_None_Match,
        esi.evetech.net.structures.order_type order_type,
        Integer page,
        int region_id,
        Integer type_id) {
        String url = ("https://esi.evetech.net/v1/markets/{region_id}/orders/".replace("{region_id}", ""+region_id)+"?"+(delegate.datasource==null?"":"&datasource="+flatten(delegate.datasource))+(order_type==null?"":"&order_type="+flatten(order_type))+(page==null?"":"&page="+flatten(page))+(type_id==null?"":"&type_id="+flatten(type_id)));
        HashMap<String, String> headerProperties = new HashMap<String, String>();
        if (If_None_Match!= null) {
            headerProperties.put("If-None-Match", (""+ If_None_Match));
        }
        return requestGet(url, headerProperties, GetMarketsRegionIdOrders[].class);
    }
}
