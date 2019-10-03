package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EmailSiteTitle
    extends DelegateTransfer<Anonymous>
{

    public EmailSiteTitle(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * email site title
     * </p>
     * 
     * @param email_site_title
     *     The title of the site used as the sender of emails from the site. Default to 'title' if not set. If your 'title' contains characters that are not allowed in email sender strings, use this setting.
     *     
     */
    public void put(String email_site_title) {
        String url = ("https://discourse.example.com//admin/site_settings/email_site_title");
        Map<String, Object> content = new HashMap<>();
        content.put("email_site_title", (email_site_title));
        requestPut(url, null, content, Void.class);
    }
}
