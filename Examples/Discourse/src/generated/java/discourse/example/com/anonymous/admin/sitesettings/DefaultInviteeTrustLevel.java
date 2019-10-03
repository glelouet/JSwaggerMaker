package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultInviteeTrustLevel
    extends DelegateTransfer<Anonymous>
{

    public DefaultInviteeTrustLevel(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * default invitee trust level
     * </p>
     * 
     * @param default_invitee_trust_level
     *     "Default trust level (0-4) for invited users."
     *     
     */
    public void put(long default_invitee_trust_level) {
        String url = ("https://discourse.example.com//admin/site_settings/default_invitee_trust_level");
        Map<String, Object> content = new HashMap<>();
        content.put("default_invitee_trust_level", (default_invitee_trust_level));
        requestPut(url, null, content, Void.class);
    }
}
