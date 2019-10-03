package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class NumFlaggersToCloseTopic
    extends DelegateTransfer<Anonymous>
{

    public NumFlaggersToCloseTopic(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * num flaggers to close topic
     * </p>
     * 
     * @param num_flaggers_to_close_topic
     *     "Minimum number of unique flaggers that is required to automatically pause a topic for intervention"
     *     
     */
    public void put(long num_flaggers_to_close_topic) {
        String url = ("https://discourse.example.com//admin/site_settings/num_flaggers_to_close_topic");
        Map<String, Object> content = new HashMap<>();
        content.put("num_flaggers_to_close_topic", (num_flaggers_to_close_topic));
        requestPut(url, null, content, Void.class);
    }
}
