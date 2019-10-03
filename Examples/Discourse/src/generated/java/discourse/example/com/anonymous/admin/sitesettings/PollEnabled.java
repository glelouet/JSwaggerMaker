package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PollEnabled
    extends DelegateTransfer<Anonymous>
{

    public PollEnabled(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "poll enabled"
     * </p>
     * 
     * @param poll_enabled
     *     "Allow users to create polls?"
     *     
     */
    public void put(boolean poll_enabled) {
        String url = ("https://discourse.example.com//admin/site_settings/poll_enabled");
        Map<String, Object> content = new HashMap<>();
        content.put("poll_enabled", (poll_enabled));
        requestPut(url, null, content, Void.class);
    }
}
