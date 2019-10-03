package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PrivateEmailTimeWindowSeconds
    extends DelegateTransfer<Anonymous>
{

    public PrivateEmailTimeWindowSeconds(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * private email time window seconds
     * </p>
     * 
     * @param private_email_time_window_seconds
     */
    public void put(long private_email_time_window_seconds) {
        String url = ("https://discourse.example.com//admin/site_settings/private_email_time_window_seconds");
        Map<String, Object> content = new HashMap<>();
        content.put("private_email_time_window_seconds", (private_email_time_window_seconds));
        requestPut(url, null, content, Void.class);
    }
}
