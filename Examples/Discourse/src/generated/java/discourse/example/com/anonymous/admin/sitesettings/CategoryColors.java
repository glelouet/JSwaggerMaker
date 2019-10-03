package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class CategoryColors
    extends DelegateTransfer<Anonymous>
{

    public CategoryColors(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update a list of hexadecimal color values
     * </p>
     * 
     * @param category_colors
     *     pipe delimited
     */
    public void put(String category_colors) {
        String url = ("https://discourse.example.com//admin/site_settings/category_colors");
        Map<String, Object> content = new HashMap<>();
        content.put("category_colors", (category_colors));
        requestPut(url, null, content, Void.class);
    }
}
