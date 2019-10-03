package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PollingInterval
    extends DelegateTransfer<Anonymous>
{

    public PollingInterval(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * polling interval
     * </p>
     * 
     * @param polling_interval
     *     "When not long polling, how often should logged on clients poll in milliseconds"
     *     
     */
    public void put(long polling_interval) {
        String url = ("https://discourse.example.com//admin/site_settings/polling_interval");
        Map<String, Object> content = new HashMap<>();
        content.put("polling_interval", (polling_interval));
        requestPut(url, null, content, Void.class);
    }
}
