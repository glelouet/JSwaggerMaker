package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class GaUniversalTrackingCode
    extends DelegateTransfer<Anonymous>
{

    public GaUniversalTrackingCode(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update Google Universal Analytics tracking code
     * </p>
     * 
     * @param ga_universal_tracking_code
     */
    public void put(String ga_universal_tracking_code) {
        String url = ("https://discourse.example.com//admin/site_settings/ga_universal_tracking_code");
        Map<String, Object> content = new HashMap<>();
        content.put("ga_universal_tracking_code", (ga_universal_tracking_code));
        requestPut(url, null, content, Void.class);
    }
}
