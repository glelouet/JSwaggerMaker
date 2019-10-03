package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TopicFeaturedLinkEnabled
    extends DelegateTransfer<Anonymous>
{

    public TopicFeaturedLinkEnabled(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * topic featured link enabled
     * </p>
     * 
     * @param topic_featured_link_enabled
     */
    public void put(boolean topic_featured_link_enabled) {
        String url = ("https://discourse.example.com//admin/site_settings/topic_featured_link_enabled");
        Map<String, Object> content = new HashMap<>();
        content.put("topic_featured_link_enabled", (topic_featured_link_enabled));
        requestPut(url, null, content, Void.class);
    }
}
