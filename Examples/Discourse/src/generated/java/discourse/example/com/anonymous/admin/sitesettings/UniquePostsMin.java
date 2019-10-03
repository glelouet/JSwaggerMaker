package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class UniquePostsMin
    extends DelegateTransfer<Anonymous>
{

    public UniquePostsMin(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * unique posts mins
     * </p>
     * 
     * @param unique_posts_min
     *     "How many minutes before a user can make a post with the same content again"
     *     
     */
    public void put(long unique_posts_min) {
        String url = ("https://discourse.example.com//admin/site_settings/unique_posts_min");
        Map<String, Object> content = new HashMap<>();
        content.put("unique_posts_min", (unique_posts_min));
        requestPut(url, null, content, Void.class);
    }
}
