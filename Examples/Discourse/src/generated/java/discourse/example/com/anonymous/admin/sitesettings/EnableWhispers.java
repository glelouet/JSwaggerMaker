package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableWhispers
    extends DelegateTransfer<Anonymous>
{

    public EnableWhispers(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update enable whispers
     * </p>
     * 
     * @param enable_whispers
     */
    public void put(boolean enable_whispers) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_whispers");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_whispers", (enable_whispers));
        requestPut(url, null, content, Void.class);
    }
}
