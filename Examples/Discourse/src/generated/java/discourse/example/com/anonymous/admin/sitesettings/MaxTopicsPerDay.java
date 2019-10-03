package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxTopicsPerDay
    extends DelegateTransfer<Anonymous>
{

    public MaxTopicsPerDay(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max topics per day
     * </p>
     * 
     * @param max_topics_per_day
     *     "Maximum number of topics a user can create per day."
     *     
     */
    public void put(long max_topics_per_day) {
        String url = ("https://discourse.example.com//admin/site_settings/max_topics_per_day");
        Map<String, Object> content = new HashMap<>();
        content.put("max_topics_per_day", (max_topics_per_day));
        requestPut(url, null, content, Void.class);
    }
}
