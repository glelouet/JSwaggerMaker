package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DigestTopics
    extends DelegateTransfer<Anonymous>
{

    public DigestTopics(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * digest topics
     * </p>
     * 
     * @param digest_topics
     */
    public void put(long digest_topics) {
        String url = ("https://discourse.example.com//admin/site_settings/digest_topics");
        Map<String, Object> content = new HashMap<>();
        content.put("digest_topics", (digest_topics));
        requestPut(url, null, content, Void.class);
    }
}
