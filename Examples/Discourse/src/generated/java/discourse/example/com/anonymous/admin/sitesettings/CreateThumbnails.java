package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class CreateThumbnails
    extends DelegateTransfer<Anonymous>
{

    public CreateThumbnails(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * create thumbnails
     * </p>
     * 
     * @param create_thumbnails
     *     "Create thumbnails and lightbox images that are too large to fit in a post"
     *     
     */
    public void put(boolean create_thumbnails) {
        String url = ("https://discourse.example.com//admin/site_settings/create_thumbnails");
        Map<String, Object> content = new HashMap<>();
        content.put("create_thumbnails", (create_thumbnails));
        requestPut(url, null, content, Void.class);
    }
}
