package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class FacebookAppId
    extends DelegateTransfer<Anonymous>
{

    public FacebookAppId(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * facebook app id
     * </p>
     * 
     * @param facebook_app_id
     */
    public void put(String facebook_app_id) {
        String url = ("https://discourse.example.com//admin/site_settings/facebook_app_id");
        Map<String, Object> content = new HashMap<>();
        content.put("facebook_app_id", (facebook_app_id));
        requestPut(url, null, content, Void.class);
    }
}
