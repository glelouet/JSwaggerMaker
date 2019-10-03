package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class FlushTimingsSecs
    extends DelegateTransfer<Anonymous>
{

    public FlushTimingsSecs(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * flush timings secs
     * </p>
     * 
     * @param flush_timings_secs
     *     "How frequently we flush timing data to the server, in seconds."
     *     
     */
    public void put(long flush_timings_secs) {
        String url = ("https://discourse.example.com//admin/site_settings/flush_timings_secs");
        Map<String, Object> content = new HashMap<>();
        content.put("flush_timings_secs", (flush_timings_secs));
        requestPut(url, null, content, Void.class);
    }
}
