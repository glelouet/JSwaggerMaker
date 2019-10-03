package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultEmailAlways
    extends DelegateTransfer<Anonymous>
{

    public DefaultEmailAlways(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default email always"
     * </p>
     * 
     * @param default_email_always
     *     "Send an email notification even when the user is active by default."
     *     
     */
    public void put(boolean default_email_always) {
        String url = ("https://discourse.example.com//admin/site_settings/default_email_always");
        Map<String, Object> content = new HashMap<>();
        content.put("default_email_always", (default_email_always));
        requestPut(url, null, content, Void.class);
    }
}
