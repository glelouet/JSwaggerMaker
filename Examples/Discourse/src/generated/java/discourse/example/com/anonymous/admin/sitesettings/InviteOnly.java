package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class InviteOnly
    extends DelegateTransfer<Anonymous>
{

    public InviteOnly(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update invite only
     * </p>
     * 
     * @param invite_only
     */
    public void put(boolean invite_only) {
        String url = ("https://discourse.example.com//admin/site_settings/invite_only");
        Map<String, Object> content = new HashMap<>();
        content.put("invite_only", (invite_only));
        requestPut(url, null, content, Void.class);
    }
}
