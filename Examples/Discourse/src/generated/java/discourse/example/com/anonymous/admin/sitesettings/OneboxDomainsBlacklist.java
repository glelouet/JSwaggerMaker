package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class OneboxDomainsBlacklist
    extends DelegateTransfer<Anonymous>
{

    public OneboxDomainsBlacklist(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * onebox domains blacklist
     * </p>
     * 
     * @param onebox_domains_blacklist
     *     "A list of domains that will never be oneboxed."
     *     
     */
    public void put(String onebox_domains_blacklist) {
        String url = ("https://discourse.example.com//admin/site_settings/onebox_domains_blacklist");
        Map<String, Object> content = new HashMap<>();
        content.put("onebox_domains_blacklist", (onebox_domains_blacklist));
        requestPut(url, null, content, Void.class);
    }
}
