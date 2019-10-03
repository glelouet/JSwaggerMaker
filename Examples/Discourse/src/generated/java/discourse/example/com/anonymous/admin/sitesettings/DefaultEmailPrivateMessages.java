package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultEmailPrivateMessages
    extends DelegateTransfer<Anonymous>
{

    public DefaultEmailPrivateMessages(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default email private messages"
     * </p>
     * 
     * @param default_email_private_messages
     *     "Send an email when someone messages the user by default."
     *     
     */
    public void put(boolean default_email_private_messages) {
        String url = ("https://discourse.example.com//admin/site_settings/default_email_private_messages");
        Map<String, Object> content = new HashMap<>();
        content.put("default_email_private_messages", (default_email_private_messages));
        requestPut(url, null, content, Void.class);
    }
}
