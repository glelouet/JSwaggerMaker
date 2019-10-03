package discourse.example.com.anonymous.notifications;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class MarkRead_json
    extends DelegateTransfer<Anonymous>
{

    public MarkRead_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Mark notifications as read
     * </p>
     * 
     * @param id
     *     (optional) Leave off to mark all notifications as read
     *     
     */
    public Requested<Object> put(long id) {
        String url = ("https://discourse.example.com//notifications/mark-read.json");
        Map<String, Object> content = new HashMap<>();
        content.put("id", (id));
        return requestPut(url, null, content, Object.class);
    }
}
