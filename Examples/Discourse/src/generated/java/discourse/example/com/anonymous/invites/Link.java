package discourse.example.com.anonymous.invites;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Link
    extends DelegateTransfer<Anonymous>
{

    public Link(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Generate an invite link but don't send an email
     * </p>
     * 
     * @param email
     * @param group_names
     * @param custom_message
     */
    public Requested<String> post(String email, String group_names, String custom_message) {
        String url = ("https://discourse.example.com//invites/link");
        Map<String, Object> content = new HashMap<>();
        content.put("email", email);
        content.put("group_names", group_names);
        content.put("custom_message", custom_message);
        return requestPost(url, null, content, String.class);
    }
}
