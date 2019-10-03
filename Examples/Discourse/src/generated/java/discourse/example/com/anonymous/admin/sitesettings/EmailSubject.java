package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EmailSubject
    extends DelegateTransfer<Anonymous>
{

    public EmailSubject(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * email subject
     * </p>
     * 
     * @param email_subject
     *     Customizable subject format for standard emails.
     */
    public void put(String email_subject) {
        String url = ("https://discourse.example.com//admin/site_settings/email_subject");
        Map<String, Object> content = new HashMap<>();
        content.put("email_subject", (email_subject));
        requestPut(url, null, content, Void.class);
    }
}
