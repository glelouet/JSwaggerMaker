package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TopMenu
    extends DelegateTransfer<Anonymous>
{

    public TopMenu(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the homepage navigation
     * </p>
     * 
     * @param top_menu
     *     pipe delimited
     */
    public void put(discourse.example.com.structures.top_menu top_menu) {
        String url = ("https://discourse.example.com//admin/site_settings/top_menu");
        Map<String, Object> content = new HashMap<>();
        content.put("top_menu", (top_menu));
        requestPut(url, null, content, Void.class);
    }
}
