package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxUserApiReqsPerMinute
    extends DelegateTransfer<Anonymous>
{

    public MaxUserApiReqsPerMinute(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "max user api reqs per minute"
     * </p>
     * 
     * @param max_user_api_reqs_per_minute
     *     "Maximum number of user API requests per key per minute"
     *     
     */
    public void put(long max_user_api_reqs_per_minute) {
        String url = ("https://discourse.example.com//admin/site_settings/max_user_api_reqs_per_minute");
        Map<String, Object> content = new HashMap<>();
        content.put("max_user_api_reqs_per_minute", (max_user_api_reqs_per_minute));
        requestPut(url, null, content, Void.class);
    }
}
