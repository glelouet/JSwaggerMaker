package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxOneboxesPerPost
    extends DelegateTransfer<Anonymous>
{

    public MaxOneboxesPerPost(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max oneboxes per post
     * </p>
     * 
     * @param max_oneboxes_per_post
     *     "Enable embedding of swf and flv (Adobe Flash) links in oneboxes. WARNING: may introduce security risks."
     *     
     */
    public void put(long max_oneboxes_per_post) {
        String url = ("https://discourse.example.com//admin/site_settings/max_oneboxes_per_post");
        Map<String, Object> content = new HashMap<>();
        content.put("max_oneboxes_per_post", (max_oneboxes_per_post));
        requestPut(url, null, content, Void.class);
    }
}
