package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SendWelcomeMessage
    extends DelegateTransfer<Anonymous>
{

    public SendWelcomeMessage(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * send welcome message
     * </p>
     * 
     * @param send_welcome_message
     *     "Send all new users a welcome message with a quick start guide."
     *     
     */
    public void put(boolean send_welcome_message) {
        String url = ("https://discourse.example.com//admin/site_settings/send_welcome_message");
        Map<String, Object> content = new HashMap<>();
        content.put("send_welcome_message", (send_welcome_message));
        requestPut(url, null, content, Void.class);
    }
}
