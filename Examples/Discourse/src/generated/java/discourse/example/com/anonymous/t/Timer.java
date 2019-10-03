package discourse.example.com.anonymous.t;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Timer
    extends DelegateTransfer<Anonymous>
{

    public Timer(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Create a timed topic
     * </p>
     * 
     * @param time
     * @param status_type
     * @param based_on_last_post
     * @param category_id
     */
    public Requested<Object> postById(String time,
        String status_type,
        boolean based_on_last_post,
        long category_id) {
        String url = ("https://discourse.example.com//t/{id}/timer");
        Map<String, Object> content = new HashMap<>();
        content.put("time", time);
        content.put("status_type", status_type);
        content.put("based_on_last_post", based_on_last_post);
        content.put("category_id", category_id);
        return requestPost(url, null, content, Object.class);
    }
}
