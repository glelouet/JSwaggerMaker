package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class NewVersionEmails
    extends DelegateTransfer<Anonymous>
{

    public NewVersionEmails(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * new version emails
     * </p>
     * 
     * @param new_version_emails
     *     "Send an email to the contact_email address when a new version of Discourse is available."
     *     
     */
    public void put(boolean new_version_emails) {
        String url = ("https://discourse.example.com//admin/site_settings/new_version_emails");
        Map<String, Object> content = new HashMap<>();
        content.put("new_version_emails", (new_version_emails));
        requestPut(url, null, content, Void.class);
    }
}
