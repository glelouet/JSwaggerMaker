package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ShowPinnedExcerptDesktop
    extends DelegateTransfer<Anonymous>
{

    public ShowPinnedExcerptDesktop(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * show pinned excerpt desktop
     * </p>
     * 
     * @param show_pinned_excerpt_desktop
     */
    public void put(boolean show_pinned_excerpt_desktop) {
        String url = ("https://discourse.example.com//admin/site_settings/show_pinned_excerpt_desktop");
        Map<String, Object> content = new HashMap<>();
        content.put("show_pinned_excerpt_desktop", (show_pinned_excerpt_desktop));
        requestPut(url, null, content, Void.class);
    }
}
