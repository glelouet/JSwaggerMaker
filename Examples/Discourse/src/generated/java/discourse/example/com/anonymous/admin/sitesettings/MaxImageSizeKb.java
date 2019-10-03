package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxImageSizeKb
    extends DelegateTransfer<Anonymous>
{

    public MaxImageSizeKb(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max image size kb
     * </p>
     * 
     * @param max_image_size_kb
     *     The maximum image upload size in kB. This must be configured in nginx {client_max_body_size} / apache or proxy as well.
     */
    public void put(long max_image_size_kb) {
        String url = ("https://discourse.example.com//admin/site_settings/max_image_size_kb");
        Map<String, Object> content = new HashMap<>();
        content.put("max_image_size_kb", (max_image_size_kb));
        requestPut(url, null, content, Void.class);
    }
}
