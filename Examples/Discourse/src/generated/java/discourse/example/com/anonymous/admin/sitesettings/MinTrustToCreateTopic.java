package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinTrustToCreateTopic
    extends DelegateTransfer<Anonymous>
{

    public MinTrustToCreateTopic(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * min trust to create topic
     * </p>
     * 
     * @param min_trust_to_create_topic
     *     "The minimum trust level required to create a new topic"
     *     
     */
    public void put(long min_trust_to_create_topic) {
        String url = ("https://discourse.example.com//admin/site_settings/min_trust_to_create_topic");
        Map<String, Object> content = new HashMap<>();
        content.put("min_trust_to_create_topic", (min_trust_to_create_topic));
        requestPut(url, null, content, Void.class);
    }
}
