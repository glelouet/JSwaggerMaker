package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableSsoProvider
    extends DelegateTransfer<Anonymous>
{

    public EnableSsoProvider(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable sso provider
     * </p>
     * 
     * @param enable_sso_provider
     */
    public void put(boolean enable_sso_provider) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_sso_provider");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_sso_provider", (enable_sso_provider));
        requestPut(url, null, content, Void.class);
    }
}
