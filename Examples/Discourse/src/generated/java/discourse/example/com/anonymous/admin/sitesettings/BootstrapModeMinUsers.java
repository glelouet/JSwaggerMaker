package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class BootstrapModeMinUsers
    extends DelegateTransfer<Anonymous>
{

    public BootstrapModeMinUsers(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * bootstrap mode min users
     * </p>
     * 
     * @param bootstrap_mode_min_users
     *     "Minimum number of users required to disable bootstrap mode (set to 0 to disable)"
     *     
     */
    public void put(long bootstrap_mode_min_users) {
        String url = ("https://discourse.example.com//admin/site_settings/bootstrap_mode_min_users");
        Map<String, Object> content = new HashMap<>();
        content.put("bootstrap_mode_min_users", (bootstrap_mode_min_users));
        requestPut(url, null, content, Void.class);
    }
}
