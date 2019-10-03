package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SummaryMaxResults
    extends DelegateTransfer<Anonymous>
{

    public SummaryMaxResults(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * summary max results
     * </p>
     * 
     * @param summary_max_results
     *     "Maximum posts returned by 'Summary This Topic'"
     *     
     */
    public void put(long summary_max_results) {
        String url = ("https://discourse.example.com//admin/site_settings/summary_max_results");
        Map<String, Object> content = new HashMap<>();
        content.put("summary_max_results", (summary_max_results));
        requestPut(url, null, content, Void.class);
    }
}
