package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl1RequiresTimeSpentMins
    extends DelegateTransfer<Anonymous>
{

    public Tl1RequiresTimeSpentMins(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl1 requires time spent mins
     * </p>
     * 
     * @param tl1_requires_time_spent_mins
     *     "How many minutes a new user must read posts before promotion to trust level 1."
     *     
     */
    public void put(long tl1_requires_time_spent_mins) {
        String url = ("https://discourse.example.com//admin/site_settings/tl1_requires_time_spent_mins");
        Map<String, Object> content = new HashMap<>();
        content.put("tl1_requires_time_spent_mins", (tl1_requires_time_spent_mins));
        requestPut(url, null, content, Void.class);
    }
}
