package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class FaviconUrl
    extends DelegateTransfer<Anonymous>
{

    public FaviconUrl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the favicon url
     * </p>
     * 
     * @param favicon_url
     */
    public void put(String favicon_url) {
        String url = ("https://discourse.example.com//admin/site_settings/favicon_url");
        Map<String, Object> content = new HashMap<>();
        content.put("favicon_url", (favicon_url));
        requestPut(url, null, content, Void.class);
    }
}
