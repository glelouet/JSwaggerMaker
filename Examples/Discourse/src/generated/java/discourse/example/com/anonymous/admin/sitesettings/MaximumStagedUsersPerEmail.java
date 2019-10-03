package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaximumStagedUsersPerEmail
    extends DelegateTransfer<Anonymous>
{

    public MaximumStagedUsersPerEmail(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * maximum staged users per email
     * </p>
     * 
     * @param maximum_staged_users_per_email
     *     Maximum number of staged users created when processing an incoming email.
     */
    public void put(long maximum_staged_users_per_email) {
        String url = ("https://discourse.example.com//admin/site_settings/maximum_staged_users_per_email");
        Map<String, Object> content = new HashMap<>();
        content.put("maximum_staged_users_per_email", (maximum_staged_users_per_email));
        requestPut(url, null, content, Void.class);
    }
}
