package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class RateLimitNewUserCreateTopic
    extends DelegateTransfer<Anonymous>
{

    public RateLimitNewUserCreateTopic(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * rate limit new user create topic
     * </p>
     * 
     * @param rate_limit_new_user_create_topic
     *     "After creating a topic, new users must wait (n) seconds before creating another topic."
     *     
     */
    public void put(long rate_limit_new_user_create_topic) {
        String url = ("https://discourse.example.com//admin/site_settings/rate_limit_new_user_create_topic");
        Map<String, Object> content = new HashMap<>();
        content.put("rate_limit_new_user_create_topic", (rate_limit_new_user_create_topic));
        requestPut(url, null, content, Void.class);
    }
}
