package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl3RequiresPostsReadCap
    extends DelegateTransfer<Anonymous>
{

    public Tl3RequiresPostsReadCap(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl3 requires posts read cap
     * </p>
     * 
     * @param tl3_requires_posts_read_cap
     *     "The maximum required number of posts read in the last (tl3 time period) days."
     *     
     */
    public void put(long tl3_requires_posts_read_cap) {
        String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_posts_read_cap");
        Map<String, Object> content = new HashMap<>();
        content.put("tl3_requires_posts_read_cap", (tl3_requires_posts_read_cap));
        requestPut(url, null, content, Void.class);
    }
}
