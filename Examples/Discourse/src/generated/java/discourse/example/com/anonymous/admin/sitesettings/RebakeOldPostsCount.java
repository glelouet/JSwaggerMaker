package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class RebakeOldPostsCount
    extends DelegateTransfer<Anonymous>
{

    public RebakeOldPostsCount(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * rebake old posts count
     * </p>
     * 
     * @param rebake_old_posts_count
     *     "Number of old posts to be rebaked every 15 minutes."
     *     
     */
    public void put(long rebake_old_posts_count) {
        String url = ("https://discourse.example.com//admin/site_settings/rebake_old_posts_count");
        Map<String, Object> content = new HashMap<>();
        content.put("rebake_old_posts_count", (rebake_old_posts_count));
        requestPut(url, null, content, Void.class);
    }
}
