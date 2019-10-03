package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DisabledImageDownloadDomains
    extends DelegateTransfer<Anonymous>
{

    public DisabledImageDownloadDomains(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * disabled image download domains
     * </p>
     * 
     * @param disabled_image_download_domains
     *     Remote images will never be downloaded from these domains. Pipe-delimited list.
     */
    public void put(String disabled_image_download_domains) {
        String url = ("https://discourse.example.com//admin/site_settings/disabled_image_download_domains");
        Map<String, Object> content = new HashMap<>();
        content.put("disabled_image_download_domains", (disabled_image_download_domains));
        requestPut(url, null, content, Void.class);
    }
}
