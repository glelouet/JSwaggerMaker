package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class BounceScoreThreshold
    extends DelegateTransfer<Anonymous>
{

    public BounceScoreThreshold(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * bounce score threshold
     * </p>
     * 
     * @param bounce_score_threshold
     *     Max bounce score before we will stop emailing a user.
     */
    public void put(long bounce_score_threshold) {
        String url = ("https://discourse.example.com//admin/site_settings/bounce_score_threshold");
        Map<String, Object> content = new HashMap<>();
        content.put("bounce_score_threshold", (bounce_score_threshold));
        requestPut(url, null, content, Void.class);
    }
}
