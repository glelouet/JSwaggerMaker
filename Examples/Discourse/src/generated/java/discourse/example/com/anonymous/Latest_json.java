package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Latest_json
    extends DelegateTransfer<Anonymous>
{

    public Latest_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get the latest topics
     * </p>
     * 
     * @param order
     * @param ascending
     *     defaults to desc, add `ascending=true` to sort asc
     */
    public Requested<Object> get(discourse.example.com.structures.order order, Boolean ascending) {
        String url = ("https://discourse.example.com//latest.json".replace("{order}", ""+order).replace("{ascending}", ""+ascending));
        return requestGet(url, null, Object.class);
    }
}
