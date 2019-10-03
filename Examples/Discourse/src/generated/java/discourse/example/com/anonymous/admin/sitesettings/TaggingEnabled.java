package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TaggingEnabled
    extends DelegateTransfer<Anonymous>
{

    public TaggingEnabled(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "tagging enabled"
     * </p>
     * 
     * @param tagging_enabled
     *     "Enable tags on topics?"
     *     
     */
    public void put(boolean tagging_enabled) {
        String url = ("https://discourse.example.com//admin/site_settings/tagging_enabled");
        Map<String, Object> content = new HashMap<>();
        content.put("tagging_enabled", (tagging_enabled));
        requestPut(url, null, content, Void.class);
    }
}
