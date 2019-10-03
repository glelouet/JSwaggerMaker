package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PostMenuHiddenItems
    extends DelegateTransfer<Anonymous>
{

    public PostMenuHiddenItems(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the post menu hidden items
     * </p>
     * 
     * @param post_menu_hidden_items
     *     pipe delimited
     */
    public void put(discourse.example.com.structures.post_menu_hidden_items post_menu_hidden_items) {
        String url = ("https://discourse.example.com//admin/site_settings/post_menu_hidden_items");
        Map<String, Object> content = new HashMap<>();
        content.put("post_menu_hidden_items", (post_menu_hidden_items));
        requestPut(url, null, content, Void.class);
    }
}
