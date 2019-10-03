package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultOtherNewTopicDurationMinutes
    extends DelegateTransfer<Anonymous>
{

    public DefaultOtherNewTopicDurationMinutes(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default other new topic duration minutes"
     * </p>
     * 
     * @param default_other_new_topic_duration_minutes
     *     "Global default condition for which a topic is considered new."
     *     
     */
    public void put(long default_other_new_topic_duration_minutes) {
        String url = ("https://discourse.example.com//admin/site_settings/default_other_new_topic_duration_minutes");
        Map<String, Object> content = new HashMap<>();
        content.put("default_other_new_topic_duration_minutes", (default_other_new_topic_duration_minutes));
        requestPut(url, null, content, Void.class);
    }
}
