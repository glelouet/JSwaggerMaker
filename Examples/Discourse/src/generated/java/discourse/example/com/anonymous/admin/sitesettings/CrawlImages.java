package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class CrawlImages
    extends DelegateTransfer<Anonymous>
{

    public CrawlImages(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * crawl images
     * </p>
     * 
     * @param crawl_images
     *     Retrieve images from remote URLs to insert the correct width and height dimensions.
     */
    public void put(boolean crawl_images) {
        String url = ("https://discourse.example.com//admin/site_settings/crawl_images");
        Map<String, Object> content = new HashMap<>();
        content.put("crawl_images", (crawl_images));
        requestPut(url, null, content, Void.class);
    }
}
