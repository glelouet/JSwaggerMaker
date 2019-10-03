package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TopicViewsHeatMedium
    extends DelegateTransfer<Anonymous>
{

    public TopicViewsHeatMedium(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * topic views heat medium
     * </p>
     * 
     * @param topic_views_heat_medium
     *     "After this many views, the views field is moderately highlighted."
     *     
     */
    public void put(long topic_views_heat_medium) {
        String url = ("https://discourse.example.com//admin/site_settings/topic_views_heat_medium");
        Map<String, Object> content = new HashMap<>();
        content.put("topic_views_heat_medium", (topic_views_heat_medium));
        requestPut(url, null, content, Void.class);
    }
}
