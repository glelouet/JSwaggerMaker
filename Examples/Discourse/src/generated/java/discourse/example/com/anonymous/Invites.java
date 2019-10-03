package discourse.example.com.anonymous;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import discourse.example.com.anonymous.invites.Link;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Invites
    extends DelegateTransfer<Anonymous>
{
    public final Link link;

    public Invites(Anonymous delegate) {
        super(delegate);
        link = new Link((delegate));
    }

    /**
     * 
     * <p>
     * Invite a user by email to join your forum
     * </p>
     * 
     * @param email
     * @param group_names
     * @param custom_message
     */
    public Requested<Object> post(String email, String group_names, String custom_message) {
        String url = ("https://discourse.example.com//invites");
        Map<String, Object> content = new HashMap<>();
        content.put("email", email);
        content.put("group_names", group_names);
        content.put("custom_message", custom_message);
        return requestPost(url, null, content, Object.class);
    }
}
