package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl3RequiresLikesReceived
    extends DelegateTransfer<Anonymous>
{

    public Tl3RequiresLikesReceived(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl3 requires likes received
     * </p>
     * 
     * @param tl3_requires_likes_received
     *     "The minimum number of likes that must be received in the last (tl3 time period) days to qualify for promotion to trust level 3."
     *     
     */
    public void put(long tl3_requires_likes_received) {
        String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_likes_received");
        Map<String, Object> content = new HashMap<>();
        content.put("tl3_requires_likes_received", (tl3_requires_likes_received));
        requestPut(url, null, content, Void.class);
    }
}
