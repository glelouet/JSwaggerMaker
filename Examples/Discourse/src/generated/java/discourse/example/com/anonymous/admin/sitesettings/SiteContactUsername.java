package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SiteContactUsername
    extends DelegateTransfer<Anonymous>
{

    public SiteContactUsername(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the site contact username
     * </p>
     * 
     * @param site_contact_username
     */
    public void put(String site_contact_username) {
        String url = ("https://discourse.example.com//admin/site_settings/site_contact_username");
        Map<String, Object> content = new HashMap<>();
        content.put("site_contact_username", (site_contact_username));
        requestPut(url, null, content, Void.class);
    }
}
