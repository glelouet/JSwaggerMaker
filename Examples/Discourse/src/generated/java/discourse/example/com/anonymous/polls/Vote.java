package discourse.example.com.anonymous.polls;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Vote
    extends DelegateTransfer<Anonymous>
{

    public Vote(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * vote on a poll
     * </p>
     * 
     * @param post_id
     * @param poll_name
     * @param options__
     */
    public Requested<Object> put(long post_id, String poll_name, String options__) {
        String url = ("https://discourse.example.com//polls/vote");
        Map<String, Object> content = new HashMap<>();
        content.put("post_id", (post_id));
        content.put("poll_name", (poll_name));
        content.put("options__", (options__));
        return requestPut(url, null, content, Object.class);
    }
}
