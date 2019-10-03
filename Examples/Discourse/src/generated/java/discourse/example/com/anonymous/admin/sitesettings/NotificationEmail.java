package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class NotificationEmail
    extends DelegateTransfer<Anonymous>
{

    public NotificationEmail(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the notification email
     * </p>
     * 
     * @param notification_email
     */
    public void put(String notification_email) {
        String url = ("https://discourse.example.com//admin/site_settings/notification_email");
        Map<String, Object> content = new HashMap<>();
        content.put("notification_email", (notification_email));
        requestPut(url, null, content, Void.class);
    }
}
