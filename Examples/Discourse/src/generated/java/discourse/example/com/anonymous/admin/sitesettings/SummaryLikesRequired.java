package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SummaryLikesRequired
    extends DelegateTransfer<Anonymous>
{

    public SummaryLikesRequired(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * summary likes required
     * </p>
     * 
     * @param summary_likes_required
     *     "Minimum likes in a topic before 'Summarize This Topic' is enabled"
     *     
     */
    public void put(long summary_likes_required) {
        String url = ("https://discourse.example.com//admin/site_settings/summary_likes_required");
        Map<String, Object> content = new HashMap<>();
        content.put("summary_likes_required", (summary_likes_required));
        requestPut(url, null, content, Void.class);
    }
}
