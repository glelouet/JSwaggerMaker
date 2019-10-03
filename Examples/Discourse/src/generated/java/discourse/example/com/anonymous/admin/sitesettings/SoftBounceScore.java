package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SoftBounceScore
    extends DelegateTransfer<Anonymous>
{

    public SoftBounceScore(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * soft bounce score
     * </p>
     * 
     * @param soft_bounce_score
     *     Bounce score added to the user when a temporary bounce happens.
     */
    public void put(long soft_bounce_score) {
        String url = ("https://discourse.example.com//admin/site_settings/soft_bounce_score");
        Map<String, Object> content = new HashMap<>();
        content.put("soft_bounce_score", (soft_bounce_score));
        requestPut(url, null, content, Void.class);
    }
}
