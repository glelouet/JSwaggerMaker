package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class RelativeDateDuration
    extends DelegateTransfer<Anonymous>
{

    public RelativeDateDuration(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update relative date duration
     * </p>
     * 
     * @param relative_date_duration
     */
    public void put(long relative_date_duration) {
        String url = ("https://discourse.example.com//admin/site_settings/relative_date_duration");
        Map<String, Object> content = new HashMap<>();
        content.put("relative_date_duration", (relative_date_duration));
        requestPut(url, null, content, Void.class);
    }
}
