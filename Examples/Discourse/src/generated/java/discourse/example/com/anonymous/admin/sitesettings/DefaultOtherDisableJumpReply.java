package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultOtherDisableJumpReply
    extends DelegateTransfer<Anonymous>
{

    public DefaultOtherDisableJumpReply(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default other disable jump reply"
     * </p>
     * 
     * @param default_other_disable_jump_reply
     *     "Don't jump to user's post after they reply by default."
     *     
     */
    public void put(boolean default_other_disable_jump_reply) {
        String url = ("https://discourse.example.com//admin/site_settings/default_other_disable_jump_reply");
        Map<String, Object> content = new HashMap<>();
        content.put("default_other_disable_jump_reply", (default_other_disable_jump_reply));
        requestPut(url, null, content, Void.class);
    }
}
