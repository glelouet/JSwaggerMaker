package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowUserApiKeyScopes
    extends DelegateTransfer<Anonymous>
{

    public AllowUserApiKeyScopes(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "allow user api key scopes"
     * </p>
     * 
     * @param allow_user_api_key_scopes
     *     "List of scopes allowed for user API keys"
     *     
     */
    public void put(String allow_user_api_key_scopes) {
        String url = ("https://discourse.example.com//admin/site_settings/allow_user_api_key_scopes");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_user_api_key_scopes", (allow_user_api_key_scopes));
        requestPut(url, null, content, Void.class);
    }
}
