package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TopicViewsHeatHigh
    extends DelegateTransfer<Anonymous>
{

    public TopicViewsHeatHigh(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * topic views heat high
     * </p>
     * 
     * @param topic_views_heat_high
     *     "After this many views, the views field is strongly highlighted."
     *     
     */
    public void put(long topic_views_heat_high) {
        String url = ("https://discourse.example.com//admin/site_settings/topic_views_heat_high");
        Map<String, Object> content = new HashMap<>();
        content.put("topic_views_heat_high", (topic_views_heat_high));
        requestPut(url, null, content, Void.class);
    }
}
