package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Pop3PollingPassword
    extends DelegateTransfer<Anonymous>
{

    public Pop3PollingPassword(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * pop3 polling password
     * </p>
     * 
     * @param pop3_polling_password
     *     The password for the POP3 account to poll for email.
     */
    public void put(String pop3_polling_password) {
        String url = ("https://discourse.example.com//admin/site_settings/pop3_polling_password");
        Map<String, Object> content = new HashMap<>();
        content.put("pop3_polling_password", (pop3_polling_password));
        requestPut(url, null, content, Void.class);
    }
}
