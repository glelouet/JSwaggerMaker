package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ExternalSystemAvatarsEnabled
    extends DelegateTransfer<Anonymous>
{

    public ExternalSystemAvatarsEnabled(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * external system avatars enabled
     * </p>
     * 
     * @param external_system_avatars_enabled
     *     "Use external system avatars service."
     *     
     */
    public void put(boolean external_system_avatars_enabled) {
        String url = ("https://discourse.example.com//admin/site_settings/external_system_avatars_enabled");
        Map<String, Object> content = new HashMap<>();
        content.put("external_system_avatars_enabled", (external_system_avatars_enabled));
        requestPut(url, null, content, Void.class);
    }
}
