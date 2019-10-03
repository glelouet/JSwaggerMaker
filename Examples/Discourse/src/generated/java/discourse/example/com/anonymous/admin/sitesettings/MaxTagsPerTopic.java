package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxTagsPerTopic
    extends DelegateTransfer<Anonymous>
{

    public MaxTagsPerTopic(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "max tags per topic"
     * </p>
     * 
     * @param max_tags_per_topic
     *     "The maximum tags that can be applied to a topic."
     *     
     */
    public void put(long max_tags_per_topic) {
        String url = ("https://discourse.example.com//admin/site_settings/max_tags_per_topic");
        Map<String, Object> content = new HashMap<>();
        content.put("max_tags_per_topic", (max_tags_per_topic));
        requestPut(url, null, content, Void.class);
    }
}
