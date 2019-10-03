package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DigestOtherTopics
    extends DelegateTransfer<Anonymous>
{

    public DigestOtherTopics(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * digest other topics
     * </p>
     * 
     * @param digest_other_topics
     */
    public void put(long digest_other_topics) {
        String url = ("https://discourse.example.com//admin/site_settings/digest_other_topics");
        Map<String, Object> content = new HashMap<>();
        content.put("digest_other_topics", (digest_other_topics));
        requestPut(url, null, content, Void.class);
    }
}
