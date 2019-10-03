package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Pop3PollingPort
    extends DelegateTransfer<Anonymous>
{

    public Pop3PollingPort(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * pop3 polling port
     * </p>
     * 
     * @param pop3_polling_port
     *     The port to poll a POP3 account on
     */
    public void put(long pop3_polling_port) {
        String url = ("https://discourse.example.com//admin/site_settings/pop3_polling_port");
        Map<String, Object> content = new HashMap<>();
        content.put("pop3_polling_port", (pop3_polling_port));
        requestPut(url, null, content, Void.class);
    }
}
