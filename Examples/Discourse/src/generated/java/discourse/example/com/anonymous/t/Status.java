package discourse.example.com.anonymous.t;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Status
    extends DelegateTransfer<Anonymous>
{

    public Status(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update a topic's status
     * </p>
     * 
     * @param id
     * @param status
     *     A lowercase string. Valid values shown above.
     *     
     * @param enabled
     *     This would be true or false
     *     
     * @param until
     *     Only required for pinned and pinned-globally.
     *     
     */
    public Requested<Object> putById(long id,
        discourse.example.com.structures.status status,
        boolean enabled,
        String until) {
        String url = ("https://discourse.example.com//t/{id}/status".replace("{id}", ""+id));
        Map<String, Object> content = new HashMap<>();
        content.put("status", (status));
        content.put("enabled", (enabled));
        content.put("until", (until));
        return requestPut(url, null, content, Object.class);
    }
}
