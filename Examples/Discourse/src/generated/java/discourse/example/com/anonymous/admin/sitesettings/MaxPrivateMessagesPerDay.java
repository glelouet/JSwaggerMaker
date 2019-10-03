package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxPrivateMessagesPerDay
    extends DelegateTransfer<Anonymous>
{

    public MaxPrivateMessagesPerDay(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max private messages per day
     * </p>
     * 
     * @param max_private_messages_per_day
     *     "Maximum number of messages users can create per day."
     *     
     */
    public void put(long max_private_messages_per_day) {
        String url = ("https://discourse.example.com//admin/site_settings/max_private_messages_per_day");
        Map<String, Object> content = new HashMap<>();
        content.put("max_private_messages_per_day", (max_private_messages_per_day));
        requestPut(url, null, content, Void.class);
    }
}
