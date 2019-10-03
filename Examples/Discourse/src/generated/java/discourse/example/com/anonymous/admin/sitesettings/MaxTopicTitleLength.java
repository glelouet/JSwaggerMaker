package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxTopicTitleLength
    extends DelegateTransfer<Anonymous>
{

    public MaxTopicTitleLength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max topic title length
     * </p>
     * 
     * @param max_topic_title_length
     */
    public void put(long max_topic_title_length) {
        String url = ("https://discourse.example.com//admin/site_settings/max_topic_title_length");
        Map<String, Object> content = new HashMap<>();
        content.put("max_topic_title_length", (max_topic_title_length));
        requestPut(url, null, content, Void.class);
    }
}
