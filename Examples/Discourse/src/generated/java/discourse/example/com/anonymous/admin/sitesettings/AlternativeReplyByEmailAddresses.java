package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AlternativeReplyByEmailAddresses
    extends DelegateTransfer<Anonymous>
{

    public AlternativeReplyByEmailAddresses(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * alternative reply by email addresses
     * </p>
     * 
     * @param alternative_reply_by_email_addresses
     *     List of alternative templates for reply by email incoming email addresses.
     */
    public void put(String alternative_reply_by_email_addresses) {
        String url = ("https://discourse.example.com//admin/site_settings/alternative_reply_by_email_addresses");
        Map<String, Object> content = new HashMap<>();
        content.put("alternative_reply_by_email_addresses", (alternative_reply_by_email_addresses));
        requestPut(url, null, content, Void.class);
    }
}
