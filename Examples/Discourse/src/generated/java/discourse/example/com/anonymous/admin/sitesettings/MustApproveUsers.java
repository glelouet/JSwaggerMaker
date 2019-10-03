package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MustApproveUsers
    extends DelegateTransfer<Anonymous>
{

    public MustApproveUsers(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update must approve users
     * </p>
     * 
     * @param must_approve_users
     */
    public void put(boolean must_approve_users) {
        String url = ("https://discourse.example.com//admin/site_settings/must_approve_users");
        Map<String, Object> content = new HashMap<>();
        content.put("must_approve_users", (must_approve_users));
        requestPut(url, null, content, Void.class);
    }
}
