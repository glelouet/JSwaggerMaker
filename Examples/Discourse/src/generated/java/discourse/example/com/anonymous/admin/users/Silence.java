package discourse.example.com.anonymous.admin.users;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Silence
    extends DelegateTransfer<Anonymous>
{

    public Silence(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Silence a user
     * </p>
     * 
     * @param id
     * @param message
     * @param silenced_till
     * @param reason
     * @param post_action
     */
    public Requested<Object> putById(long id,
        String message,
        String silenced_till,
        String reason,
        String post_action) {
        String url = ("https://discourse.example.com//admin/users/{id}/silence".replace("{id}", ""+id));
        Map<String, Object> content = new HashMap<>();
        content.put("message", (message));
        content.put("silenced_till", (silenced_till));
        content.put("reason", (reason));
        content.put("post_action", (post_action));
        return requestPut(url, null, content, Object.class);
    }
}
