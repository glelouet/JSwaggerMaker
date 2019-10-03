package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl3RequiresTopicsViewedAllTime
    extends DelegateTransfer<Anonymous>
{

    public Tl3RequiresTopicsViewedAllTime(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl3 requires topics viewed all time
     * </p>
     * 
     * @param tl3_requires_viewed_all_time
     *     "The minimum total number of topics a user must have viewed to qualify for trust level 3."
     *     
     */
    public void put(long tl3_requires_viewed_all_time) {
        String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_topics_viewed_all_time");
        Map<String, Object> content = new HashMap<>();
        content.put("tl3_requires_viewed_all_time", (tl3_requires_viewed_all_time));
        requestPut(url, null, content, Void.class);
    }
}
