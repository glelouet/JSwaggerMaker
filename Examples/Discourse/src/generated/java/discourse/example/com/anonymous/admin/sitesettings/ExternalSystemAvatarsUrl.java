package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ExternalSystemAvatarsUrl
    extends DelegateTransfer<Anonymous>
{

    public ExternalSystemAvatarsUrl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * external system avatars url
     * </p>
     * 
     * @param external_system_avatars_url
     *     "URL of the external system avatars service. Allowed substitutions are {username} {first_letter} {color} {size}"
     *     
     */
    public void put(String external_system_avatars_url) {
        String url = ("https://discourse.example.com//admin/site_settings/external_system_avatars_url");
        Map<String, Object> content = new HashMap<>();
        content.put("external_system_avatars_url", (external_system_avatars_url));
        requestPut(url, null, content, Void.class);
    }
}
