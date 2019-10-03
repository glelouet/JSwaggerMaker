package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxUsersNotifiedPerGroupMention
    extends DelegateTransfer<Anonymous>
{

    public MaxUsersNotifiedPerGroupMention(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max users notified per group mention
     * </p>
     * 
     * @param max_users_notified_per_group_mention
     */
    public void put(long max_users_notified_per_group_mention) {
        String url = ("https://discourse.example.com//admin/site_settings/max_users_notified_per_group_mention");
        Map<String, Object> content = new HashMap<>();
        content.put("max_users_notified_per_group_mention", (max_users_notified_per_group_mention));
        requestPut(url, null, content, Void.class);
    }
}
