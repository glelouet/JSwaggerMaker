package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class UnsubscribeViaEmailFooter
    extends DelegateTransfer<Anonymous>
{

    public UnsubscribeViaEmailFooter(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * unsubscribe via email footer
     * </p>
     * 
     * @param unsubscribe_via_email_footer
     *     Attach an unsubcribe via email mailto: link to the footer of sent email
     */
    public void put(boolean unsubscribe_via_email_footer) {
        String url = ("https://discourse.example.com//admin/site_settings/unsubscribe_via_email_footer");
        Map<String, Object> content = new HashMap<>();
        content.put("unsubscribe_via_email_footer", (unsubscribe_via_email_footer));
        requestPut(url, null, content, Void.class);
    }
}
