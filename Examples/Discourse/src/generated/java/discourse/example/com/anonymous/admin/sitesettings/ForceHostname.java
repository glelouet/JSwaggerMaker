package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ForceHostname
    extends DelegateTransfer<Anonymous>
{

    public ForceHostname(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * force hostname
     * </p>
     * 
     * @param force_hostname
     *     "DEVELOPER ONLY! WARNING! Specify a hostname in the URL. Leave blank for default."
     *     
     */
    public void put(String force_hostname) {
        String url = ("https://discourse.example.com//admin/site_settings/force_hostname");
        Map<String, Object> content = new HashMap<>();
        content.put("force_hostname", (force_hostname));
        requestPut(url, null, content, Void.class);
    }
}
