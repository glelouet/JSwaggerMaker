package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SsoOverridesName
    extends DelegateTransfer<Anonymous>
{

    public SsoOverridesName(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * sso overrides name
     * </p>
     * 
     * @param sso_overrides_name
     */
    public void put(boolean sso_overrides_name) {
        String url = ("https://discourse.example.com//admin/site_settings/sso_overrides_name");
        Map<String, Object> content = new HashMap<>();
        content.put("sso_overrides_name", (sso_overrides_name));
        requestPut(url, null, content, Void.class);
    }
}
