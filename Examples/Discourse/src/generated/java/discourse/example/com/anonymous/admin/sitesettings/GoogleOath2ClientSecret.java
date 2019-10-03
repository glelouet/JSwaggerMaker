package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class GoogleOath2ClientSecret
    extends DelegateTransfer<Anonymous>
{

    public GoogleOath2ClientSecret(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update google oauth2 client secret
     * </p>
     * 
     * @param google_oath2_client_secret
     */
    public void put(String google_oath2_client_secret) {
        String url = ("https://discourse.example.com//admin/site_settings/google_oath2_client_secret");
        Map<String, Object> content = new HashMap<>();
        content.put("google_oath2_client_secret", (google_oath2_client_secret));
        requestPut(url, null, content, Void.class);
    }
}
