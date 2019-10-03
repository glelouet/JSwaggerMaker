package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EditHistoryVisibleToPublic
    extends DelegateTransfer<Anonymous>
{

    public EditHistoryVisibleToPublic(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * edit history visible to public
     * </p>
     * 
     * @param edit_history_visible_to_public
     */
    public void put(boolean edit_history_visible_to_public) {
        String url = ("https://discourse.example.com//admin/site_settings/edit_history_visible_to_public");
        Map<String, Object> content = new HashMap<>();
        content.put("edit_history_visible_to_public", (edit_history_visible_to_public));
        requestPut(url, null, content, Void.class);
    }
}
