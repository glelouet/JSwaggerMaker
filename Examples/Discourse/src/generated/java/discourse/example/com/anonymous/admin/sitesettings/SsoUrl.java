package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SsoUrl
    extends DelegateTransfer<Anonymous>
{

    public SsoUrl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * sso url
     * </p>
     * 
     * @param sso_url
     */
    public void put(String sso_url) {
        String url = ("https://discourse.example.com//admin/site_settings/sso_url");
        Map<String, Object> content = new HashMap<>();
        content.put("sso_url", (sso_url));
        requestPut(url, null, content, Void.class);
    }
}
