package discourse.example.com.anonymous.t;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Notifications
    extends DelegateTransfer<Anonymous>
{

    public Notifications(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * set notification level
     * </p>
     * 
     * @param notification_level
     */
    public Requested<Object> postById(long notification_level) {
        String url = ("https://discourse.example.com//t/{id}/notifications");
        Map<String, Object> content = new HashMap<>();
        content.put("notification_level", notification_level);
        return requestPost(url, null, content, Object.class);
    }
}
