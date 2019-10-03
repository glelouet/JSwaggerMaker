package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class About_json
    extends DelegateTransfer<Anonymous>
{

    public About_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * fetch about page data
     * </p>
     */
    public Requested<Object> get() {
        String url = ("https://discourse.example.com//about.json");
        return requestGet(url, null, Object.class);
    }
}
