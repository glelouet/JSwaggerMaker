package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableEmoji
    extends DelegateTransfer<Anonymous>
{

    public EnableEmoji(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable emoji
     * </p>
     * 
     * @param enable_emoji
     */
    public void put(boolean enable_emoji) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_emoji");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_emoji", (enable_emoji));
        requestPut(url, null, content, Void.class);
    }
}
