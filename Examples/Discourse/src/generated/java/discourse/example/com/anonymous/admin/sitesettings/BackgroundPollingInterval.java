package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class BackgroundPollingInterval
    extends DelegateTransfer<Anonymous>
{

    public BackgroundPollingInterval(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * background polling interval
     * </p>
     * 
     * @param background_polling_interval
     *     "How often should the clients poll in milliseconds (when the window is in the background)"
     *     
     */
    public void put(long background_polling_interval) {
        String url = ("https://discourse.example.com//admin/site_settings/background_polling_interval");
        Map<String, Object> content = new HashMap<>();
        content.put("background_polling_interval", (background_polling_interval));
        requestPut(url, null, content, Void.class);
    }
}
