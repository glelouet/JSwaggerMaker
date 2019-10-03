package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ShowSubcategoryList
    extends DelegateTransfer<Anonymous>
{

    public ShowSubcategoryList(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update show subcategory list
     * </p>
     * 
     * @param show_subcategory_list
     */
    public void put(boolean show_subcategory_list) {
        String url = ("https://discourse.example.com//admin/site_settings/show_subcategory_list");
        Map<String, Object> content = new HashMap<>();
        content.put("show_subcategory_list", (show_subcategory_list));
        requestPut(url, null, content, Void.class);
    }
}
