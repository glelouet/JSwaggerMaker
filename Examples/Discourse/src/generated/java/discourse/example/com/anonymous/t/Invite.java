package discourse.example.com.anonymous.t;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Invite
    extends DelegateTransfer<Anonymous>
{

    public Invite(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Invite user to topic
     * </p>
     * 
     * @param id
     * @param username
     */
    public Requested<Object> postById(long id, String username) {
        String url = ("https://discourse.example.com//t/{id}/invite".replace("{id}", ""+id));
        Map<String, Object> content = new HashMap<>();
        content.put("username", username);
        return requestPost(url, null, content, Object.class);
    }
}
