package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxApiKeysPerUser
    extends DelegateTransfer<Anonymous>
{

    public MaxApiKeysPerUser(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "max api keys per user"
     * </p>
     * 
     * @param max_api_keys_per_user
     *     "Maximum number of user API keys per user"
     *     
     */
    public void put(long max_api_keys_per_user) {
        String url = ("https://discourse.example.com//admin/site_settings/max_api_keys_per_user");
        Map<String, Object> content = new HashMap<>();
        content.put("max_api_keys_per_user", (max_api_keys_per_user));
        requestPut(url, null, content, Void.class);
    }
}
