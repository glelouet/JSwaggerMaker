package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EmailPrefix
    extends DelegateTransfer<Anonymous>
{

    public EmailPrefix(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * email prefix
     * </p>
     * 
     * @param email_prefix
     *     "The [label] used in the subject of emails. It will default to 'title' if not set."
     *     
     */
    public void put(String email_prefix) {
        String url = ("https://discourse.example.com//admin/site_settings/email_prefix");
        Map<String, Object> content = new HashMap<>();
        content.put("email_prefix", (email_prefix));
        requestPut(url, null, content, Void.class);
    }
}
