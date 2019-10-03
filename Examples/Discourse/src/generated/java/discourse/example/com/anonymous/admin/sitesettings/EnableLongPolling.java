package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableLongPolling
    extends DelegateTransfer<Anonymous>
{

    public EnableLongPolling(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable long polling
     * </p>
     * 
     * @param enable_long_polling
     *     "Message bus used for notification can use long polling"
     *     
     */
    public void put(boolean enable_long_polling) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_long_polling");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_long_polling", (enable_long_polling));
        requestPut(url, null, content, Void.class);
    }
}
