package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DisableEmails
    extends DelegateTransfer<Anonymous>
{

    public DisableEmails(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * disable emails
     * </p>
     * 
     * @param disable_emails
     *     Prevent Discourse from sending any kind of emails
     *     
     */
    public void put(boolean disable_emails) {
        String url = ("https://discourse.example.com//admin/site_settings/disable_emails");
        Map<String, Object> content = new HashMap<>();
        content.put("disable_emails", (disable_emails));
        requestPut(url, null, content, Void.class);
    }
}
