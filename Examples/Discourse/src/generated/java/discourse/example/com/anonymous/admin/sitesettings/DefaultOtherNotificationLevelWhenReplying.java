package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultOtherNotificationLevelWhenReplying
    extends DelegateTransfer<Anonymous>
{

    public DefaultOtherNotificationLevelWhenReplying(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default other notification level when replying"
     * </p>
     * 
     * @param default_other_notification_level_when_replying
     *     "Global default notification level when the user replies to a topic."
     *     
     */
    public void put(long default_other_notification_level_when_replying) {
        String url = ("https://discourse.example.com//admin/site_settings/default_other_notification_level_when_replying");
        Map<String, Object> content = new HashMap<>();
        content.put("default_other_notification_level_when_replying", (default_other_notification_level_when_replying));
        requestPut(url, null, content, Void.class);
    }
}
