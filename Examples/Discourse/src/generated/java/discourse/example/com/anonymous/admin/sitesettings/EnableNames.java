package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableNames
    extends DelegateTransfer<Anonymous>
{

    public EnableNames(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable names
     * </p>
     * 
     * @param enable_names
     */
    public void put(boolean enable_names) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_names");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_names", (enable_names));
        requestPut(url, null, content, Void.class);
    }
}
