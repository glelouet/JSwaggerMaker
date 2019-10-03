package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableStagedUsers
    extends DelegateTransfer<Anonymous>
{

    public EnableStagedUsers(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable staged users
     * </p>
     * 
     * @param enable_staged_users
     *     Automatically create staged users when processing incoming emails.
     */
    public void put(boolean enable_staged_users) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_staged_users");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_staged_users", (enable_staged_users));
        requestPut(url, null, content, Void.class);
    }
}
