package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl2RequiresLikesReceived
    extends DelegateTransfer<Anonymous>
{

    public Tl2RequiresLikesReceived(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl2 requires likes received
     * </p>
     * 
     * @param tl2_requires_likes_received
     *     "How many likes a user must receive before promotion to trust level 2."
     *     
     */
    public void put(long tl2_requires_likes_received) {
        String url = ("https://discourse.example.com//admin/site_settings/tl2_requires_likes_received");
        Map<String, Object> content = new HashMap<>();
        content.put("tl2_requires_likes_received", (tl2_requires_likes_received));
        requestPut(url, null, content, Void.class);
    }
}
