package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl2RequiresReadPosts
    extends DelegateTransfer<Anonymous>
{

    public Tl2RequiresReadPosts(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl2 requires read posts
     * </p>
     * 
     * @param tl2_requires_read_posts
     *     "How many posts a user must read before promotion to trust level 2."
     *     
     */
    public void put(long tl2_requires_read_posts) {
        String url = ("https://discourse.example.com//admin/site_settings/tl2_requires_read_posts");
        Map<String, Object> content = new HashMap<>();
        content.put("tl2_requires_read_posts", (tl2_requires_read_posts));
        requestPut(url, null, content, Void.class);
    }
}
