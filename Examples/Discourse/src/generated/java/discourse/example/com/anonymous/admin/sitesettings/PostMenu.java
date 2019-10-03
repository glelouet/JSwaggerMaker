package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PostMenu
    extends DelegateTransfer<Anonymous>
{

    public PostMenu(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the post menu items
     * </p>
     * 
     * @param post_menu
     *     pipe delimited
     */
    public void put(discourse.example.com.structures.post_menu post_menu) {
        String url = ("https://discourse.example.com//admin/site_settings/post_menu");
        Map<String, Object> content = new HashMap<>();
        content.put("post_menu", (post_menu));
        requestPut(url, null, content, Void.class);
    }
}
