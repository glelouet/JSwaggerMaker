package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxInvitesPerDay
    extends DelegateTransfer<Anonymous>
{

    public MaxInvitesPerDay(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max invites per day
     * </p>
     * 
     * @param max_invites_per_day
     *     "Maximum number of invites a user can send per day."
     *     
     */
    public void put(long max_invites_per_day) {
        String url = ("https://discourse.example.com//admin/site_settings/max_invites_per_day");
        Map<String, Object> content = new HashMap<>();
        content.put("max_invites_per_day", (max_invites_per_day));
        requestPut(url, null, content, Void.class);
    }
}
