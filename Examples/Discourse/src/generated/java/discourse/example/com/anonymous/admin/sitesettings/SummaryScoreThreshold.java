package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SummaryScoreThreshold
    extends DelegateTransfer<Anonymous>
{

    public SummaryScoreThreshold(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * summary score threshold
     * </p>
     * 
     * @param summary_score_threshold
     *     "The minimum score required for a post to be included in 'Summarize This Topic'"
     *     
     */
    public void put(long summary_score_threshold) {
        String url = ("https://discourse.example.com//admin/site_settings/summary_score_threshold");
        Map<String, Object> content = new HashMap<>();
        content.put("summary_score_threshold", (summary_score_threshold));
        requestPut(url, null, content, Void.class);
    }
}
