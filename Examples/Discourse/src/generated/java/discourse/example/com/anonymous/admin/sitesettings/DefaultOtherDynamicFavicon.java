package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultOtherDynamicFavicon
    extends DelegateTransfer<Anonymous>
{

    public DefaultOtherDynamicFavicon(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * default other dynamic favicon
     * </p>
     * 
     * @param default_other_dynamic_favicon
     *     "Show new/updated topic count on browser icon by default."
     *     
     */
    public void put(boolean default_other_dynamic_favicon) {
        String url = ("https://discourse.example.com//admin/site_settings/default_other_dynamic_favicon");
        Map<String, Object> content = new HashMap<>();
        content.put("default_other_dynamic_favicon", (default_other_dynamic_favicon));
        requestPut(url, null, content, Void.class);
    }
}
