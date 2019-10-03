package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SuppressReplyDirectlyAbove
    extends DelegateTransfer<Anonymous>
{

    public SuppressReplyDirectlyAbove(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * suppress reply directly above
     * </p>
     * 
     * @param suppress_reply_directly_above
     */
    public void put(boolean suppress_reply_directly_above) {
        String url = ("https://discourse.example.com//admin/site_settings/suppress_reply_directly_above");
        Map<String, Object> content = new HashMap<>();
        content.put("suppress_reply_directly_above", (suppress_reply_directly_above));
        requestPut(url, null, content, Void.class);
    }
}
