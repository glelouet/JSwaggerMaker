package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowUppercasePosts
    extends DelegateTransfer<Anonymous>
{

    public AllowUppercasePosts(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * allow_uppercase_posts
     * </p>
     * 
     * @param allow_uppercase_posts
     */
    public void put(boolean allow_uppercase_posts) {
        String url = ("https://discourse.example.com//admin/site_settings/allow_uppercase_posts");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_uppercase_posts", (allow_uppercase_posts));
        requestPut(url, null, content, Void.class);
    }
}
