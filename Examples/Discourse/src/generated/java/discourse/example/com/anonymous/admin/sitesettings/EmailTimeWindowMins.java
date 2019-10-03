package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EmailTimeWindowMins
    extends DelegateTransfer<Anonymous>
{

    public EmailTimeWindowMins(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * email time window mins
     * </p>
     * 
     * @param email_time_window_mins
     */
    public void put(long email_time_window_mins) {
        String url = ("https://discourse.example.com//admin/site_settings/email_time_window_mins");
        Map<String, Object> content = new HashMap<>();
        content.put("email_time_window_mins", (email_time_window_mins));
        requestPut(url, null, content, Void.class);
    }
}
