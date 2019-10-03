package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Pop3PollingSsl
    extends DelegateTransfer<Anonymous>
{

    public Pop3PollingSsl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * pop3 polling ssl
     * </p>
     * 
     * @param pop3_polling_ssl
     *     Use SSL while connecting to the POP3 server
     */
    public void put(boolean pop3_polling_ssl) {
        String url = ("https://discourse.example.com//admin/site_settings/pop3_polling_ssl");
        Map<String, Object> content = new HashMap<>();
        content.put("pop3_polling_ssl", (pop3_polling_ssl));
        requestPut(url, null, content, Void.class);
    }
}
