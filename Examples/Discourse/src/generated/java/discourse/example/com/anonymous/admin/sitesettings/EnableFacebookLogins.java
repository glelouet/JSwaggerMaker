package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableFacebookLogins
    extends DelegateTransfer<Anonymous>
{

    public EnableFacebookLogins(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable facebook logins
     * </p>
     * 
     * @param enable_facebook_logins
     */
    public void put(boolean enable_facebook_logins) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_facebook_logins");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_facebook_logins", (enable_facebook_logins));
        requestPut(url, null, content, Void.class);
    }
}
