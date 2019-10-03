package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ColdAgeDaysMedium
    extends DelegateTransfer<Anonymous>
{

    public ColdAgeDaysMedium(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * cold age days medium
     * </p>
     * 
     * @param cold_age_days_medium
     *     "After this many days of conversation, the last activity date is moderately dimmed."
     *     
     */
    public void put(long cold_age_days_medium) {
        String url = ("https://discourse.example.com//admin/site_settings/cold_age_days_medium");
        Map<String, Object> content = new HashMap<>();
        content.put("cold_age_days_medium", (cold_age_days_medium));
        requestPut(url, null, content, Void.class);
    }
}
