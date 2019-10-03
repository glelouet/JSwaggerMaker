package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultCategoriesMuted
    extends DelegateTransfer<Anonymous>
{

    public DefaultCategoriesMuted(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default categories muted"
     * </p>
     * 
     * @param default_categories_muted
     *     "Pipe delimited category id's. List of categories that are muted by default."
     *     
     */
    public void put(String default_categories_muted) {
        String url = ("https://discourse.example.com//admin/site_settings/default_categories_muted");
        Map<String, Object> content = new HashMap<>();
        content.put("default_categories_muted", (default_categories_muted));
        requestPut(url, null, content, Void.class);
    }
}
