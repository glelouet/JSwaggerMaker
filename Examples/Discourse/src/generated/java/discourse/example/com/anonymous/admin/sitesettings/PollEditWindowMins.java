package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PollEditWindowMins
    extends DelegateTransfer<Anonymous>
{

    public PollEditWindowMins(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * poll edit window mins
     * </p>
     * 
     * @param poll_edit_window_mins
     *     Number of minutes after post creation during which polls can be edited.
     *     
     */
    public void put(long poll_edit_window_mins) {
        String url = ("https://discourse.example.com//admin/site_settings/poll_edit_window_mins");
        Map<String, Object> content = new HashMap<>();
        content.put("poll_edit_window_mins", (poll_edit_window_mins));
        requestPut(url, null, content, Void.class);
    }
}
