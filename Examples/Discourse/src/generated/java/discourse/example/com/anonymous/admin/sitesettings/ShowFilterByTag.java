package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ShowFilterByTag
    extends DelegateTransfer<Anonymous>
{

    public ShowFilterByTag(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "show filter by tag"
     * </p>
     * 
     * @param show_filter_by_tag
     *     "Show a dropdown to filter a topic list by tag."
     *     
     */
    public void put(boolean show_filter_by_tag) {
        String url = ("https://discourse.example.com//admin/site_settings/show_filter_by_tag");
        Map<String, Object> content = new HashMap<>();
        content.put("show_filter_by_tag", (show_filter_by_tag));
        requestPut(url, null, content, Void.class);
    }
}
