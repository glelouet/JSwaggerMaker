package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxAttachmentSizeKb
    extends DelegateTransfer<Anonymous>
{

    public MaxAttachmentSizeKb(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max attachment size kb
     * </p>
     * 
     * @param max_image_size_kb
     *     The maximum attachment upload size in kB. This must be configured in nginx {client_max_body_size} / apache or proxy as well.
     */
    public void put(long max_image_size_kb) {
        String url = ("https://discourse.example.com//admin/site_settings/max_attachment_size_kb");
        Map<String, Object> content = new HashMap<>();
        content.put("max_image_size_kb", (max_image_size_kb));
        requestPut(url, null, content, Void.class);
    }
}
