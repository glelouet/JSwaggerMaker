package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class NotifyAboutQueuedPostsAfter
    extends DelegateTransfer<Anonymous>
{

    public NotifyAboutQueuedPostsAfter(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * notify about queued posts after
     * </p>
     * 
     * @param notify_about_queued_posts_after
     */
    public void put(long notify_about_queued_posts_after) {
        String url = ("https://discourse.example.com//admin/site_settings/notify_about_queued_posts_after");
        Map<String, Object> content = new HashMap<>();
        content.put("notify_about_queued_posts_after", (notify_about_queued_posts_after));
        requestPut(url, null, content, Void.class);
    }
}
