package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxPrintsPerHourPerUser
    extends DelegateTransfer<Anonymous>
{

    public MaxPrintsPerHourPerUser(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max prints per hour per user
     * </p>
     * 
     * @param max_prints_per_hour_per_user
     *     "Maximum number of /print page impressions (set to 0 to disable)"
     *     
     */
    public void put(long max_prints_per_hour_per_user) {
        String url = ("https://discourse.example.com//admin/site_settings/max_prints_per_hour_per_user");
        Map<String, Object> content = new HashMap<>();
        content.put("max_prints_per_hour_per_user", (max_prints_per_hour_per_user));
        requestPut(url, null, content, Void.class);
    }
}
