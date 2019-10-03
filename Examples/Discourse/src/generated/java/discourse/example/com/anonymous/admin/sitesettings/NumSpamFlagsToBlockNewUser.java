package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class NumSpamFlagsToBlockNewUser
    extends DelegateTransfer<Anonymous>
{

    public NumSpamFlagsToBlockNewUser(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * num spam flags to block new user
     * </p>
     * 
     * @param num_spam_flags_to_block_new_user
     *     "If a new user's posts get this many spam flags from num_users_to_block_new_user different users, hide all their posts and prevent future posting. 0 to disable."
     *     
     */
    public void put(long num_spam_flags_to_block_new_user) {
        String url = ("https://discourse.example.com//admin/site_settings/num_spam_flags_to_block_new_user");
        Map<String, Object> content = new HashMap<>();
        content.put("num_spam_flags_to_block_new_user", (num_spam_flags_to_block_new_user));
        requestPut(url, null, content, Void.class);
    }
}
