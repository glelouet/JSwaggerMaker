package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinPrivateMessagePostLength
    extends DelegateTransfer<Anonymous>
{

    public MinPrivateMessagePostLength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * min private message post length
     * </p>
     * 
     * @param min_private_message_post_length
     */
    public void put(long min_private_message_post_length) {
        String url = ("https://discourse.example.com//admin/site_settings/min_private_message_post_length");
        Map<String, Object> content = new HashMap<>();
        content.put("min_private_message_post_length", (min_private_message_post_length));
        requestPut(url, null, content, Void.class);
    }
}
