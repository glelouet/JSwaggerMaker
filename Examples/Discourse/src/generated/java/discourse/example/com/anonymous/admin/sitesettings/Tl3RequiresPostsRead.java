package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl3RequiresPostsRead
    extends DelegateTransfer<Anonymous>
{

    public Tl3RequiresPostsRead(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl3 requires posts read
     * </p>
     * 
     * @param tl3_requires_posts_read
     *     "The percentage of posts created in the last (tl3 time period) days that a user needs to have viewed to qualify for promotion to trust level 3. (0 to 100)"
     *     
     */
    public void put(long tl3_requires_posts_read) {
        String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_posts_read");
        Map<String, Object> content = new HashMap<>();
        content.put("tl3_requires_posts_read", (tl3_requires_posts_read));
        requestPut(url, null, content, Void.class);
    }
}
