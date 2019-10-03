package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxBookmarksPerDay
    extends DelegateTransfer<Anonymous>
{

    public MaxBookmarksPerDay(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max bookmarks per day
     * </p>
     * 
     * @param max_bookmarks_per_day
     *     "Maximum number of bookmarks per user per day."
     *     
     */
    public void put(long max_bookmarks_per_day) {
        String url = ("https://discourse.example.com//admin/site_settings/max_bookmarks_per_day");
        Map<String, Object> content = new HashMap<>();
        content.put("max_bookmarks_per_day", (max_bookmarks_per_day));
        requestPut(url, null, content, Void.class);
    }
}
