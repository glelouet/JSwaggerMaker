package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl2RequiresTopicReplyCount
    extends DelegateTransfer<Anonymous>
{

    public Tl2RequiresTopicReplyCount(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl2 requires topic reply count
     * </p>
     * 
     * @param tl2_requires_topic_reply_count
     *     "How many topics user must reply to before promotion to trust level 2."
     *     
     */
    public void put(long tl2_requires_topic_reply_count) {
        String url = ("https://discourse.example.com//admin/site_settings/tl2_requires_topic_reply_count");
        Map<String, Object> content = new HashMap<>();
        content.put("tl2_requires_topic_reply_count", (tl2_requires_topic_reply_count));
        requestPut(url, null, content, Void.class);
    }
}
