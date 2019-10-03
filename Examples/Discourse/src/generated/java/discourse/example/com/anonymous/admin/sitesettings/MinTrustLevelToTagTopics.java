package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinTrustLevelToTagTopics
    extends DelegateTransfer<Anonymous>
{

    public MinTrustLevelToTagTopics(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "min trust level to tag topics"
     * </p>
     * 
     * @param min_trust_level_to_tag_topics
     *     "Minimum trust level required to tag topics"
     *     
     */
    public void put(long min_trust_level_to_tag_topics) {
        String url = ("https://discourse.example.com//admin/site_settings/min_trust_level_to_tag_topics");
        Map<String, Object> content = new HashMap<>();
        content.put("min_trust_level_to_tag_topics", (min_trust_level_to_tag_topics));
        requestPut(url, null, content, Void.class);
    }
}
