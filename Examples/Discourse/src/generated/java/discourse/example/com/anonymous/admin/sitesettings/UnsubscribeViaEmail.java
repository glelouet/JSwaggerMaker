package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class UnsubscribeViaEmail
    extends DelegateTransfer<Anonymous>
{

    public UnsubscribeViaEmail(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * unsubscribe via email
     * </p>
     * 
     * @param unsubscribe_via_email
     *     Allow users to unsubscribe from emails by sending an email with 'unsubscribe' in the subject or body
     *     
     */
    public void put(boolean unsubscribe_via_email) {
        String url = ("https://discourse.example.com//admin/site_settings/unsubscribe_via_email");
        Map<String, Object> content = new HashMap<>();
        content.put("unsubscribe_via_email", (unsubscribe_via_email));
        requestPut(url, null, content, Void.class);
    }
}
