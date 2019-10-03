package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AppleTouchIconUrl
    extends DelegateTransfer<Anonymous>
{

    public AppleTouchIconUrl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the apple touch icon url
     * </p>
     * 
     * @param apple_touch_icon_url
     */
    public void put(String apple_touch_icon_url) {
        String url = ("https://discourse.example.com//admin/site_settings/apple_touch_icon_url");
        Map<String, Object> content = new HashMap<>();
        content.put("apple_touch_icon_url", (apple_touch_icon_url));
        requestPut(url, null, content, Void.class);
    }
}
