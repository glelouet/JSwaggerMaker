package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class BounceScoreThresholdDeactivate
    extends DelegateTransfer<Anonymous>
{

    public BounceScoreThresholdDeactivate(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * bounce score threshold deactive
     * </p>
     * 
     * @param bounce_score_threshold_deactivate
     *     Max bounce score before we will deactivate a user.
     */
    public void put(long bounce_score_threshold_deactivate) {
        String url = ("https://discourse.example.com//admin/site_settings/bounce_score_threshold_deactivate");
        Map<String, Object> content = new HashMap<>();
        content.put("bounce_score_threshold_deactivate", (bounce_score_threshold_deactivate));
        requestPut(url, null, content, Void.class);
    }
}
