package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class FacebookAppSecret
    extends DelegateTransfer<Anonymous>
{

    public FacebookAppSecret(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * facebook app secret
     * </p>
     * 
     * @param facebook_app_secret
     */
    public void put(String facebook_app_secret) {
        String url = ("https://discourse.example.com//admin/site_settings/facebook_app_secret");
        Map<String, Object> content = new HashMap<>();
        content.put("facebook_app_secret", (facebook_app_secret));
        requestPut(url, null, content, Void.class);
    }
}
