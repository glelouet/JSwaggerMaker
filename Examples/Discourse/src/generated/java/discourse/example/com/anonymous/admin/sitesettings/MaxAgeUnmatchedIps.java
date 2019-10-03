package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxAgeUnmatchedIps
    extends DelegateTransfer<Anonymous>
{

    public MaxAgeUnmatchedIps(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max age unmatched ips
     * </p>
     * 
     * @param max_age_unmatched_ips
     *     "Delete unmatched screened IP entries after (N) days."
     *     
     */
    public void put(long max_age_unmatched_ips) {
        String url = ("https://discourse.example.com//admin/site_settings/max_age_unmatched_ips");
        Map<String, Object> content = new HashMap<>();
        content.put("max_age_unmatched_ips", (max_age_unmatched_ips));
        requestPut(url, null, content, Void.class);
    }
}
