package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnablePrivateMessages
    extends DelegateTransfer<Anonymous>
{

    public EnablePrivateMessages(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable private messages
     * </p>
     * 
     * @param enable_private_messages
     */
    public void put(boolean enable_private_messages) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_private_messages");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_private_messages", (enable_private_messages));
        requestPut(url, null, content, Void.class);
    }
}
