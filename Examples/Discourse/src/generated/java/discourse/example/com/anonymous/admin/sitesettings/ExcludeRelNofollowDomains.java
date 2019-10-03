package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ExcludeRelNofollowDomains
    extends DelegateTransfer<Anonymous>
{

    public ExcludeRelNofollowDomains(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the exclude rel nofollow domains
     * </p>
     * 
     * @param exclude_rel_nofollow_domains
     *     pipe delimited
     *     
     */
    public void put(String exclude_rel_nofollow_domains) {
        String url = ("https://discourse.example.com//admin/site_settings/exclude_rel_nofollow_domains");
        Map<String, Object> content = new HashMap<>();
        content.put("exclude_rel_nofollow_domains", (exclude_rel_nofollow_domains));
        requestPut(url, null, content, Void.class);
    }
}
