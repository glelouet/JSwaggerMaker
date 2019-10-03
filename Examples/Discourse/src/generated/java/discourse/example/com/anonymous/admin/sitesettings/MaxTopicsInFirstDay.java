package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxTopicsInFirstDay
    extends DelegateTransfer<Anonymous>
{

    public MaxTopicsInFirstDay(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max topics in first day
     * </p>
     * 
     * @param max_topics_in_first_day
     *     "The maximum number of topics a user is allowed to create in the 24 hour period after creating their first post"
     *     
     */
    public void put(long max_topics_in_first_day) {
        String url = ("https://discourse.example.com//admin/site_settings/max_topics_in_first_day");
        Map<String, Object> content = new HashMap<>();
        content.put("max_topics_in_first_day", (max_topics_in_first_day));
        requestPut(url, null, content, Void.class);
    }
}
