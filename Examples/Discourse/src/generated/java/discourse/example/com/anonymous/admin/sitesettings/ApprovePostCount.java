package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ApprovePostCount
    extends DelegateTransfer<Anonymous>
{

    public ApprovePostCount(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * approve post count
     * </p>
     * 
     * @param approve_post_count
     */
    public void put(long approve_post_count) {
        String url = ("https://discourse.example.com//admin/site_settings/approve_post_count");
        Map<String, Object> content = new HashMap<>();
        content.put("approve_post_count", (approve_post_count));
        requestPut(url, null, content, Void.class);
    }
}
