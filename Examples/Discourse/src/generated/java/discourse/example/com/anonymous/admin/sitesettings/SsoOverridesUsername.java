package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SsoOverridesUsername
    extends DelegateTransfer<Anonymous>
{

    public SsoOverridesUsername(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * sso overrides username
     * </p>
     * 
     * @param sso_overrides_username
     */
    public void put(boolean sso_overrides_username) {
        String url = ("https://discourse.example.com//admin/site_settings/sso_overrides_username");
        Map<String, Object> content = new HashMap<>();
        content.put("sso_overrides_username", (sso_overrides_username));
        requestPut(url, null, content, Void.class);
    }
}
