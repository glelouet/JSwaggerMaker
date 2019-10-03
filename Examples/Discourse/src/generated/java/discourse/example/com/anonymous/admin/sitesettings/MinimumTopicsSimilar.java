package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinimumTopicsSimilar
    extends DelegateTransfer<Anonymous>
{

    public MinimumTopicsSimilar(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * minimum topics similar
     * </p>
     * 
     * @param minimum_topics_similar
     *     "How many topics need to exist before similar topics are presented when composing new topics."
     *     
     */
    public void put(long minimum_topics_similar) {
        String url = ("https://discourse.example.com//admin/site_settings/minimum_topics_similar");
        Map<String, Object> content = new HashMap<>();
        content.put("minimum_topics_similar", (minimum_topics_similar));
        requestPut(url, null, content, Void.class);
    }
}
