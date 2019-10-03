package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class LimitSuggestedToCategory
    extends DelegateTransfer<Anonymous>
{

    public LimitSuggestedToCategory(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update show topics from the current category
     * </p>
     * 
     * @param limit_suggested_to_category
     */
    public void put(boolean limit_suggested_to_category) {
        String url = ("https://discourse.example.com//admin/site_settings/limit_suggested_to_category");
        Map<String, Object> content = new HashMap<>();
        content.put("limit_suggested_to_category", (limit_suggested_to_category));
        requestPut(url, null, content, Void.class);
    }
}
