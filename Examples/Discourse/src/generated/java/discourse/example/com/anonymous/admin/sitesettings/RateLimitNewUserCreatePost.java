package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class RateLimitNewUserCreatePost
    extends DelegateTransfer<Anonymous>
{

    public RateLimitNewUserCreatePost(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * rate limit new user create post
     * </p>
     * 
     * @param rate_limit_new_user_create_post
     *     "After posting, new users must wait (n) seconds before creating another post."
     *     
     */
    public void put(long rate_limit_new_user_create_post) {
        String url = ("https://discourse.example.com//admin/site_settings/rate_limit_new_user_create_post");
        Map<String, Object> content = new HashMap<>();
        content.put("rate_limit_new_user_create_post", (rate_limit_new_user_create_post));
        requestPut(url, null, content, Void.class);
    }
}
