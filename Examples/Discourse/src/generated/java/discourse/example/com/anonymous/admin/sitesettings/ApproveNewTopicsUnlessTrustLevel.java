package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ApproveNewTopicsUnlessTrustLevel
    extends DelegateTransfer<Anonymous>
{

    public ApproveNewTopicsUnlessTrustLevel(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * approve new topics unless trust level
     * </p>
     * 
     * @param approve_new_topics_unless_trust_level
     */
    public void put(long approve_new_topics_unless_trust_level) {
        String url = ("https://discourse.example.com//admin/site_settings/approve_new_topics_unless_trust_level");
        Map<String, Object> content = new HashMap<>();
        content.put("approve_new_topics_unless_trust_level", (approve_new_topics_unless_trust_level));
        requestPut(url, null, content, Void.class);
    }
}
