package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DisableMailingListMode
    extends DelegateTransfer<Anonymous>
{

    public DisableMailingListMode(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "disable mailing list mode"
     * </p>
     * 
     * @param disable_mailing_list_mode
     *     "Disallow users from enabling mailing list mode."
     *     
     */
    public void put(boolean disable_mailing_list_mode) {
        String url = ("https://discourse.example.com//admin/site_settings/disable_mailing_list_mode");
        Map<String, Object> content = new HashMap<>();
        content.put("disable_mailing_list_mode", (disable_mailing_list_mode));
        requestPut(url, null, content, Void.class);
    }
}
