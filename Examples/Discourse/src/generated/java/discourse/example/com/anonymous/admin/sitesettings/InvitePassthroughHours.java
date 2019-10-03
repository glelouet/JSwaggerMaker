package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class InvitePassthroughHours
    extends DelegateTransfer<Anonymous>
{

    public InvitePassthroughHours(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * invite passthrough hours
     * </p>
     * 
     * @param invite_passthrough_hours
     */
    public void put(long invite_passthrough_hours) {
        String url = ("https://discourse.example.com//admin/site_settings/invite_passthrough_hours");
        Map<String, Object> content = new HashMap<>();
        content.put("invite_passthrough_hours", (invite_passthrough_hours));
        requestPut(url, null, content, Void.class);
    }
}
