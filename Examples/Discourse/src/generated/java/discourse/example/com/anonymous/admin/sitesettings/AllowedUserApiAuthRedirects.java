package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowedUserApiAuthRedirects
    extends DelegateTransfer<Anonymous>
{

    public AllowedUserApiAuthRedirects(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "allowed user api auth redirects"
     * </p>
     * 
     * @param allowed_user_api_auth_redirects
     *     "Allowed URL for authentication redirect for user API keys"
     *     
     */
    public void put(String allowed_user_api_auth_redirects) {
        String url = ("https://discourse.example.com//admin/site_settings/allowed_user_api_auth_redirects");
        Map<String, Object> content = new HashMap<>();
        content.put("allowed_user_api_auth_redirects", (allowed_user_api_auth_redirects));
        requestPut(url, null, content, Void.class);
    }
}
