package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AnonPollingInterval
    extends DelegateTransfer<Anonymous>
{

    public AnonPollingInterval(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * anon polling interval
     * </p>
     * 
     * @param anon_polling_interval
     *     "How often should anonymous clients poll in milliseconds"
     *     
     */
    public void put(long anon_polling_interval) {
        String url = ("https://discourse.example.com//admin/site_settings/anon_polling_interval");
        Map<String, Object> content = new HashMap<>();
        content.put("anon_polling_interval", (anon_polling_interval));
        requestPut(url, null, content, Void.class);
    }
}
