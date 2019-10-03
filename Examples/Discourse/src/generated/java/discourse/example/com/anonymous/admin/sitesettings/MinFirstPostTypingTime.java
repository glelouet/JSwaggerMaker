package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinFirstPostTypingTime
    extends DelegateTransfer<Anonymous>
{

    public MinFirstPostTypingTime(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * min first post typing time
     * </p>
     * 
     * @param min_first_post_typing_time
     *     "Minimum amount of time in milliseconds a user must type during first post, if threshold is not met post will automatically enter the needs approval queue. Set to 0 to disable (not recommended)"
     *     
     */
    public void put(long min_first_post_typing_time) {
        String url = ("https://discourse.example.com//admin/site_settings/min_first_post_typing_time");
        Map<String, Object> content = new HashMap<>();
        content.put("min_first_post_typing_time", (min_first_post_typing_time));
        requestPut(url, null, content, Void.class);
    }
}
