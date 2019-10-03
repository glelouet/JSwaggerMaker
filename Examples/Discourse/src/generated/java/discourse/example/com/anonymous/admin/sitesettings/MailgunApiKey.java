package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MailgunApiKey
    extends DelegateTransfer<Anonymous>
{

    public MailgunApiKey(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * mailgun api key
     * </p>
     * 
     * @param mailgun_api_key
     *     Mailgun Secret API key used to verify webhook messages.
     */
    public void put(String mailgun_api_key) {
        String url = ("https://discourse.example.com//admin/site_settings/mailgun_api_key");
        Map<String, Object> content = new HashMap<>();
        content.put("mailgun_api_key", (mailgun_api_key));
        requestPut(url, null, content, Void.class);
    }
}
