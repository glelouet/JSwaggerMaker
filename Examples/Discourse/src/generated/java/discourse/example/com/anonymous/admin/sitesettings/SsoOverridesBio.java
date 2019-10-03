package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SsoOverridesBio
    extends DelegateTransfer<Anonymous>
{

    public SsoOverridesBio(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * sso overrides bio
     * </p>
     * 
     * @param sso_overrides_bio
     */
    public void put(boolean sso_overrides_bio) {
        String url = ("https://discourse.example.com//admin/site_settings/sso_overrides_bio");
        Map<String, Object> content = new HashMap<>();
        content.put("sso_overrides_bio", (sso_overrides_bio));
        requestPut(url, null, content, Void.class);
    }
}
