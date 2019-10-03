package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ReplyByEmailEnabled
    extends DelegateTransfer<Anonymous>
{

    public ReplyByEmailEnabled(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * reply by email enabled
     * </p>
     * 
     * @param reply_by_email_enabled
     *     `reply_by_email_address` needs to be set first
     */
    public void put(boolean reply_by_email_enabled) {
        String url = ("https://discourse.example.com//admin/site_settings/reply_by_email_enabled");
        Map<String, Object> content = new HashMap<>();
        content.put("reply_by_email_enabled", (reply_by_email_enabled));
        requestPut(url, null, content, Void.class);
    }
}
