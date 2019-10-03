package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class StaffTags
    extends DelegateTransfer<Anonymous>
{

    public StaffTags(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "staff tags"
     * </p>
     * 
     * @param staff_tags
     *     "A list of tags that can only be applied by staff members"
     *     
     */
    public void put(String staff_tags) {
        String url = ("https://discourse.example.com//admin/site_settings/staff_tags");
        Map<String, Object> content = new HashMap<>();
        content.put("staff_tags", (staff_tags));
        requestPut(url, null, content, Void.class);
    }
}
