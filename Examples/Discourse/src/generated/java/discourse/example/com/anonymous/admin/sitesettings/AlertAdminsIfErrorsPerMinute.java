package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AlertAdminsIfErrorsPerMinute
    extends DelegateTransfer<Anonymous>
{

    public AlertAdminsIfErrorsPerMinute(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * alert admins if errors per minute
     * </p>
     * 
     * @param alert_admins_if_errors_per_minute
     *     "Number of errors per minute in order to trigger an admin alert. A value of 0 disables this feature. NOTE: requires restart."
     *     
     */
    public void put(long alert_admins_if_errors_per_minute) {
        String url = ("https://discourse.example.com//admin/site_settings/alert_admins_if_errors_per_minute");
        Map<String, Object> content = new HashMap<>();
        content.put("alert_admins_if_errors_per_minute", (alert_admins_if_errors_per_minute));
        requestPut(url, null, content, Void.class);
    }
}
