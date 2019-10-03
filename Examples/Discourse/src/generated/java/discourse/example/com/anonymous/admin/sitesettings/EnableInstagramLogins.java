package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableInstagramLogins
    extends DelegateTransfer<Anonymous>
{

    public EnableInstagramLogins(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable instagram logins
     * </p>
     * 
     * @param enable_instagram_logins
     */
    public void put(boolean enable_instagram_logins) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_instagram_logins");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_instagram_logins", (enable_instagram_logins));
        requestPut(url, null, content, Void.class);
    }
}
