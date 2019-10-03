package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinTopicTitleLength
    extends DelegateTransfer<Anonymous>
{

    public MinTopicTitleLength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * min topic title length
     * </p>
     * 
     * @param min_topic_title_length
     */
    public void put(long min_topic_title_length) {
        String url = ("https://discourse.example.com//admin/site_settings/min_topic_title_length");
        Map<String, Object> content = new HashMap<>();
        content.put("min_topic_title_length", (min_topic_title_length));
        requestPut(url, null, content, Void.class);
    }
}
