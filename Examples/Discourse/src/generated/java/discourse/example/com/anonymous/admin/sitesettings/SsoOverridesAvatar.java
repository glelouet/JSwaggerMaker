package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SsoOverridesAvatar
    extends DelegateTransfer<Anonymous>
{

    public SsoOverridesAvatar(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * sso overrides avatar
     * </p>
     * 
     * @param sso_overrides_avatar
     */
    public void put(boolean sso_overrides_avatar) {
        String url = ("https://discourse.example.com//admin/site_settings/sso_overrides_avatar");
        Map<String, Object> content = new HashMap<>();
        content.put("sso_overrides_avatar", (sso_overrides_avatar));
        requestPut(url, null, content, Void.class);
    }
}
