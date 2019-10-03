package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class WhiteListedSpamHostDomains
    extends DelegateTransfer<Anonymous>
{

    public WhiteListedSpamHostDomains(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * white listed spam host domains
     * </p>
     * 
     * @param white_listed_spam_host_domains
     *     "A list of domains excluded from spam host testing. New users will never be restricted from creating posts with links to these domains."
     *     
     */
    public void put(String white_listed_spam_host_domains) {
        String url = ("https://discourse.example.com//admin/site_settings/white_listed_spam_host_domains");
        Map<String, Object> content = new HashMap<>();
        content.put("white_listed_spam_host_domains", (white_listed_spam_host_domains));
        requestPut(url, null, content, Void.class);
    }
}
