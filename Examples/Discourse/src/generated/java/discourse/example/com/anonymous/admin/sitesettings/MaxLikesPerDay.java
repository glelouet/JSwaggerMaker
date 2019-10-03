package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxLikesPerDay
    extends DelegateTransfer<Anonymous>
{

    public MaxLikesPerDay(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max likes per day
     * </p>
     * 
     * @param max_likes_per_day
     *     "Maximum number of likes per user per day."
     *     
     */
    public void put(long max_likes_per_day) {
        String url = ("https://discourse.example.com//admin/site_settings/max_likes_per_day");
        Map<String, Object> content = new HashMap<>();
        content.put("max_likes_per_day", (max_likes_per_day));
        requestPut(url, null, content, Void.class);
    }
}
