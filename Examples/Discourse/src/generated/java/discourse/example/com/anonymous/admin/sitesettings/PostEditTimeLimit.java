package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PostEditTimeLimit
    extends DelegateTransfer<Anonymous>
{

    public PostEditTimeLimit(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * post edit time limit
     * </p>
     * 
     * @param post_edit_time_limit
     */
    public void put(long post_edit_time_limit) {
        String url = ("https://discourse.example.com//admin/site_settings/post_edit_time_limit");
        Map<String, Object> content = new HashMap<>();
        content.put("post_edit_time_limit", (post_edit_time_limit));
        requestPut(url, null, content, Void.class);
    }
}
