package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AutoBlockFirstPostRegex
    extends DelegateTransfer<Anonymous>
{

    public AutoBlockFirstPostRegex(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * auto block first post regex
     * </p>
     * 
     * @param auto_block_first_post_regex
     *     "Case insensitive regex that if passed will cause first post by user to be blocked and sent to approval queue. Example: raging|a[bc]a , will cause all posts containing raging or aba or aca to be blocked on first. Only applies to first post."
     *     
     */
    public void put(String auto_block_first_post_regex) {
        String url = ("https://discourse.example.com//admin/site_settings/auto_block_first_post_regex");
        Map<String, Object> content = new HashMap<>();
        content.put("auto_block_first_post_regex", (auto_block_first_post_regex));
        requestPut(url, null, content, Void.class);
    }
}
