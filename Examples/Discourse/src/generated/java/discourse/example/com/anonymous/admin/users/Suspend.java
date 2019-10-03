package discourse.example.com.anonymous.admin.users;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Suspend
    extends DelegateTransfer<Anonymous>
{

    public Suspend(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Suspend a user
     * </p>
     * 
     * @param id
     * @param suspend_until
     * @param reason
     */
    public void putById(long id, String suspend_until, String reason) {
        String url = ("https://discourse.example.com//admin/users/{id}/suspend".replace("{id}", ""+id));
        Map<String, Object> content = new HashMap<>();
        content.put("suspend_until", (suspend_until));
        content.put("reason", (reason));
        requestPut(url, null, content, Void.class);
    }
}
