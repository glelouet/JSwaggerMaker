package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EmailPostsContext
    extends DelegateTransfer<Anonymous>
{

    public EmailPostsContext(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * email posts context
     * </p>
     * 
     * @param email_posts_context
     */
    public void put(long email_posts_context) {
        String url = ("https://discourse.example.com//admin/site_settings/email_posts_context");
        Map<String, Object> content = new HashMap<>();
        content.put("email_posts_context", (email_posts_context));
        requestPut(url, null, content, Void.class);
    }
}
