package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PendingUsersReminderDelay
    extends DelegateTransfer<Anonymous>
{

    public PendingUsersReminderDelay(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * pending users reminder delay
     * </p>
     * 
     * @param pending_users_reminder_delay
     */
    public void put(long pending_users_reminder_delay) {
        String url = ("https://discourse.example.com//admin/site_settings/pending_users_reminder_delay");
        Map<String, Object> content = new HashMap<>();
        content.put("pending_users_reminder_delay", (pending_users_reminder_delay));
        requestPut(url, null, content, Void.class);
    }
}
