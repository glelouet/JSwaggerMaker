package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinTrustToEditPost
    extends DelegateTransfer<Anonymous>
{

    public MinTrustToEditPost(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * min trust to edit post
     * </p>
     * 
     * @param min_trust_to_edit_post
     *     "The minimum trust level required to edit posts."
     *     
     */
    public void put(long min_trust_to_edit_post) {
        String url = ("https://discourse.example.com//admin/site_settings/min_trust_to_edit_post");
        Map<String, Object> content = new HashMap<>();
        content.put("min_trust_to_edit_post", (min_trust_to_edit_post));
        requestPut(url, null, content, Void.class);
    }
}
