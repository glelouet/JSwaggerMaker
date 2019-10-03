package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ActiveUserRateLimitSecs
    extends DelegateTransfer<Anonymous>
{

    public ActiveUserRateLimitSecs(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * active user rate limit secs
     * </p>
     * 
     * @param active_user_rate_limit_secs
     *     "How frequently we update the 'last_seen_at' field, in seconds"
     *     
     */
    public void put(long active_user_rate_limit_secs) {
        String url = ("https://discourse.example.com//admin/site_settings/active_user_rate_limit_secs");
        Map<String, Object> content = new HashMap<>();
        content.put("active_user_rate_limit_secs", (active_user_rate_limit_secs));
        requestPut(url, null, content, Void.class);
    }
}
