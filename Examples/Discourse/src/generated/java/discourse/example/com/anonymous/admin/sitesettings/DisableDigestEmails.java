package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DisableDigestEmails
    extends DelegateTransfer<Anonymous>
{

    public DisableDigestEmails(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * disable digest emails
     * </p>
     * 
     * @param digest_digest_emails
     */
    public void put(boolean digest_digest_emails) {
        String url = ("https://discourse.example.com//admin/site_settings/disable_digest_emails");
        Map<String, Object> content = new HashMap<>();
        content.put("digest_digest_emails", (digest_digest_emails));
        requestPut(url, null, content, Void.class);
    }
}
