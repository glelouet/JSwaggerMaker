package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DeleteEmailLogsAfterDays
    extends DelegateTransfer<Anonymous>
{

    public DeleteEmailLogsAfterDays(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * delete email logs after days
     * </p>
     * 
     * @param delete_email_logs_after_days
     *     Delete email logs after (N) days. 0 to keep indefinitely
     *     
     */
    public void put(long delete_email_logs_after_days) {
        String url = ("https://discourse.example.com//admin/site_settings/delete_email_logs_after_days");
        Map<String, Object> content = new HashMap<>();
        content.put("delete_email_logs_after_days", (delete_email_logs_after_days));
        requestPut(url, null, content, Void.class);
    }
}
