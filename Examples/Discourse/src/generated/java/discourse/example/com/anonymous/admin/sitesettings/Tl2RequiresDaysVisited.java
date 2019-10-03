package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl2RequiresDaysVisited
    extends DelegateTransfer<Anonymous>
{

    public Tl2RequiresDaysVisited(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl2 requires days visited
     * </p>
     * 
     * @param tl2_requires_days_visited
     *     "How many days a user must visit the site before promotion to trust level 2."
     *     
     */
    public void put(long tl2_requires_days_visited) {
        String url = ("https://discourse.example.com//admin/site_settings/tl2_requires_days_visited");
        Map<String, Object> content = new HashMap<>();
        content.put("tl2_requires_days_visited", (tl2_requires_days_visited));
        requestPut(url, null, content, Void.class);
    }
}
