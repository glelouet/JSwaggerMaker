package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxReplyHistory
    extends DelegateTransfer<Anonymous>
{

    public MaxReplyHistory(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max reply history
     * </p>
     * 
     * @param max_reply_history
     */
    public void put(long max_reply_history) {
        String url = ("https://discourse.example.com//admin/site_settings/max_reply_history");
        Map<String, Object> content = new HashMap<>();
        content.put("max_reply_history", (max_reply_history));
        requestPut(url, null, content, Void.class);
    }
}
