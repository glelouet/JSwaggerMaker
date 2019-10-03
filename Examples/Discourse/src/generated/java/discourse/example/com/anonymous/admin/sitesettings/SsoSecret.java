package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SsoSecret
    extends DelegateTransfer<Anonymous>
{

    public SsoSecret(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * sso secret
     * </p>
     * 
     * @param sso_secret
     */
    public void put(String sso_secret) {
        String url = ("https://discourse.example.com//admin/site_settings/sso_secret");
        Map<String, Object> content = new HashMap<>();
        content.put("sso_secret", (sso_secret));
        requestPut(url, null, content, Void.class);
    }
}
