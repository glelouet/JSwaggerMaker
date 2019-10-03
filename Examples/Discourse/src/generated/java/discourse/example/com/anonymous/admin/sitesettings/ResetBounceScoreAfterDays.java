package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ResetBounceScoreAfterDays
    extends DelegateTransfer<Anonymous>
{

    public ResetBounceScoreAfterDays(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * reset bounce score after days
     * </p>
     * 
     * @param reset_bounce_score_after_days
     *     Automatically reset bounce score after X days.
     */
    public void put(long reset_bounce_score_after_days) {
        String url = ("https://discourse.example.com//admin/site_settings/reset_bounce_score_after_days");
        Map<String, Object> content = new HashMap<>();
        content.put("reset_bounce_score_after_days", (reset_bounce_score_after_days));
        requestPut(url, null, content, Void.class);
    }
}
