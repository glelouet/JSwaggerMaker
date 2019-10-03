package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class GtmContainerId
    extends DelegateTransfer<Anonymous>
{

    public GtmContainerId(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update Google Tag Manager container id
     * </p>
     * 
     * @param gtm_container_id
     */
    public void put(String gtm_container_id) {
        String url = ("https://discourse.example.com//admin/site_settings/gtm_container_id");
        Map<String, Object> content = new HashMap<>();
        content.put("gtm_container_id", (gtm_container_id));
        requestPut(url, null, content, Void.class);
    }
}
