package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowModeratorsToCreateCategories
    extends DelegateTransfer<Anonymous>
{

    public AllowModeratorsToCreateCategories(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * allow moderators to create categories
     * </p>
     * 
     * @param allow_moderators_to_create_categories
     *     "Allow moderators to create new categories"
     *     
     */
    public void put(boolean allow_moderators_to_create_categories) {
        String url = ("https://discourse.example.com//admin/site_settings/allow_moderators_to_create_categories");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_moderators_to_create_categories", (allow_moderators_to_create_categories));
        requestPut(url, null, content, Void.class);
    }
}
