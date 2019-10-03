package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AlertAdminsIfErrorsPerHour
    extends DelegateTransfer<Anonymous>
{

    public AlertAdminsIfErrorsPerHour(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * alert admins if errors per hour
     * </p>
     * 
     * @param alert_admins_if_errors_per_hour
     *     "Number of errors per hour in order to trigger an admin alert. A value of 0 disables this feature. NOTE: requires restart."
     *     
     */
    public void put(long alert_admins_if_errors_per_hour) {
        String url = ("https://discourse.example.com//admin/site_settings/alert_admins_if_errors_per_hour");
        Map<String, Object> content = new HashMap<>();
        content.put("alert_admins_if_errors_per_hour", (alert_admins_if_errors_per_hour));
        requestPut(url, null, content, Void.class);
    }
}
