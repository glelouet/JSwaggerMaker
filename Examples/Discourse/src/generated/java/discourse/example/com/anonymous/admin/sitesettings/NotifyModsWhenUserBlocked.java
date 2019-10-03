package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class NotifyModsWhenUserBlocked
    extends DelegateTransfer<Anonymous>
{

    public NotifyModsWhenUserBlocked(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * notify mods when user blocked
     * </p>
     * 
     * @param notify_mods_when_user_blocked
     *     "If a user is automatically blocked, send a message to all moderators."
     *     
     */
    public void put(boolean notify_mods_when_user_blocked) {
        String url = ("https://discourse.example.com//admin/site_settings/notify_mods_when_user_blocked");
        Map<String, Object> content = new HashMap<>();
        content.put("notify_mods_when_user_blocked", (notify_mods_when_user_blocked));
        requestPut(url, null, content, Void.class);
    }
}
