package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl2RequiresTimeSpentMins
    extends DelegateTransfer<Anonymous>
{

    public Tl2RequiresTimeSpentMins(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl2 requires time spent mins
     * </p>
     * 
     * @param tl2_requires_time_spent_mins
     *     "How many minutes a user must read posts before promotion to trust level 2."
     *     
     */
    public void put(long tl2_requires_time_spent_mins) {
        String url = ("https://discourse.example.com//admin/site_settings/tl2_requires_time_spent_mins");
        Map<String, Object> content = new HashMap<>();
        content.put("tl2_requires_time_spent_mins", (tl2_requires_time_spent_mins));
        requestPut(url, null, content, Void.class);
    }
}
