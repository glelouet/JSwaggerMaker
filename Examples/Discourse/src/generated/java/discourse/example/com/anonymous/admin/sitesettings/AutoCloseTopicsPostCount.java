package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AutoCloseTopicsPostCount
    extends DelegateTransfer<Anonymous>
{

    public AutoCloseTopicsPostCount(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * auto close topics post count
     * </p>
     * 
     * @param auto_close_topics_post_count
     */
    public void put(long auto_close_topics_post_count) {
        String url = ("https://discourse.example.com//admin/site_settings/auto_close_topics_post_count");
        Map<String, Object> content = new HashMap<>();
        content.put("auto_close_topics_post_count", (auto_close_topics_post_count));
        requestPut(url, null, content, Void.class);
    }
}
