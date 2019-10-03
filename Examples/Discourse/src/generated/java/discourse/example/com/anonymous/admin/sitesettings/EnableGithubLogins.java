package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableGithubLogins
    extends DelegateTransfer<Anonymous>
{

    public EnableGithubLogins(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable github logins
     * </p>
     * 
     * @param enable_github_logins
     */
    public void put(boolean enable_github_logins) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_github_logins");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_github_logins", (enable_github_logins));
        requestPut(url, null, content, Void.class);
    }
}
