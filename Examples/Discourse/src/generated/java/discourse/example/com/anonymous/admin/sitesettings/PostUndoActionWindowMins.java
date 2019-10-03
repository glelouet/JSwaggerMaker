package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PostUndoActionWindowMins
    extends DelegateTransfer<Anonymous>
{

    public PostUndoActionWindowMins(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * post undo action window mins
     * </p>
     * 
     * @param post_undo_action_window_mins
     */
    public void put(long post_undo_action_window_mins) {
        String url = ("https://discourse.example.com//admin/site_settings/post_undo_action_window_mins");
        Map<String, Object> content = new HashMap<>();
        content.put("post_undo_action_window_mins", (post_undo_action_window_mins));
        requestPut(url, null, content, Void.class);
    }
}
