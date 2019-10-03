package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DisplayNameOnPosts
    extends DelegateTransfer<Anonymous>
{

    public DisplayNameOnPosts(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * display name on posts
     * </p>
     * 
     * @param display_name_on_posts
     */
    public void put(boolean display_name_on_posts) {
        String url = ("https://discourse.example.com//admin/site_settings/display_name_on_posts");
        Map<String, Object> content = new HashMap<>();
        content.put("display_name_on_posts", (display_name_on_posts));
        requestPut(url, null, content, Void.class);
    }
}
