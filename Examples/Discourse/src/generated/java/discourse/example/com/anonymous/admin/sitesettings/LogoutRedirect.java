package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class LogoutRedirect
    extends DelegateTransfer<Anonymous>
{

    public LogoutRedirect(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * logout redirect
     * </p>
     * 
     * @param logout_redirect
     */
    public void put(String logout_redirect) {
        String url = ("https://discourse.example.com//admin/site_settings/logout_redirect");
        Map<String, Object> content = new HashMap<>();
        content.put("logout_redirect", (logout_redirect));
        requestPut(url, null, content, Void.class);
    }
}
