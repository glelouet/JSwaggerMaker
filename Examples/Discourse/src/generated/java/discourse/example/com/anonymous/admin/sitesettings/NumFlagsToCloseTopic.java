package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class NumFlagsToCloseTopic
    extends DelegateTransfer<Anonymous>
{

    public NumFlagsToCloseTopic(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * num flags to close topic
     * </p>
     * 
     * @param num_flags_to_close_topic
     *     "Minimum number of active flags that is required to automatically pause a topic for intervention"
     *     
     */
    public void put(long num_flags_to_close_topic) {
        String url = ("https://discourse.example.com//admin/site_settings/num_flags_to_close_topic");
        Map<String, Object> content = new HashMap<>();
        content.put("num_flags_to_close_topic", (num_flags_to_close_topic));
        requestPut(url, null, content, Void.class);
    }
}
