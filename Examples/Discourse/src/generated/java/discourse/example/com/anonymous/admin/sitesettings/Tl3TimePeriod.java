package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl3TimePeriod
    extends DelegateTransfer<Anonymous>
{

    public Tl3TimePeriod(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl2 time period
     * </p>
     * 
     * @param tl3_time_period
     *     "Trust Level 3 requirements time period (in days)"
     *     
     */
    public void put(long tl3_time_period) {
        String url = ("https://discourse.example.com//admin/site_settings/tl3_time_period");
        Map<String, Object> content = new HashMap<>();
        content.put("tl3_time_period", (tl3_time_period));
        requestPut(url, null, content, Void.class);
    }
}
