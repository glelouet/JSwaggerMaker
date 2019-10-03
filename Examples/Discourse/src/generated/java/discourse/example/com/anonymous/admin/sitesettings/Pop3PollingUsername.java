package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Pop3PollingUsername
    extends DelegateTransfer<Anonymous>
{

    public Pop3PollingUsername(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * pop3 polling username
     * </p>
     * 
     * @param pop3_polling_username
     *     The username for the POP3 account to poll for email.
     */
    public void put(String pop3_polling_username) {
        String url = ("https://discourse.example.com//admin/site_settings/pop3_polling_username");
        Map<String, Object> content = new HashMap<>();
        content.put("pop3_polling_username", (pop3_polling_username));
        requestPut(url, null, content, Void.class);
    }
}
