package discourse.example.com.anonymous.t;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class ChangeTimestamp
    extends DelegateTransfer<Anonymous>
{

    public ChangeTimestamp(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update a topics timestamp
     * </p>
     * 
     * @param timestamp
     */
    public Requested<Object> putById(long timestamp) {
        String url = ("https://discourse.example.com//t/{id}/change-timestamp");
        Map<String, Object> content = new HashMap<>();
        content.put("timestamp", (timestamp));
        return requestPut(url, null, content, Object.class);
    }
}
