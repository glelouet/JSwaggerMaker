package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxNewAccountsPerRegistrationIp
    extends DelegateTransfer<Anonymous>
{

    public MaxNewAccountsPerRegistrationIp(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max new accounts per registration ip
     * </p>
     * 
     * @param max_new_accounts_per_registration_ip
     *     "If there are already (n) trust level 0 accounts from this IP (and none is a staff member or at TL2 or higher), stop accepting new signups from that IP."
     *     
     */
    public void put(long max_new_accounts_per_registration_ip) {
        String url = ("https://discourse.example.com//admin/site_settings/max_new_accounts_per_registration_ip");
        Map<String, Object> content = new HashMap<>();
        content.put("max_new_accounts_per_registration_ip", (max_new_accounts_per_registration_ip));
        requestPut(url, null, content, Void.class);
    }
}
