package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ColdAgeDaysHigh
    extends DelegateTransfer<Anonymous>
{

    public ColdAgeDaysHigh(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * cold age days high
     * </p>
     * 
     * @param cold_age_days_high
     *     "After this many days of conversation, the last activity date is strongly dimmed."
     *     
     */
    public void put(long cold_age_days_high) {
        String url = ("https://discourse.example.com//admin/site_settings/cold_age_days_high");
        Map<String, Object> content = new HashMap<>();
        content.put("cold_age_days_high", (cold_age_days_high));
        requestPut(url, null, content, Void.class);
    }
}
