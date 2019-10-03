package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SearchRecentPostsSize
    extends DelegateTransfer<Anonymous>
{

    public SearchRecentPostsSize(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * search recent posts size
     * </p>
     * 
     * @param search_recent_posts_size
     *     "How many recent posts to keep in the index"
     *     
     */
    public void put(long search_recent_posts_size) {
        String url = ("https://discourse.example.com//admin/site_settings/search_recent_posts_size");
        Map<String, Object> content = new HashMap<>();
        content.put("search_recent_posts_size", (search_recent_posts_size));
        requestPut(url, null, content, Void.class);
    }
}
