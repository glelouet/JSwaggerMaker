package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl3PromotionMinDuration
    extends DelegateTransfer<Anonymous>
{

    public Tl3PromotionMinDuration(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl3 promotion min duration
     * </p>
     * 
     * @param tl3_promotion_min_duration
     *     "The minimum number of days that a promotion to trust level 3 lasts before a user can be demoted back to trust level 2."
     *     
     */
    public void put(long tl3_promotion_min_duration) {
        String url = ("https://discourse.example.com//admin/site_settings/tl3_promotion_min_duration");
        Map<String, Object> content = new HashMap<>();
        content.put("tl3_promotion_min_duration", (tl3_promotion_min_duration));
        requestPut(url, null, content, Void.class);
    }
}
