package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class LoginRequired
    extends DelegateTransfer<Anonymous>
{

    public LoginRequired(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update login required
     * </p>
     * 
     * @param login_required
     */
    public void put(boolean login_required) {
        String url = ("https://discourse.example.com//admin/site_settings/login_required");
        Map<String, Object> content = new HashMap<>();
        content.put("login_required", (login_required));
        requestPut(url, null, content, Void.class);
    }
}
