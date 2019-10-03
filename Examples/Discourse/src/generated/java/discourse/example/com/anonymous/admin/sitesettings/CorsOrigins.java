package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class CorsOrigins
    extends DelegateTransfer<Anonymous>
{

    public CorsOrigins(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * cors origins
     * </p>
     * 
     * @param cors_origins
     *     "Allowed origins for cross-origin requests (CORS). Each origin must include http:// or https://. The DISCOURSE_ENABLE_CORS env variable must be set to true to enable CORS."
     *     
     */
    public void put(String cors_origins) {
        String url = ("https://discourse.example.com//admin/site_settings/cors_origins");
        Map<String, Object> content = new HashMap<>();
        content.put("cors_origins", (cors_origins));
        requestPut(url, null, content, Void.class);
    }
}
