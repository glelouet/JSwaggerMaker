package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class VersionChecks
    extends DelegateTransfer<Anonymous>
{

    public VersionChecks(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * version checks
     * </p>
     * 
     * @param version_checks
     *     "Ping the Discourse Hub for version updates and show new version messages on the /admin dashboard"
     *     
     */
    public void put(boolean version_checks) {
        String url = ("https://discourse.example.com//admin/site_settings/version_checks");
        Map<String, Object> content = new HashMap<>();
        content.put("version_checks", (version_checks));
        requestPut(url, null, content, Void.class);
    }
}
