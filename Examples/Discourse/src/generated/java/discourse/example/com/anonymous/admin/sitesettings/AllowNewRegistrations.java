package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowNewRegistrations
    extends DelegateTransfer<Anonymous>
{

    public AllowNewRegistrations(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update allow new registrations
     * </p>
     * 
     * @param allow_new_registrations
     */
    public void put(boolean allow_new_registrations) {
        String url = ("https://discourse.example.com//admin/site_settings/allow_new_registrations");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_new_registrations", (allow_new_registrations));
        requestPut(url, null, content, Void.class);
    }
}
