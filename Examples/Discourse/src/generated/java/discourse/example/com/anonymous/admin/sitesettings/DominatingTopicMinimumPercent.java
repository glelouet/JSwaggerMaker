package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DominatingTopicMinimumPercent
    extends DelegateTransfer<Anonymous>
{

    public DominatingTopicMinimumPercent(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * dominating topic minimum percent
     * </p>
     * 
     * @param dominating_topic_minimum_percent
     *     "What percentage of posts a user has to make in a topic before being reminded about overly dominating a topic."
     *     
     */
    public void put(long dominating_topic_minimum_percent) {
        String url = ("https://discourse.example.com//admin/site_settings/dominating_topic_minimum_percent");
        Map<String, Object> content = new HashMap<>();
        content.put("dominating_topic_minimum_percent", (dominating_topic_minimum_percent));
        requestPut(url, null, content, Void.class);
    }
}
