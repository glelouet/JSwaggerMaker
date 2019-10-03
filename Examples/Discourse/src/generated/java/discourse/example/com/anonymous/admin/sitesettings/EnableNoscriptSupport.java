package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableNoscriptSupport
    extends DelegateTransfer<Anonymous>
{

    public EnableNoscriptSupport(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable noscript support
     * </p>
     * 
     * @param enable_noscript_support
     *     "Enable standard webcrawler search engine support via the noscript tag"
     *     
     */
    public void put(boolean enable_noscript_support) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_noscript_support");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_noscript_support", (enable_noscript_support));
        requestPut(url, null, content, Void.class);
    }
}
