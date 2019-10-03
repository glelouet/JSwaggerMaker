package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SuggestedTopicsMaxDaysOld
    extends DelegateTransfer<Anonymous>
{

    public SuggestedTopicsMaxDaysOld(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update suggested topics max days old
     * </p>
     * 
     * @param suggested_topics_max_days_old
     */
    public void put(long suggested_topics_max_days_old) {
        String url = ("https://discourse.example.com//admin/site_settings/suggested_topics_max_days_old");
        Map<String, Object> content = new HashMap<>();
        content.put("suggested_topics_max_days_old", (suggested_topics_max_days_old));
        requestPut(url, null, content, Void.class);
    }
}
