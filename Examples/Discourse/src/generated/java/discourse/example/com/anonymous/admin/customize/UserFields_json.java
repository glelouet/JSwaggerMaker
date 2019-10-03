package discourse.example.com.anonymous.admin.customize;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class UserFields_json
    extends DelegateTransfer<Anonymous>
{

    public UserFields_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * list user fields
     * </p>
     */
    public void get() {
        String url = ("https://discourse.example.com//admin/customize/user_fields.json");
        requestGet(url, null, Void.class);
    }

    /**
     * 
     * <p>
     * create a user fields
     * </p>
     * 
     * @param user_field_name_
     * @param user_field_description_
     * @param user_field_field_type
     * @param user_field_required_
     */
    public void post(String user_field_name_,
        String user_field_description_,
        String user_field_field_type,
        boolean user_field_required_) {
        String url = ("https://discourse.example.com//admin/customize/user_fields.json");
        Map<String, Object> content = new HashMap<>();
        content.put("user_field_name_", user_field_name_);
        content.put("user_field_description_", user_field_description_);
        content.put("user_field_field_type", user_field_field_type);
        content.put("user_field_required_", user_field_required_);
        requestPost(url, null, content, Void.class);
    }
}
