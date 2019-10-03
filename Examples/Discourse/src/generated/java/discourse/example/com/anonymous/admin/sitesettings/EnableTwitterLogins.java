package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableTwitterLogins
    extends DelegateTransfer<Anonymous>
{

    public EnableTwitterLogins(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Enable twitter logins
     * </p>
     * 
     * @param enable_twitter_logins
     */
    public void put(boolean enable_twitter_logins) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_twitter_logins");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_twitter_logins", (enable_twitter_logins));
        requestPut(url, null, content, Void.class);
    }
}
