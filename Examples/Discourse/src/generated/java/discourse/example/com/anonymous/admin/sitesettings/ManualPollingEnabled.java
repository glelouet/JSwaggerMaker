package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ManualPollingEnabled
    extends DelegateTransfer<Anonymous>
{

    public ManualPollingEnabled(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * manual polling enabled
     * </p>
     * 
     * @param manual_polling_enabled
     */
    public void put(boolean manual_polling_enabled) {
        String url = ("https://discourse.example.com//admin/site_settings/manual_polling_enabled");
        Map<String, Object> content = new HashMap<>();
        content.put("manual_polling_enabled", (manual_polling_enabled));
        requestPut(url, null, content, Void.class);
    }
}
