package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class UsernameChangePeriod
    extends DelegateTransfer<Anonymous>
{

    public UsernameChangePeriod(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * username change period
     * </p>
     * 
     * @param username_change_period
     */
    public void put(long username_change_period) {
        String url = ("https://discourse.example.com//admin/site_settings/username_change_period");
        Map<String, Object> content = new HashMap<>();
        content.put("username_change_period", (username_change_period));
        requestPut(url, null, content, Void.class);
    }
}
