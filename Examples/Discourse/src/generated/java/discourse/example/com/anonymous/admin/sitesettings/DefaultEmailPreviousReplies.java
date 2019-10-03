package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultEmailPreviousReplies
    extends DelegateTransfer<Anonymous>
{

    public DefaultEmailPreviousReplies(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default email previous replies"
     * </p>
     * 
     * @param default_email_previous_replies
     *     "Include previous replies in emails by default."
     *     
     */
    public void put(long default_email_previous_replies) {
        String url = ("https://discourse.example.com//admin/site_settings/default_email_previous_replies");
        Map<String, Object> content = new HashMap<>();
        content.put("default_email_previous_replies", (default_email_previous_replies));
        requestPut(url, null, content, Void.class);
    }
}
