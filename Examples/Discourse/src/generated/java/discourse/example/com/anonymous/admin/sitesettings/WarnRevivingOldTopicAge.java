package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class WarnRevivingOldTopicAge
    extends DelegateTransfer<Anonymous>
{

    public WarnRevivingOldTopicAge(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * warn reviving old topic age
     * </p>
     * 
     * @param warn_reviving_old_topic_age
     */
    public void put(long warn_reviving_old_topic_age) {
        String url = ("https://discourse.example.com//admin/site_settings/warn_reviving_old_topic_age");
        Map<String, Object> content = new HashMap<>();
        content.put("warn_reviving_old_topic_age", (warn_reviving_old_topic_age));
        requestPut(url, null, content, Void.class);
    }
}
