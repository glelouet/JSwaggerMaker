package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DeleteAllPostsMax
    extends DelegateTransfer<Anonymous>
{

    public DeleteAllPostsMax(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * delete all posts max
     * </p>
     * 
     * @param delete_all_posts_max
     */
    public void put(long delete_all_posts_max) {
        String url = ("https://discourse.example.com//admin/site_settings/delete_all_posts_max");
        Map<String, Object> content = new HashMap<>();
        content.put("delete_all_posts_max", (delete_all_posts_max));
        requestPut(url, null, content, Void.class);
    }
}
