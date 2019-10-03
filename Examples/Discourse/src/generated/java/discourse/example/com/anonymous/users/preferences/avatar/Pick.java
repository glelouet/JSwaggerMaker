package discourse.example.com.anonymous.users.preferences.avatar;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Pick
    extends DelegateTransfer<Anonymous>
{

    public Pick(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update avatar
     * </p>
     * 
     * @param upload_id
     * @param type
     */
    public Requested<Object> putByUsername(long upload_id, String type) {
        String url = ("https://discourse.example.com//users/{username}/preferences/avatar/pick");
        Map<String, Object> content = new HashMap<>();
        content.put("upload_id", (upload_id));
        content.put("type", (type));
        return requestPut(url, null, content, Object.class);
    }
}
