package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Pop3PollingEnabled
    extends DelegateTransfer<Anonymous>
{

    public Pop3PollingEnabled(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * pop3 polling enabled
     * </p>
     * 
     * @param pop3_polling_enabled
     *     You must set a 'pop3 polling host' before enabling POP3 polling
     */
    public void put(boolean pop3_polling_enabled) {
        String url = ("https://discourse.example.com//admin/site_settings/pop3_polling_enabled");
        Map<String, Object> content = new HashMap<>();
        content.put("pop3_polling_enabled", (pop3_polling_enabled));
        requestPut(url, null, content, Void.class);
    }
}
