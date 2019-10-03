package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultEmailDigestFrequency
    extends DelegateTransfer<Anonymous>
{

    public DefaultEmailDigestFrequency(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default email digest frequency"
     * </p>
     * 
     * @param default_email_digest_frequency
     *     "How often users receive summary emails by default."
     *     
     */
    public void put(long default_email_digest_frequency) {
        String url = ("https://discourse.example.com//admin/site_settings/default_email_digest_frequency");
        Map<String, Object> content = new HashMap<>();
        content.put("default_email_digest_frequency", (default_email_digest_frequency));
        requestPut(url, null, content, Void.class);
    }
}
