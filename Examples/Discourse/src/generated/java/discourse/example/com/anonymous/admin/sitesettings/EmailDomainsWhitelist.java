package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EmailDomainsWhitelist
    extends DelegateTransfer<Anonymous>
{

    public EmailDomainsWhitelist(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * email domains whitelist
     * </p>
     * 
     * @param email_domains_whitelist
     *     pipe delimited
     *     
     */
    public void put(String email_domains_whitelist) {
        String url = ("https://discourse.example.com//admin/site_settings/email_domains_whitelist");
        Map<String, Object> content = new HashMap<>();
        content.put("email_domains_whitelist", (email_domains_whitelist));
        requestPut(url, null, content, Void.class);
    }
}
