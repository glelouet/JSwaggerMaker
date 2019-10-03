package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class LongPollingBaseUrl
    extends DelegateTransfer<Anonymous>
{

    public LongPollingBaseUrl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * long polling base url
     * </p>
     * 
     * @param long_polling_base_url
     *     "Base URL used for long polling (when a CDN is serving dynamic content, be sure to set this to origin pull) eg: http://origin.site.com"
     *     
     */
    public void put(String long_polling_base_url) {
        String url = ("https://discourse.example.com//admin/site_settings/long_polling_base_url");
        Map<String, Object> content = new HashMap<>();
        content.put("long_polling_base_url", (long_polling_base_url));
        requestPut(url, null, content, Void.class);
    }
}
