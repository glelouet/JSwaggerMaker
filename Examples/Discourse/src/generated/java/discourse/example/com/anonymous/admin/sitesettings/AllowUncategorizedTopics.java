package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowUncategorizedTopics
    extends DelegateTransfer<Anonymous>
{

    public AllowUncategorizedTopics(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * allow uncategorized topics
     * </p>
     * 
     * @param allow_uncategorized_topics
     */
    public void put(boolean allow_uncategorized_topics) {
        String url = ("https://discourse.example.com//admin/site_settings/allow_uncategorized_topics");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_uncategorized_topics", (allow_uncategorized_topics));
        requestPut(url, null, content, Void.class);
    }
}
