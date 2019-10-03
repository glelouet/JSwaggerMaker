package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class FlagsRequiredToHidePost
    extends DelegateTransfer<Anonymous>
{

    public FlagsRequiredToHidePost(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * flags required to hide post
     * </p>
     * 
     * @param flags_required_to_hide_post
     *     "Number of flags that cause a post to be automatically hidden and message sent to the user (0 for never)"
     *     
     */
    public void put(long flags_required_to_hide_post) {
        String url = ("https://discourse.example.com//admin/site_settings/flags_required_to_hide_post");
        Map<String, Object> content = new HashMap<>();
        content.put("flags_required_to_hide_post", (flags_required_to_hide_post));
        requestPut(url, null, content, Void.class);
    }
}
