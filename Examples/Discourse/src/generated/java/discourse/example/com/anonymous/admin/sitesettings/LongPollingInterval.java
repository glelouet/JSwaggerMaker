package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class LongPollingInterval
    extends DelegateTransfer<Anonymous>
{

    public LongPollingInterval(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * long polling interval
     * </p>
     * 
     * @param long_polling_interval
     *     "Amount of time the server should wait before responding to clients when there is no data to send (logged on users only)"
     *     
     */
    public void put(long long_polling_interval) {
        String url = ("https://discourse.example.com//admin/site_settings/long_polling_interval");
        Map<String, Object> content = new HashMap<>();
        content.put("long_polling_interval", (long_polling_interval));
        requestPut(url, null, content, Void.class);
    }
}
