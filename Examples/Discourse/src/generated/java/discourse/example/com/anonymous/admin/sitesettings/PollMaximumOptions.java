package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PollMaximumOptions
    extends DelegateTransfer<Anonymous>
{

    public PollMaximumOptions(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "poll maximum options"
     * </p>
     * 
     * @param poll_maximum_options
     *     "Maximum number of options allowed in a poll."
     *     
     */
    public void put(long poll_maximum_options) {
        String url = ("https://discourse.example.com//admin/site_settings/poll_maximum_options");
        Map<String, Object> content = new HashMap<>();
        content.put("poll_maximum_options", (poll_maximum_options));
        requestPut(url, null, content, Void.class);
    }
}
