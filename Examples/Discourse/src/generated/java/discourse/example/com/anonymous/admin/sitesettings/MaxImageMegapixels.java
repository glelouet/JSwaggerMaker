package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxImageMegapixels
    extends DelegateTransfer<Anonymous>
{

    public MaxImageMegapixels(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max image megapixels
     * </p>
     * 
     * @param max_image_megapixels
     *     Maximum number of megapixels allowed for an image
     */
    public void put(long max_image_megapixels) {
        String url = ("https://discourse.example.com//admin/site_settings/max_image_megapixels");
        Map<String, Object> content = new HashMap<>();
        content.put("max_image_megapixels", (max_image_megapixels));
        requestPut(url, null, content, Void.class);
    }
}
