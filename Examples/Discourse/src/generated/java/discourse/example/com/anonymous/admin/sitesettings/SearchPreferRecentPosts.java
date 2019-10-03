package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SearchPreferRecentPosts
    extends DelegateTransfer<Anonymous>
{

    public SearchPreferRecentPosts(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * search prefer recent posts
     * </p>
     * 
     * @param search_prefer_recent_posts
     *     "If searching your large forum is slow, this option tries an index of more recent posts first"
     *     
     */
    public void put(boolean search_prefer_recent_posts) {
        String url = ("https://discourse.example.com//admin/site_settings/search_prefer_recent_posts");
        Map<String, Object> content = new HashMap<>();
        content.put("search_prefer_recent_posts", (search_prefer_recent_posts));
        requestPut(url, null, content, Void.class);
    }
}
