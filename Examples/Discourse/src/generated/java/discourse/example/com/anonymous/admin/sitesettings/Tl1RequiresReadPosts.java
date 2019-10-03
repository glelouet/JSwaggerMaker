package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl1RequiresReadPosts
    extends DelegateTransfer<Anonymous>
{

    public Tl1RequiresReadPosts(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl1 requires read posts
     * </p>
     * 
     * @param tl1_requires_read_posts
     *     "How many posts a new user must read before promotion to trust level 1."
     *     
     */
    public void put(long tl1_requires_read_posts) {
        String url = ("https://discourse.example.com//admin/site_settings/tl1_requires_read_posts");
        Map<String, Object> content = new HashMap<>();
        content.put("tl1_requires_read_posts", (tl1_requires_read_posts));
        requestPut(url, null, content, Void.class);
    }
}
