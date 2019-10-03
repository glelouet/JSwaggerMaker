package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SsoOverridesEmail
    extends DelegateTransfer<Anonymous>
{

    public SsoOverridesEmail(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * sso overrides email
     * </p>
     * 
     * @param sso_overrides_email
     */
    public void put(boolean sso_overrides_email) {
        String url = ("https://discourse.example.com//admin/site_settings/sso_overrides_email");
        Map<String, Object> content = new HashMap<>();
        content.put("sso_overrides_email", (sso_overrides_email));
        requestPut(url, null, content, Void.class);
    }
}
