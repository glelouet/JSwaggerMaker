package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowUserApiKeys
    extends DelegateTransfer<Anonymous>
{

    public AllowUserApiKeys(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "allow user api keys"
     * </p>
     * 
     * @param allow_user_api_keys
     *     "Allow generation of user API keys"
     *     
     */
    public void put(boolean allow_user_api_keys) {
        String url = ("https://discourse.example.com//admin/site_settings/allow_user_api_keys");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_user_api_keys", (allow_user_api_keys));
        requestPut(url, null, content, Void.class);
    }
}
