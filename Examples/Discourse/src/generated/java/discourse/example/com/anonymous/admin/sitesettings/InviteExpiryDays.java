package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class InviteExpiryDays
    extends DelegateTransfer<Anonymous>
{

    public InviteExpiryDays(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * invite expiry days
     * </p>
     * 
     * @param invite_expiry_days
     */
    public void put(long invite_expiry_days) {
        String url = ("https://discourse.example.com//admin/site_settings/invite_expiry_days");
        Map<String, Object> content = new HashMap<>();
        content.put("invite_expiry_days", (invite_expiry_days));
        requestPut(url, null, content, Void.class);
    }
}
