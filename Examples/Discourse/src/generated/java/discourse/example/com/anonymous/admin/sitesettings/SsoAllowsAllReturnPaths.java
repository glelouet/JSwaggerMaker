package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SsoAllowsAllReturnPaths
    extends DelegateTransfer<Anonymous>
{

    public SsoAllowsAllReturnPaths(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * sso allows all return paths
     * </p>
     * 
     * @param ss_allows_all_return_paths
     */
    public void put(boolean ss_allows_all_return_paths) {
        String url = ("https://discourse.example.com//admin/site_settings/sso_allows_all_return_paths");
        Map<String, Object> content = new HashMap<>();
        content.put("ss_allows_all_return_paths", (ss_allows_all_return_paths));
        requestPut(url, null, content, Void.class);
    }
}
