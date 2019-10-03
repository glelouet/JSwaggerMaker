package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SummaryPercentFilter
    extends DelegateTransfer<Anonymous>
{

    public SummaryPercentFilter(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * summary percent filter
     * </p>
     * 
     * @param summary_percent_filter
     *     "When a user clicks 'Summarize This Topic', show the top % of posts"
     *     
     */
    public void put(long summary_percent_filter) {
        String url = ("https://discourse.example.com//admin/site_settings/summary_percent_filter");
        Map<String, Object> content = new HashMap<>();
        content.put("summary_percent_filter", (summary_percent_filter));
        requestPut(url, null, content, Void.class);
    }
}
