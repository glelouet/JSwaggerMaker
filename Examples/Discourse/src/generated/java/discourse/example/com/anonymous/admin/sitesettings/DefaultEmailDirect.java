package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultEmailDirect
    extends DelegateTransfer<Anonymous>
{

    public DefaultEmailDirect(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default email direct"
     * </p>
     * 
     * @param default_email_direct
     *     "Send an email when someone quotes/replies to/mentions or invites the user by default."
     *     
     */
    public void put(boolean default_email_direct) {
        String url = ("https://discourse.example.com//admin/site_settings/default_email_direct");
        Map<String, Object> content = new HashMap<>();
        content.put("default_email_direct", (default_email_direct));
        requestPut(url, null, content, Void.class);
    }
}
