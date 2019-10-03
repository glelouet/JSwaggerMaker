package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TopicViewsHeatLow
    extends DelegateTransfer<Anonymous>
{

    public TopicViewsHeatLow(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * topic views heat low
     * </p>
     * 
     * @param topic_view_heat_low
     *     "After this many views, the views field is slightly highlighted."
     *     
     */
    public void put(long topic_view_heat_low) {
        String url = ("https://discourse.example.com//admin/site_settings/topic_views_heat_low");
        Map<String, Object> content = new HashMap<>();
        content.put("topic_view_heat_low", (topic_view_heat_low));
        requestPut(url, null, content, Void.class);
    }
}
