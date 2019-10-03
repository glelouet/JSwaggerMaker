package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Pop3PollingOpensslVerify
    extends DelegateTransfer<Anonymous>
{

    public Pop3PollingOpensslVerify(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * pop3 polling openssl verify
     * </p>
     * 
     * @param pop3_polling_openssl_verify
     *     Verify TLS server certificate
     */
    public void put(boolean pop3_polling_openssl_verify) {
        String url = ("https://discourse.example.com//admin/site_settings/pop3_polling_openssl_verify");
        Map<String, Object> content = new HashMap<>();
        content.put("pop3_polling_openssl_verify", (pop3_polling_openssl_verify));
        requestPut(url, null, content, Void.class);
    }
}
