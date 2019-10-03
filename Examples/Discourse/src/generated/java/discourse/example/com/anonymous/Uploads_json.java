package discourse.example.com.anonymous;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;
import fr.lelouet.jswaggermaker.client.common.interfaces.Requested;

public class Uploads_json
    extends DelegateTransfer<Anonymous>
{

    public Uploads_json(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Upload a file like an image or an avatar
     * </p>
     * 
     * @param type
     *     a lowercase string with numbers but no spaces. Set to 'avatar' if uploading an avatar
     *     
     * @param user_id
     *     required if uploading an avatar
     * @param synchronous
     *     use this flag to return an id and url
     */
    public Requested<Object> post(discourse.example.com.structures.type type, long user_id, boolean synchronous) {
        String url = ("https://discourse.example.com//uploads.json");
        Map<String, Object> content = new HashMap<>();
        content.put("type", type);
        content.put("user_id", user_id);
        content.put("synchronous", synchronous);
        return requestPost(url, null, content, Object.class);
    }
}
