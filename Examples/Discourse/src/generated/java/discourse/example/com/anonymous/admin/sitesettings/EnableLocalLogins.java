package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableLocalLogins
    extends DelegateTransfer<Anonymous>
{

    public EnableLocalLogins(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update enable_local_logins
     * </p>
     * 
     * @param enable_local_logins
     */
    public void put(boolean enable_local_logins) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_local_logins");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_local_logins", (enable_local_logins));
        requestPut(url, null, content, Void.class);
    }
}
