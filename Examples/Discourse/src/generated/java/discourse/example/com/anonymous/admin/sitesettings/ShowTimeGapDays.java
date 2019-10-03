package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ShowTimeGapDays
    extends DelegateTransfer<Anonymous>
{

    public ShowTimeGapDays(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * show time gap days
     * </p>
     * 
     * @param show_time_gap_days
     */
    public void put(long show_time_gap_days) {
        String url = ("https://discourse.example.com//admin/site_settings/show_time_gap_days");
        Map<String, Object> content = new HashMap<>();
        content.put("show_time_gap_days", (show_time_gap_days));
        requestPut(url, null, content, Void.class);
    }
}
