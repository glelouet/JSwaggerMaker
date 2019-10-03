package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class HistoryHoursHigh
    extends DelegateTransfer<Anonymous>
{

    public HistoryHoursHigh(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * history hours high
     * </p>
     * 
     * @param history_hours_high
     *     "A post edited within this many hours has the edit indicator strongly highlighted."
     *     
     */
    public void put(long history_hours_high) {
        String url = ("https://discourse.example.com//admin/site_settings/history_hours_high");
        Map<String, Object> content = new HashMap<>();
        content.put("history_hours_high", (history_hours_high));
        requestPut(url, null, content, Void.class);
    }
}
