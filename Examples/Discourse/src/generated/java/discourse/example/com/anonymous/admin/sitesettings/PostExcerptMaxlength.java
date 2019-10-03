package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PostExcerptMaxlength
    extends DelegateTransfer<Anonymous>
{

    public PostExcerptMaxlength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * post excerpt maxlength
     * </p>
     * 
     * @param post_excerpt_maxlength
     */
    public void put(long post_excerpt_maxlength) {
        String url = ("https://discourse.example.com//admin/site_settings/post_excerpt_maxlength");
        Map<String, Object> content = new HashMap<>();
        content.put("post_excerpt_maxlength", (post_excerpt_maxlength));
        requestPut(url, null, content, Void.class);
    }
}
