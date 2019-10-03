package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinTrustToSendMessages
    extends DelegateTransfer<Anonymous>
{

    public MinTrustToSendMessages(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * min trust to send messages
     * </p>
     * 
     * @param min_trust_to_send_messages
     *     "The minimum trust level required to create new private messages."
     *     
     */
    public void put(long min_trust_to_send_messages) {
        String url = ("https://discourse.example.com//admin/site_settings/min_trust_to_send_messages");
        Map<String, Object> content = new HashMap<>();
        content.put("min_trust_to_send_messages", (min_trust_to_send_messages));
        requestPut(url, null, content, Void.class);
    }
}
