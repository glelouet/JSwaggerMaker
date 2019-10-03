package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultEmailMailingListModeFrequency
    extends DelegateTransfer<Anonymous>
{

    public DefaultEmailMailingListModeFrequency(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default email mailing list mode frequency"
     * </p>
     * 
     * @param default_email_mailing_list_mode_frequency
     *     "Users who enable mailing list mode will receive emails this often by default."
     *     
     */
    public void put(long default_email_mailing_list_mode_frequency) {
        String url = ("https://discourse.example.com//admin/site_settings/default_email_mailing_list_mode_frequency");
        Map<String, Object> content = new HashMap<>();
        content.put("default_email_mailing_list_mode_frequency", (default_email_mailing_list_mode_frequency));
        requestPut(url, null, content, Void.class);
    }
}
