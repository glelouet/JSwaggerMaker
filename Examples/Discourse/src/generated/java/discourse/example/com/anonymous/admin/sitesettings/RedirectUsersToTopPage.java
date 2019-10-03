package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class RedirectUsersToTopPage
    extends DelegateTransfer<Anonymous>
{

    public RedirectUsersToTopPage(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * redirect users to top page
     * </p>
     * 
     * @param redirect_users_to_top_page
     */
    public void put(boolean redirect_users_to_top_page) {
        String url = ("https://discourse.example.com//admin/site_settings/redirect_users_to_top_page");
        Map<String, Object> content = new HashMap<>();
        content.put("redirect_users_to_top_page", (redirect_users_to_top_page));
        requestPut(url, null, content, Void.class);
    }
}
