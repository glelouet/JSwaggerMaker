package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EmailDomainsBlacklist
    extends DelegateTransfer<Anonymous>
{

    public EmailDomainsBlacklist(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * email domains blacklist
     * </p>
     * 
     * @param email_domains_blacklist
     *     pipe delimited
     *     
     */
    public void put(String email_domains_blacklist) {
        String url = ("https://discourse.example.com//admin/site_settings/email_domains_blacklist");
        Map<String, Object> content = new HashMap<>();
        content.put("email_domains_blacklist", (email_domains_blacklist));
        requestPut(url, null, content, Void.class);
    }
}
