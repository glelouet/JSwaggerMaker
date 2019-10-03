package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SuppressReplyDirectlyBelow
    extends DelegateTransfer<Anonymous>
{

    public SuppressReplyDirectlyBelow(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * suppress reply directly below
     * </p>
     * 
     * @param suppress_reply_directly_below
     */
    public void put(boolean suppress_reply_directly_below) {
        String url = ("https://discourse.example.com//admin/site_settings/suppress_reply_directly_below");
        Map<String, Object> content = new HashMap<>();
        content.put("suppress_reply_directly_below", (suppress_reply_directly_below));
        requestPut(url, null, content, Void.class);
    }
}
