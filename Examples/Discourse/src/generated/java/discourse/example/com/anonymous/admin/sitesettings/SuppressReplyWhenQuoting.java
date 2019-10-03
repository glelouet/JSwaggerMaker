package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SuppressReplyWhenQuoting
    extends DelegateTransfer<Anonymous>
{

    public SuppressReplyWhenQuoting(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * suppress reply when quoting
     * </p>
     * 
     * @param suppress_reply_when_quoting
     */
    public void put(boolean suppress_reply_when_quoting) {
        String url = ("https://discourse.example.com//admin/site_settings/suppress_reply_when_quoting");
        Map<String, Object> content = new HashMap<>();
        content.put("suppress_reply_when_quoting", (suppress_reply_when_quoting));
        requestPut(url, null, content, Void.class);
    }
}
