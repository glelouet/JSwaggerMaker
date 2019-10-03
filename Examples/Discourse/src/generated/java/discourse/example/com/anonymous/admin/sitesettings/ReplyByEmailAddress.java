package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ReplyByEmailAddress
    extends DelegateTransfer<Anonymous>
{

    public ReplyByEmailAddress(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * reply by email address
     * </p>
     * 
     * @param reply_by_email_address
     *     Template for reply by email incoming email address.
     */
    public void put(String reply_by_email_address) {
        String url = ("https://discourse.example.com//admin/site_settings/reply_by_email_address");
        Map<String, Object> content = new HashMap<>();
        content.put("reply_by_email_address", (reply_by_email_address));
        requestPut(url, null, content, Void.class);
    }
}
