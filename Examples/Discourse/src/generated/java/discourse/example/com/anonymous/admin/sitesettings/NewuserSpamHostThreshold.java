package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class NewuserSpamHostThreshold
    extends DelegateTransfer<Anonymous>
{

    public NewuserSpamHostThreshold(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * newuser spam host threshold
     * </p>
     * 
     * @param newuser_spam_host_threshold
     *     "How many times a new user can post a link to the same host within their `newuser_spam_host_threshold` posts before being considered spam."
     *     
     */
    public void put(long newuser_spam_host_threshold) {
        String url = ("https://discourse.example.com//admin/site_settings/newuser_spam_host_threshold");
        Map<String, Object> content = new HashMap<>();
        content.put("newuser_spam_host_threshold", (newuser_spam_host_threshold));
        requestPut(url, null, content, Void.class);
    }
}
