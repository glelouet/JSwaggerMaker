package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class DirectoryItems_json
    extends DelegateTransfer<Anonymous>
{

    public DirectoryItems_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get a public list of users
     * </p>
     * 
     * @param period
     * @param order
     * @param asc
     * @param page
     */
    public Requested<Object> get(discourse.example.com.structures.period period,
        discourse.example.com.structures.order order,
        Boolean asc,
        Long page) {
        String url = ("https://discourse.example.com//directory_items.json?period={period}&order={order}"+"?"+(period==null?"":"&period="+flatten(period))+(order==null?"":"&order="+flatten(order))+(asc==null?"":"&asc="+flatten(asc))+(page==null?"":"&page="+flatten(page)));
        return requestGet(url, null, Object.class);
    }
}
