package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl3RequiresDaysVisited
    extends DelegateTransfer<Anonymous>
{

    public Tl3RequiresDaysVisited(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl3 requires days visited
     * </p>
     * 
     * @param tl3_requires_days_visited
     *     "Minimum number of days that a user needs to have visited the site in the last (tl3 time period) days to qualify for promotion to trust level 3. Set higher than tl3 time period to disable promotions to tl3. (0 or higher)"
     *     
     */
    public void put(long tl3_requires_days_visited) {
        String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_days_visited");
        Map<String, Object> content = new HashMap<>();
        content.put("tl3_requires_days_visited", (tl3_requires_days_visited));
        requestPut(url, null, content, Void.class);
    }
}
