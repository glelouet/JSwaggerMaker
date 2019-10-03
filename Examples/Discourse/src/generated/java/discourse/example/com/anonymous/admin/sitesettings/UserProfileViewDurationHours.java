package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class UserProfileViewDurationHours
    extends DelegateTransfer<Anonymous>
{

    public UserProfileViewDurationHours(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * user profile view duration hours
     * </p>
     * 
     * @param user_profile_view_duration_hours
     *     "Count a new user profile view once per IP/User every N hours"
     *     
     */
    public void put(long user_profile_view_duration_hours) {
        String url = ("https://discourse.example.com//admin/site_settings/user_profile_view_duration_hours");
        Map<String, Object> content = new HashMap<>();
        content.put("user_profile_view_duration_hours", (user_profile_view_duration_hours));
        requestPut(url, null, content, Void.class);
    }
}
