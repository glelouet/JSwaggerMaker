package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableGoogleOauth2Logins
    extends DelegateTransfer<Anonymous>
{

    public EnableGoogleOauth2Logins(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update enable Google Oauth2 authentication
     * </p>
     * 
     * @param enable_google_oath2_logins
     */
    public void put(boolean enable_google_oath2_logins) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_google_oauth2_logins");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_google_oath2_logins", (enable_google_oath2_logins));
        requestPut(url, null, content, Void.class);
    }
}
