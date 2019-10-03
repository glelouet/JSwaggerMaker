package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DeleteRemovedPostsAfter
    extends DelegateTransfer<Anonymous>
{

    public DeleteRemovedPostsAfter(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * delete removed posts after
     * </p>
     * 
     * @param delete_removed_posts_after
     */
    public void put(long delete_removed_posts_after) {
        String url = ("https://discourse.example.com//admin/site_settings/delete_removed_posts_after");
        Map<String, Object> content = new HashMap<>();
        content.put("delete_removed_posts_after", (delete_removed_posts_after));
        requestPut(url, null, content, Void.class);
    }
}
