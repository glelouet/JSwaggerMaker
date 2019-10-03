package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class LogoUrl
    extends DelegateTransfer<Anonymous>
{

    public LogoUrl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update logo url
     * </p>
     * 
     * @param logo_url
     */
    public void put(String logo_url) {
        String url = ("https://discourse.example.com//admin/site_settings/logo_url");
        Map<String, Object> content = new HashMap<>();
        content.put("logo_url", (logo_url));
        requestPut(url, null, content, Void.class);
    }
}
