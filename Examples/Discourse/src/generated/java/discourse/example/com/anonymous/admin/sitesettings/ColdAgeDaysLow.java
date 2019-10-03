package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ColdAgeDaysLow
    extends DelegateTransfer<Anonymous>
{

    public ColdAgeDaysLow(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * cold age days low
     * </p>
     * 
     * @param cold_age_days_low
     *     "After this many days of conversation, the last activity date is slightly dimmed."
     *     
     */
    public void put(long cold_age_days_low) {
        String url = ("https://discourse.example.com//admin/site_settings/cold_age_days_low");
        Map<String, Object> content = new HashMap<>();
        content.put("cold_age_days_low", (cold_age_days_low));
        requestPut(url, null, content, Void.class);
    }
}
