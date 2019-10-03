package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultEmailInReplyTo
    extends DelegateTransfer<Anonymous>
{

    public DefaultEmailInReplyTo(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default email in reply to"
     * </p>
     * 
     * @param default_email_in_reply_to
     *     "Include excerpt of replied to post in emails by default."
     *     
     */
    public void put(boolean default_email_in_reply_to) {
        String url = ("https://discourse.example.com//admin/site_settings/default_email_in_reply_to");
        Map<String, Object> content = new HashMap<>();
        content.put("default_email_in_reply_to", (default_email_in_reply_to));
        requestPut(url, null, content, Void.class);
    }
}
