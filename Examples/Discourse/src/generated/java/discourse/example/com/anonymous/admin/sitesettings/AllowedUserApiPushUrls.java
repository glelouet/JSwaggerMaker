package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowedUserApiPushUrls
    extends DelegateTransfer<Anonymous>
{

    public AllowedUserApiPushUrls(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "allowed user api push urls"
     * </p>
     * 
     * @param allowed_user_api_push_urls
     *     "Allowed URLs for server push to user API"
     *     
     */
    public void put(String allowed_user_api_push_urls) {
        String url = ("https://discourse.example.com//admin/site_settings/allowed_user_api_push_urls");
        Map<String, Object> content = new HashMap<>();
        content.put("allowed_user_api_push_urls", (allowed_user_api_push_urls));
        requestPut(url, null, content, Void.class);
    }
}
