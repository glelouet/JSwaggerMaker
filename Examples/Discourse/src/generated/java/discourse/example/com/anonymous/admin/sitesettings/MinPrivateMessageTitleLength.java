package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinPrivateMessageTitleLength
    extends DelegateTransfer<Anonymous>
{

    public MinPrivateMessageTitleLength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * min private message title length
     * </p>
     * 
     * @param min_private_message_title_length
     */
    public void put(long min_private_message_title_length) {
        String url = ("https://discourse.example.com//admin/site_settings/min_private_message_title_length");
        Map<String, Object> content = new HashMap<>();
        content.put("min_private_message_title_length", (min_private_message_title_length));
        requestPut(url, null, content, Void.class);
    }
}
