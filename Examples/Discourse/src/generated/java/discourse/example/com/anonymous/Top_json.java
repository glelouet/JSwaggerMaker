package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Top_json
    extends DelegateTransfer<Anonymous>
{

    public Top_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get the top topics
     * </p>
     */
    public Requested<Object> get() {
        String url = ("https://discourse.example.com//top.json");
        return requestGet(url, null, Object.class);
    }
}
