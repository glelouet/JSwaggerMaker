package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ShowPinnedExcerptMobile
    extends DelegateTransfer<Anonymous>
{

    public ShowPinnedExcerptMobile(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * show pinned excerpt mobile
     * </p>
     * 
     * @param show_pinned_excerpt_mobile
     */
    public void put(boolean show_pinned_excerpt_mobile) {
        String url = ("https://discourse.example.com//admin/site_settings/show_pinned_excerpt_mobile");
        Map<String, Object> content = new HashMap<>();
        content.put("show_pinned_excerpt_mobile", (show_pinned_excerpt_mobile));
        requestPut(url, null, content, Void.class);
    }
}
