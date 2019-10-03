package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EducateUntilPosts
    extends DelegateTransfer<Anonymous>
{

    public EducateUntilPosts(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * educate until posts
     * </p>
     * 
     * @param educate_until_posts
     *     "When the user starts typing their first (n) new posts, show the pop-up new user education panel in the composer."
     *     
     */
    public void put(long educate_until_posts) {
        String url = ("https://discourse.example.com//admin/site_settings/educate_until_posts");
        Map<String, Object> content = new HashMap<>();
        content.put("educate_until_posts", (educate_until_posts));
        requestPut(url, null, content, Void.class);
    }
}
