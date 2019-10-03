package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class NewuserMaxMentionsPerPost
    extends DelegateTransfer<Anonymous>
{

    public NewuserMaxMentionsPerPost(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * newuser max mentions per post
     * </p>
     * 
     * @param newuser_max_mentions_per_post
     */
    public void put(long newuser_max_mentions_per_post) {
        String url = ("https://discourse.example.com//admin/site_settings/newuser_max_mentions_per_post");
        Map<String, Object> content = new HashMap<>();
        content.put("newuser_max_mentions_per_post", (newuser_max_mentions_per_post));
        requestPut(url, null, content, Void.class);
    }
}
