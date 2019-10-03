package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxRepliesInFirstDay
    extends DelegateTransfer<Anonymous>
{

    public MaxRepliesInFirstDay(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max replies in first day
     * </p>
     * 
     * @param max_replies_in_first_day
     *     "The maximum number of replies a user is allowed to create in the 24 hour period after creating their first post"
     *     
     */
    public void put(long max_replies_in_first_day) {
        String url = ("https://discourse.example.com//admin/site_settings/max_replies_in_first_day");
        Map<String, Object> content = new HashMap<>();
        content.put("max_replies_in_first_day", (max_replies_in_first_day));
        requestPut(url, null, content, Void.class);
    }
}
