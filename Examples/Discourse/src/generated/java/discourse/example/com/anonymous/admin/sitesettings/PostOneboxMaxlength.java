package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PostOneboxMaxlength
    extends DelegateTransfer<Anonymous>
{

    public PostOneboxMaxlength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * post onebox maxlength
     * </p>
     * 
     * @param post_onebox_maxlength
     *     "Maximum length of a oneboxed Discourse post in characters."
     *     
     */
    public void put(long post_onebox_maxlength) {
        String url = ("https://discourse.example.com//admin/site_settings/post_onebox_maxlength");
        Map<String, Object> content = new HashMap<>();
        content.put("post_onebox_maxlength", (post_onebox_maxlength));
        requestPut(url, null, content, Void.class);
    }
}
