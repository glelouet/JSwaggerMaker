package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Tl3RequiresTopicsRepliedTo
    extends DelegateTransfer<Anonymous>
{

    public Tl3RequiresTopicsRepliedTo(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tl3 requires topics replied to
     * </p>
     * 
     * @param tl3_requires_topics_replied_to
     *     "Minimum number of topics a user needs to have replied to in the last (tl3 time period) days to qualify for promotion to trust level 3. (0 or higher)"
     *     
     */
    public void put(long tl3_requires_topics_replied_to) {
        String url = ("https://discourse.example.com//admin/site_settings/tl3_requires_topics_replied_to");
        Map<String, Object> content = new HashMap<>();
        content.put("tl3_requires_topics_replied_to", (tl3_requires_topics_replied_to));
        requestPut(url, null, content, Void.class);
    }
}
