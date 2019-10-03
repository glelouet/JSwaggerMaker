package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultOtherLikeNotificationFrequency
    extends DelegateTransfer<Anonymous>
{

    public DefaultOtherLikeNotificationFrequency(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default other like notification frequency"
     * </p>
     * 
     * @param default_other_like_notification_frequency
     *     "Notify users on likes by default"
     *     
     */
    public void put(long default_other_like_notification_frequency) {
        String url = ("https://discourse.example.com//admin/site_settings/default_other_like_notification_frequency");
        Map<String, Object> content = new HashMap<>();
        content.put("default_other_like_notification_frequency", (default_other_like_notification_frequency));
        requestPut(url, null, content, Void.class);
    }
}
