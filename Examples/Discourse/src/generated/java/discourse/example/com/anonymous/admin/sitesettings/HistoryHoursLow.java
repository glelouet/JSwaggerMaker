package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class HistoryHoursLow
    extends DelegateTransfer<Anonymous>
{

    public HistoryHoursLow(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * history hours low
     * </p>
     * 
     * @param history_hours_low
     *     "A post edited within this many hours has the edit indicator slightly highlighted"
     *     
     */
    public void put(long history_hours_low) {
        String url = ("https://discourse.example.com//admin/site_settings/history_hours_low");
        Map<String, Object> content = new HashMap<>();
        content.put("history_hours_low", (history_hours_low));
        requestPut(url, null, content, Void.class);
    }
}
