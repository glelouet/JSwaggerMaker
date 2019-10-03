package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxImageWidth
    extends DelegateTransfer<Anonymous>
{

    public MaxImageWidth(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max image width
     * </p>
     * 
     * @param max_image_width
     *     Maximum thumbnail width of images in a post
     */
    public void put(long max_image_width) {
        String url = ("https://discourse.example.com//admin/site_settings/max_image_width");
        Map<String, Object> content = new HashMap<>();
        content.put("max_image_width", (max_image_width));
        requestPut(url, null, content, Void.class);
    }
}
