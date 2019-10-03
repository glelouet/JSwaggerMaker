package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultCategoriesTracking
    extends DelegateTransfer<Anonymous>
{

    public DefaultCategoriesTracking(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default categories tracking"
     * </p>
     * 
     * @param default_categories_tracking
     *     "Pipe delimited category id's. List of categories that are tracked by default."
     *     
     */
    public void put(String default_categories_tracking) {
        String url = ("https://discourse.example.com//admin/site_settings/default_categories_tracking");
        Map<String, Object> content = new HashMap<>();
        content.put("default_categories_tracking", (default_categories_tracking));
        requestPut(url, null, content, Void.class);
    }
}
