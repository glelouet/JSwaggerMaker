package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class StaffUsersCustomFields
    extends DelegateTransfer<Anonymous>
{

    public StaffUsersCustomFields(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * staff user custom fields
     * </p>
     * 
     * @param staff_users_custom_fields
     */
    public void put(String staff_users_custom_fields) {
        String url = ("https://discourse.example.com//admin/site_settings/staff_users_custom_fields");
        Map<String, Object> content = new HashMap<>();
        content.put("staff_users_custom_fields", (staff_users_custom_fields));
        requestPut(url, null, content, Void.class);
    }
}
