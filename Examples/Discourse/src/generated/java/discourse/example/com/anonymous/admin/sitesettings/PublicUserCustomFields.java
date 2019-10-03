package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PublicUserCustomFields
    extends DelegateTransfer<Anonymous>
{

    public PublicUserCustomFields(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * public user custom fields
     * </p>
     * 
     * @param public_user_custom_fields
     */
    public void put(String public_user_custom_fields) {
        String url = ("https://discourse.example.com//admin/site_settings/public_user_custom_fields");
        Map<String, Object> content = new HashMap<>();
        content.put("public_user_custom_fields", (public_user_custom_fields));
        requestPut(url, null, content, Void.class);
    }
}
