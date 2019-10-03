package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableYahooLogins
    extends DelegateTransfer<Anonymous>
{

    public EnableYahooLogins(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update enable yahoo logins
     * </p>
     * 
     * @param enable_yahoo_logins
     */
    public void put(boolean enable_yahoo_logins) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_yahoo_logins");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_yahoo_logins", (enable_yahoo_logins));
        requestPut(url, null, content, Void.class);
    }
}
