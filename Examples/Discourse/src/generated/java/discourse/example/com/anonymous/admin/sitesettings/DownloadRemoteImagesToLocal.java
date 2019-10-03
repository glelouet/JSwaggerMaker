package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DownloadRemoteImagesToLocal
    extends DelegateTransfer<Anonymous>
{

    public DownloadRemoteImagesToLocal(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * download remote images to local
     * </p>
     * 
     * @param max_image_width
     *     Convert remote images to local images by downloading them; this prevents broken images.
     */
    public void put(boolean max_image_width) {
        String url = ("https://discourse.example.com//admin/site_settings/download_remote_images_to_local");
        Map<String, Object> content = new HashMap<>();
        content.put("max_image_width", (max_image_width));
        requestPut(url, null, content, Void.class);
    }
}
