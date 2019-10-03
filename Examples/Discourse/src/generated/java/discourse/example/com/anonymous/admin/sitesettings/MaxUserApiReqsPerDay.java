package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxUserApiReqsPerDay
    extends DelegateTransfer<Anonymous>
{

    public MaxUserApiReqsPerDay(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "max user api reqs per day"
     * </p>
     * 
     * @param max_user_api_reqs_per_day
     *     "Maximum number of user API requests per key per day"
     *     
     */
    public void put(long max_user_api_reqs_per_day) {
        String url = ("https://discourse.example.com//admin/site_settings/max_user_api_reqs_per_day");
        Map<String, Object> content = new HashMap<>();
        content.put("max_user_api_reqs_per_day", (max_user_api_reqs_per_day));
        requestPut(url, null, content, Void.class);
    }
}
