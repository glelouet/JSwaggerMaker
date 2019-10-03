package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DeleteUserMaxPostAge
    extends DelegateTransfer<Anonymous>
{

    public DeleteUserMaxPostAge(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * delete user max post age
     * </p>
     * 
     * @param delete_user_max_post_age
     */
    public void put(long delete_user_max_post_age) {
        String url = ("https://discourse.example.com//admin/site_settings/delete_user_max_post_age");
        Map<String, Object> content = new HashMap<>();
        content.put("delete_user_max_post_age", (delete_user_max_post_age));
        requestPut(url, null, content, Void.class);
    }
}
