package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AddRelNofollowToUserContent
    extends DelegateTransfer<Anonymous>
{

    public AddRelNofollowToUserContent(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * add rel nofollow to user content
     * </p>
     * 
     * @param add_rel_nofollow_to_user_content
     *     'Add rel nofollow to all submitted user content, except for internal links (including parent domains). If you change this, you must rebake all posts with: "rake posts:rebake"'
     *     
     */
    public void put(boolean add_rel_nofollow_to_user_content) {
        String url = ("https://discourse.example.com//admin/site_settings/add_rel_nofollow_to_user_content");
        Map<String, Object> content = new HashMap<>();
        content.put("add_rel_nofollow_to_user_content", (add_rel_nofollow_to_user_content));
        requestPut(url, null, content, Void.class);
    }
}
