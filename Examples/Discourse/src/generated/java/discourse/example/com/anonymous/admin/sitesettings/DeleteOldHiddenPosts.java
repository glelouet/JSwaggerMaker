package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DeleteOldHiddenPosts
    extends DelegateTransfer<Anonymous>
{

    public DeleteOldHiddenPosts(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * delete old hidden posts
     * </p>
     * 
     * @param delete_old_hidden_posts
     */
    public void put(boolean delete_old_hidden_posts) {
        String url = ("https://discourse.example.com//admin/site_settings/delete_old_hidden_posts");
        Map<String, Object> content = new HashMap<>();
        content.put("delete_old_hidden_posts", (delete_old_hidden_posts));
        requestPut(url, null, content, Void.class);
    }
}
