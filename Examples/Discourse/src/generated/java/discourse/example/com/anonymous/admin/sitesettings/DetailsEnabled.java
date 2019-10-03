package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DetailsEnabled
    extends DelegateTransfer<Anonymous>
{

    public DetailsEnabled(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "details enabled"
     * </p>
     * 
     * @param details_enabled
     *     'Enable the details plugin. If you change this, you must rebake all posts with: "rake posts:rebake".'
     *     
     */
    public void put(boolean details_enabled) {
        String url = ("https://discourse.example.com//admin/site_settings/details_enabled");
        Map<String, Object> content = new HashMap<>();
        content.put("details_enabled", (details_enabled));
        requestPut(url, null, content, Void.class);
    }
}
