package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ForceHttps
    extends DelegateTransfer<Anonymous>
{

    public ForceHttps(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * force https
     * </p>
     * 
     * @param force_https
     *     "Force your site to use HTTPS only. WARNING: do NOT enable this until you verify HTTPS is fully set up and working absolutely everywhere! Did you check your CDN, all social logins, and any external logos / dependencies to make sure they are all HTTPS compatible, too?"
     *     
     */
    public void put(boolean force_https) {
        String url = ("https://discourse.example.com//admin/site_settings/force_https");
        Map<String, Object> content = new HashMap<>();
        content.put("force_https", (force_https));
        requestPut(url, null, content, Void.class);
    }
}
