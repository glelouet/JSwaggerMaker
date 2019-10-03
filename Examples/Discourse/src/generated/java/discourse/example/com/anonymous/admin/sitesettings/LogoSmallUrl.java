package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class LogoSmallUrl
    extends DelegateTransfer<Anonymous>
{

    public LogoSmallUrl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the small logo url
     * </p>
     * 
     * @param logo_small_url
     */
    public void put(String logo_small_url) {
        String url = ("https://discourse.example.com//admin/site_settings/logo_small_url");
        Map<String, Object> content = new HashMap<>();
        content.put("logo_small_url", (logo_small_url));
        requestPut(url, null, content, Void.class);
    }
}
