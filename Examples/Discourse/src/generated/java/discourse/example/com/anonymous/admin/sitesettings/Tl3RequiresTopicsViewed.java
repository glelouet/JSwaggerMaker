package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl3RequiresTopicsViewed
    extends DelegateTransfer<Anonymous>
{

    public Tl3RequiresTopicsViewed(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl3 requires topics viewed
     * </p>
     * 
     * @param tl3_requires_topics_viewed
     *     "The percentage of topics created in the last (tl3 time period) days that a user needs to have viewed to qualify for promotion to trust level 3. (0 to 100)"
     *     
     */
    public void put(long tl3_requires_topics_viewed) {
        String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_topics_viewed");
        Map<String, Object> content = new HashMap<>();
        content.put("tl3_requires_topics_viewed", (tl3_requires_topics_viewed));
        requestPut(url, null, content, Void.class);
    }
}
