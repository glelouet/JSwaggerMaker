package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class NewuserMaxRepliesPerTopic
    extends DelegateTransfer<Anonymous>
{

    public NewuserMaxRepliesPerTopic(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * newuser max replies per topic
     * </p>
     * 
     * @param newuser_max_replies_per_topic
     */
    public void put(long newuser_max_replies_per_topic) {
        String url = ("https://discourse.example.com//admin/site_settings/newuser_max_replies_per_topic");
        Map<String, Object> content = new HashMap<>();
        content.put("newuser_max_replies_per_topic", (newuser_max_replies_per_topic));
        requestPut(url, null, content, Void.class);
    }
}
