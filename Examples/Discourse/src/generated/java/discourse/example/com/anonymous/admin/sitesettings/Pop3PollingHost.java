package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Pop3PollingHost
    extends DelegateTransfer<Anonymous>
{

    public Pop3PollingHost(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * pop3 polling host
     * </p>
     * 
     * @param pop3_polling_host
     *     The host to poll for email via POP3
     */
    public void put(String pop3_polling_host) {
        String url = ("https://discourse.example.com//admin/site_settings/pop3_polling_host");
        Map<String, Object> content = new HashMap<>();
        content.put("pop3_polling_host", (pop3_polling_host));
        requestPut(url, null, content, Void.class);
    }
}
