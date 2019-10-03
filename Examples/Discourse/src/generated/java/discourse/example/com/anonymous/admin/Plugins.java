package discourse.example.com.anonymous.admin;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Plugins
    extends DelegateTransfer<Anonymous>
{

    public Plugins(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * get a list of installed plugins
     * </p>
     */
    public Requested<Object> get() {
        String url = ("https://discourse.example.com//admin/plugins");
        return requestGet(url, null, Object.class);
    }
}
