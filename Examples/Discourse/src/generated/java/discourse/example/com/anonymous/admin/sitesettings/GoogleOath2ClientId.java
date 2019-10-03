package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class GoogleOath2ClientId
    extends DelegateTransfer<Anonymous>
{

    public GoogleOath2ClientId(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update google oauth2 client id
     * </p>
     * 
     * @param google_oath2_client_id
     */
    public void put(String google_oath2_client_id) {
        String url = ("https://discourse.example.com//admin/site_settings/google_oath2_client_id");
        Map<String, Object> content = new HashMap<>();
        content.put("google_oath2_client_id", (google_oath2_client_id));
        requestPut(url, null, content, Void.class);
    }
}
