package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class FixedCategoryPositionsOnCreate
    extends DelegateTransfer<Anonymous>
{

    public FixedCategoryPositionsOnCreate(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update fixed category positions on create
     * </p>
     * 
     * @param fixed_category_positions_on_create
     */
    public void put(boolean fixed_category_positions_on_create) {
        String url = ("https://discourse.example.com//admin/site_settings/fixed_category_positions_on_create");
        Map<String, Object> content = new HashMap<>();
        content.put("fixed_category_positions_on_create", (fixed_category_positions_on_create));
        requestPut(url, null, content, Void.class);
    }
}
