package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class CooldownMinutesAfterHidingPosts
    extends DelegateTransfer<Anonymous>
{

    public CooldownMinutesAfterHidingPosts(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * cooldown minutes after hiding posts
     * </p>
     * 
     * @param cooldown_minutes_after_hiding_posts
     *     "Number of minutes a user must wait before they can edit a post hidden via community flagging"
     *     
     */
    public void put(long cooldown_minutes_after_hiding_posts) {
        String url = ("https://discourse.example.com//admin/site_settings/cooldown_minutes_after_hiding_posts");
        Map<String, Object> content = new HashMap<>();
        content.put("cooldown_minutes_after_hiding_posts", (cooldown_minutes_after_hiding_posts));
        requestPut(url, null, content, Void.class);
    }
}
