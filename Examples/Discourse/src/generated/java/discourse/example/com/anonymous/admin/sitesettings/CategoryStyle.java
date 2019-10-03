package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class CategoryStyle
    extends DelegateTransfer<Anonymous>
{

    public CategoryStyle(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the category style
     * </p>
     * 
     * @param category_style
     */
    public void put(discourse.example.com.structures.category_style category_style) {
        String url = ("https://discourse.example.com//admin/site_settings/category_style");
        Map<String, Object> content = new HashMap<>();
        content.put("category_style", (category_style));
        requestPut(url, null, content, Void.class);
    }
}
