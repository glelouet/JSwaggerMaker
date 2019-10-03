package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowAnimatedThumbnails
    extends DelegateTransfer<Anonymous>
{

    public AllowAnimatedThumbnails(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * allow animated thumbnails
     * </p>
     * 
     * @param allow_animated_thumbnails
     *     "Generate animated thumbnails of animated gifs."
     *     
     */
    public void put(boolean allow_animated_thumbnails) {
        String url = ("https://discourse.example.com//admin/site_settings/allow_animated_thumbnails");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_animated_thumbnails", (allow_animated_thumbnails));
        requestPut(url, null, content, Void.class);
    }
}
