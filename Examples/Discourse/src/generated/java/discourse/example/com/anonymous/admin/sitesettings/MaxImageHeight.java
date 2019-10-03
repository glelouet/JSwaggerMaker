package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxImageHeight
    extends DelegateTransfer<Anonymous>
{

    public MaxImageHeight(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max image height
     * </p>
     * 
     * @param max_image_height
     *     Maximum thumbnail height of images in a post
     */
    public void put(long max_image_height) {
        String url = ("https://discourse.example.com//admin/site_settings/max_image_height");
        Map<String, Object> content = new HashMap<>();
        content.put("max_image_height", (max_image_height));
        requestPut(url, null, content, Void.class);
    }
}
