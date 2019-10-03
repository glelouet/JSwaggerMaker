package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PurgeUnactivatedUsersGracePeriodDays
    extends DelegateTransfer<Anonymous>
{

    public PurgeUnactivatedUsersGracePeriodDays(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * purge unactivated users grace period days
     * </p>
     * 
     * @param purge_unactivated_users_grace_period_days
     */
    public void put(long purge_unactivated_users_grace_period_days) {
        String url = ("https://discourse.example.com//admin/site_settings/purge_unactivated_users_grace_period_days");
        Map<String, Object> content = new HashMap<>();
        content.put("purge_unactivated_users_grace_period_days", (purge_unactivated_users_grace_period_days));
        requestPut(url, null, content, Void.class);
    }
}
