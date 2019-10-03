package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinTrustLevelForUserApiKey
    extends DelegateTransfer<Anonymous>
{

    public MinTrustLevelForUserApiKey(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "min trust level for user api key"
     * </p>
     * 
     * @param min_trust_level_for_user_api_key
     *     "Trust level required for generation of user API keys"
     *     
     */
    public void put(long min_trust_level_for_user_api_key) {
        String url = ("https://discourse.example.com//admin/site_settings/min_trust_level_for_user_api_key");
        Map<String, Object> content = new HashMap<>();
        content.put("min_trust_level_for_user_api_key", (min_trust_level_for_user_api_key));
        requestPut(url, null, content, Void.class);
    }
}
