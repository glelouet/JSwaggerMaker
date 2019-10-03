package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableBadges
    extends DelegateTransfer<Anonymous>
{

    public EnableBadges(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update enable the badge system
     * </p>
     * 
     * @param enable_badges
     */
    public void put(boolean enable_badges) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_badges");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_badges", (enable_badges));
        requestPut(url, null, content, Void.class);
    }
}
