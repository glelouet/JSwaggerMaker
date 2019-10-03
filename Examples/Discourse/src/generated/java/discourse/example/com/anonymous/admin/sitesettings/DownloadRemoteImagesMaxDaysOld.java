package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DownloadRemoteImagesMaxDaysOld
    extends DelegateTransfer<Anonymous>
{

    public DownloadRemoteImagesMaxDaysOld(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * download remote images max days old
     * </p>
     * 
     * @param download_remote_images_max_days_old
     *     Don't download remote images for posts that are more than n days old.
     *     
     */
    public void put(long download_remote_images_max_days_old) {
        String url = ("https://discourse.example.com//admin/site_settings/download_remote_images_max_days_old");
        Map<String, Object> content = new HashMap<>();
        content.put("download_remote_images_max_days_old", (download_remote_images_max_days_old));
        requestPut(url, null, content, Void.class);
    }
}
