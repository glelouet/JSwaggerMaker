package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DesktopCategoryPageStyle
    extends DelegateTransfer<Anonymous>
{

    public DesktopCategoryPageStyle(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the visual style for the /categories page
     * </p>
     * 
     * @param desktop_category_page_style
     */
    public void put(discourse.example.com.structures.desktop_category_page_style desktop_category_page_style) {
        String url = ("https://discourse.example.com//admin/site_settings/desktop_category_page_style");
        Map<String, Object> content = new HashMap<>();
        content.put("desktop_category_page_style", (desktop_category_page_style));
        requestPut(url, null, content, Void.class);
    }
}
