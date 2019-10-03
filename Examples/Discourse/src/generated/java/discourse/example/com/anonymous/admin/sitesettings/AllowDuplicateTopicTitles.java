package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowDuplicateTopicTitles
    extends DelegateTransfer<Anonymous>
{

    public AllowDuplicateTopicTitles(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * allow duplicate topic titles
     * </p>
     * 
     * @param allow_duplicate_topic_titles
     */
    public void put(boolean allow_duplicate_topic_titles) {
        String url = ("https://discourse.example.com//admin/site_settings/allow_duplicate_topic_titles");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_duplicate_topic_titles", (allow_duplicate_topic_titles));
        requestPut(url, null, content, Void.class);
    }
}
