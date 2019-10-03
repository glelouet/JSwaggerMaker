package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultEmailMailingListMode
    extends DelegateTransfer<Anonymous>
{

    public DefaultEmailMailingListMode(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default email mailing list mode"
     * </p>
     * 
     * @param default_email_mailing_list_mode
     *     "Send an email for every new post by default."
     *     
     */
    public void put(boolean default_email_mailing_list_mode) {
        String url = ("https://discourse.example.com//admin/site_settings/default_email_mailing_list_mode");
        Map<String, Object> content = new HashMap<>();
        content.put("default_email_mailing_list_mode", (default_email_mailing_list_mode));
        requestPut(url, null, content, Void.class);
    }
}
