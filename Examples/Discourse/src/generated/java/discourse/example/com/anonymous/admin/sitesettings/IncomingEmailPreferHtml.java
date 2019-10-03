package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class IncomingEmailPreferHtml
    extends DelegateTransfer<Anonymous>
{

    public IncomingEmailPreferHtml(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * incoming email prefer html
     * </p>
     * 
     * @param incoming_email_prefer_html
     *     Use the HTML instead of the text for incoming email. May cause unexpected formatting issues!
     *     
     */
    public void put(boolean incoming_email_prefer_html) {
        String url = ("https://discourse.example.com//admin/site_settings/incoming_email_prefer_html");
        Map<String, Object> content = new HashMap<>();
        content.put("incoming_email_prefer_html", (incoming_email_prefer_html));
        requestPut(url, null, content, Void.class);
    }
}
