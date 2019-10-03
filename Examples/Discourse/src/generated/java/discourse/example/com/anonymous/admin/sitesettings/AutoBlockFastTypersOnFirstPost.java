package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AutoBlockFastTypersOnFirstPost
    extends DelegateTransfer<Anonymous>
{

    public AutoBlockFastTypersOnFirstPost(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * auto block fast typers on first post
     * </p>
     * 
     * @param auto_block_fast_typers_on_first_post
     *     "Automatically block users that do not meet min_first_post_typing_time"
     *     
     */
    public void put(boolean auto_block_fast_typers_on_first_post) {
        String url = ("https://discourse.example.com//admin/site_settings/auto_block_fast_typers_on_first_post");
        Map<String, Object> content = new HashMap<>();
        content.put("auto_block_fast_typers_on_first_post", (auto_block_fast_typers_on_first_post));
        requestPut(url, null, content, Void.class);
    }
}
