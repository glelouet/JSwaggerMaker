package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxMentionsPerPost
    extends DelegateTransfer<Anonymous>
{

    public MaxMentionsPerPost(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max mentions per post
     * </p>
     * 
     * @param max_mentions_per_post
     */
    public void put(long max_mentions_per_post) {
        String url = ("https://discourse.example.com//admin/site_settings/max_mentions_per_post");
        Map<String, Object> content = new HashMap<>();
        content.put("max_mentions_per_post", (max_mentions_per_post));
        requestPut(url, null, content, Void.class);
    }
}
