package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SuggestedTopics
    extends DelegateTransfer<Anonymous>
{

    public SuggestedTopics(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the number of suggested topics
     * </p>
     * 
     * @param suggested_topics
     */
    public void put(long suggested_topics) {
        String url = ("https://discourse.example.com//admin/site_settings/suggested_topics");
        Map<String, Object> content = new HashMap<>();
        content.put("suggested_topics", (suggested_topics));
        requestPut(url, null, content, Void.class);
    }
}
