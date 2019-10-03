package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class InvitesPerPage
    extends DelegateTransfer<Anonymous>
{

    public InvitesPerPage(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * invites per page
     * </p>
     * 
     * @param invites_per_page
     */
    public void put(long invites_per_page) {
        String url = ("https://discourse.example.com//admin/site_settings/invites_per_page");
        Map<String, Object> content = new HashMap<>();
        content.put("invites_per_page", (invites_per_page));
        requestPut(url, null, content, Void.class);
    }
}
