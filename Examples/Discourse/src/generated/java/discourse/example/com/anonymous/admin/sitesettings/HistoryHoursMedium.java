package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class HistoryHoursMedium
    extends DelegateTransfer<Anonymous>
{

    public HistoryHoursMedium(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * history hours medium
     * </p>
     * 
     * @param history_hours_medium
     *     "A post edited within this many hours has the edit indicator moderately highlighted."
     *     
     */
    public void put(long history_hours_medium) {
        String url = ("https://discourse.example.com//admin/site_settings/history_hours_medium");
        Map<String, Object> content = new HashMap<>();
        content.put("history_hours_medium", (history_hours_medium));
        requestPut(url, null, content, Void.class);
    }
}
