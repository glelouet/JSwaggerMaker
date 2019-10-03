package discourse.example.com.anonymous;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Groups_json
    extends DelegateTransfer<Anonymous>
{

    public Groups_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Get some groups
     * </p>
     */
    public Requested<Object[]> get() {
        String url = ("https://discourse.example.com//groups.json");
        return requestGet(url, null, Object[].class);
    }
}
