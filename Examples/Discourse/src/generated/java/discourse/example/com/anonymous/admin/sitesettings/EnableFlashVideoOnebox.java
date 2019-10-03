package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableFlashVideoOnebox
    extends DelegateTransfer<Anonymous>
{

    public EnableFlashVideoOnebox(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable flash video onebox
     * </p>
     * 
     * @param enable_flash_video_onebox
     *     "Enable embedding of swf and flv (Adobe Flash) links in oneboxes. WARNING: may introduce security risks."
     *     
     */
    public void put(boolean enable_flash_video_onebox) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_flash_video_onebox");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_flash_video_onebox", (enable_flash_video_onebox));
        requestPut(url, null, content, Void.class);
    }
}
