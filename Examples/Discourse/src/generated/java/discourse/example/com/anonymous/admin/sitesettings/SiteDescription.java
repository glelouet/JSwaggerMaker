package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SiteDescription
    extends DelegateTransfer<Anonymous>
{

    public SiteDescription(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the site description
     * </p>
     * 
     * @param site_description
     */
    public void put(String site_description) {
        String url = ("https://discourse.example.com//admin/site_settings/site_description");
        Map<String, Object> content = new HashMap<>();
        content.put("site_description", (site_description));
        requestPut(url, null, content, Void.class);
    }
}
