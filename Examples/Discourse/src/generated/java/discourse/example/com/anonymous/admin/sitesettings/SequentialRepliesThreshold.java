package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SequentialRepliesThreshold
    extends DelegateTransfer<Anonymous>
{

    public SequentialRepliesThreshold(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * sequential replies threshold
     * </p>
     * 
     * @param sequential_replies_threshold
     *     "Number of posts a user has to make in a row in a topic before being reminded about too many sequential replies."
     *     
     */
    public void put(long sequential_replies_threshold) {
        String url = ("https://discourse.example.com//admin/site_settings/sequential_replies_threshold");
        Map<String, Object> content = new HashMap<>();
        content.put("sequential_replies_threshold", (sequential_replies_threshold));
        requestPut(url, null, content, Void.class);
    }
}
