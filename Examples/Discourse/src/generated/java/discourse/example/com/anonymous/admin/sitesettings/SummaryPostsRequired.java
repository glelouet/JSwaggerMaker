package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SummaryPostsRequired
    extends DelegateTransfer<Anonymous>
{

    public SummaryPostsRequired(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * summary posts required
     * </p>
     * 
     * @param summary_posts_required
     *     "Minimum posts in a topic before 'Summarize This Topic' is enabled"
     *     
     */
    public void put(long summary_posts_required) {
        String url = ("https://discourse.example.com//admin/site_settings/summary_posts_required");
        Map<String, Object> content = new HashMap<>();
        content.put("summary_posts_required", (summary_posts_required));
        requestPut(url, null, content, Void.class);
    }
}
