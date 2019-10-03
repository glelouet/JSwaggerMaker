package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AutomaticallyUnpinTopics
    extends DelegateTransfer<Anonymous>
{

    public AutomaticallyUnpinTopics(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * automatically unpin topics
     * </p>
     * 
     * @param automatically_unpin_topics
     *     "Automatically unpin topics when the user reaches the bottom."
     *     
     */
    public void put(boolean automatically_unpin_topics) {
        String url = ("https://discourse.example.com//admin/site_settings/automatically_unpin_topics");
        Map<String, Object> content = new HashMap<>();
        content.put("automatically_unpin_topics", (automatically_unpin_topics));
        requestPut(url, null, content, Void.class);
    }
}
