package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DigestPosts
    extends DelegateTransfer<Anonymous>
{

    public DigestPosts(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * digest posts
     * </p>
     * 
     * @param digest_posts
     */
    public void put(long digest_posts) {
        String url = ("https://discourse.example.com//admin/site_settings/digest_posts");
        Map<String, Object> content = new HashMap<>();
        content.put("digest_posts", (digest_posts));
        requestPut(url, null, content, Void.class);
    }
}
