package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DownloadRemoteImagesThreshold
    extends DelegateTransfer<Anonymous>
{

    public DownloadRemoteImagesThreshold(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * download remote images threshold
     * </p>
     * 
     * @param download_remote_images_threshold
     *     Minimum disk space necessary to download remote images locally (in percent)
     *     
     */
    public void put(long download_remote_images_threshold) {
        String url = ("https://discourse.example.com//admin/site_settings/download_remote_images_threshold");
        Map<String, Object> content = new HashMap<>();
        content.put("download_remote_images_threshold", (download_remote_images_threshold));
        requestPut(url, null, content, Void.class);
    }
}
