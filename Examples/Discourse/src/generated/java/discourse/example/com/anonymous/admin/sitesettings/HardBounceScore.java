package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class HardBounceScore
    extends DelegateTransfer<Anonymous>
{

    public HardBounceScore(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * hard bounce score
     * </p>
     * 
     * @param hard_bounce_score
     *     Bounce score added to the user when a permanent bounce happens.
     */
    public void put(long hard_bounce_score) {
        String url = ("https://discourse.example.com//admin/site_settings/hard_bounce_score");
        Map<String, Object> content = new HashMap<>();
        content.put("hard_bounce_score", (hard_bounce_score));
        requestPut(url, null, content, Void.class);
    }
}
