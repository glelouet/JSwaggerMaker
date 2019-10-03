package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PreviousVisitTimeoutHours
    extends DelegateTransfer<Anonymous>
{

    public PreviousVisitTimeoutHours(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * previous visit timeout hours
     * </p>
     * 
     * @param previous_visit_timeout_hours
     *     "How long a visit lasts before we consider it the 'previous' visit, in hours"
     *     
     */
    public void put(long previous_visit_timeout_hours) {
        String url = ("https://discourse.example.com//admin/site_settings/previous_visit_timeout_hours");
        Map<String, Object> content = new HashMap<>();
        content.put("previous_visit_timeout_hours", (previous_visit_timeout_hours));
        requestPut(url, null, content, Void.class);
    }
}
