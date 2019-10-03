package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class StaffLikeWeight
    extends DelegateTransfer<Anonymous>
{

    public StaffLikeWeight(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * staff like weight
     * </p>
     * 
     * @param staff_like_weight
     *     "How much extra weighting factor to give staff likes."
     *     
     */
    public void put(long staff_like_weight) {
        String url = ("https://discourse.example.com//admin/site_settings/staff_like_weight");
        Map<String, Object> content = new HashMap<>();
        content.put("staff_like_weight", (staff_like_weight));
        requestPut(url, null, content, Void.class);
    }
}
