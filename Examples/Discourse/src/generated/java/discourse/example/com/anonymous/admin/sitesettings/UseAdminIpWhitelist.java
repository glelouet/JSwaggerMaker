package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class UseAdminIpWhitelist
    extends DelegateTransfer<Anonymous>
{

    public UseAdminIpWhitelist(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * use admin ip whitelist
     * </p>
     * 
     * @param use_admin_ip_whitelist
     *     "Admins can only log in if they are at an IP address defined in the Screened IPs list (Admin > Logs > Screened Ips)."
     *     
     */
    public void put(boolean use_admin_ip_whitelist) {
        String url = ("https://discourse.example.com//admin/site_settings/use_admin_ip_whitelist");
        Map<String, Object> content = new HashMap<>();
        content.put("use_admin_ip_whitelist", (use_admin_ip_whitelist));
        requestPut(url, null, content, Void.class);
    }
}
