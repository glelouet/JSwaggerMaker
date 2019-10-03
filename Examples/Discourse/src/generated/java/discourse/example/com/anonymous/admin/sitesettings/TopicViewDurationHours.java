package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TopicViewDurationHours
    extends DelegateTransfer<Anonymous>
{

    public TopicViewDurationHours(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * topic view duration hours
     * </p>
     * 
     * @param topic_view_duration_hours
     *     "Count a new topic view once per IP/User every N hours"
     *     
     */
    public void put(long topic_view_duration_hours) {
        String url = ("https://discourse.example.com//admin/site_settings/topic_view_duration_hours");
        Map<String, Object> content = new HashMap<>();
        content.put("topic_view_duration_hours", (topic_view_duration_hours));
        requestPut(url, null, content, Void.class);
    }
}
