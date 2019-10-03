package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableForwardedEmails
    extends DelegateTransfer<Anonymous>
{

    public EnableForwardedEmails(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable forwarded emails
     * </p>
     * 
     * @param enable_forwarded_emails
     *     [BETA] Allow users to create a topic by forwarding an email in.
     */
    public void put(boolean enable_forwarded_emails) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_forwarded_emails");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_forwarded_emails", (enable_forwarded_emails));
        requestPut(url, null, content, Void.class);
    }
}
