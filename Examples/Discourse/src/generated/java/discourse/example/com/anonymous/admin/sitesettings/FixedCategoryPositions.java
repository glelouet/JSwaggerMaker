package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class FixedCategoryPositions
    extends DelegateTransfer<Anonymous>
{

    public FixedCategoryPositions(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update fixed category positions
     * </p>
     * 
     * @param fixed_category_positions
     */
    public void put(boolean fixed_category_positions) {
        String url = ("https://discourse.example.com//admin/site_settings/fixed_category_positions");
        Map<String, Object> content = new HashMap<>();
        content.put("fixed_category_positions", (fixed_category_positions));
        requestPut(url, null, content, Void.class);
    }
}
