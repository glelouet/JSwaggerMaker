package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxEmailsPerDayPerUser
    extends DelegateTransfer<Anonymous>
{

    public MaxEmailsPerDayPerUser(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max emails per day per user
     * </p>
     * 
     * @param max_emails_per_day_per_user
     *     Maximum number of emails to send users per day. 0 to disable the limit
     */
    public void put(long max_emails_per_day_per_user) {
        String url = ("https://discourse.example.com//admin/site_settings/max_emails_per_day_per_user");
        Map<String, Object> content = new HashMap<>();
        content.put("max_emails_per_day_per_user", (max_emails_per_day_per_user));
        requestPut(url, null, content, Void.class);
    }
}
