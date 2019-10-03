package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AlwaysShowTrimmedContent
    extends DelegateTransfer<Anonymous>
{

    public AlwaysShowTrimmedContent(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * always show trimmed content
     * </p>
     * 
     * @param always_show_trimmed_content
     *     Always show trimmed part of incoming emails. WARNING: might reveal email addresses.
     */
    public void put(boolean always_show_trimmed_content) {
        String url = ("https://discourse.example.com//admin/site_settings/always_show_trimmed_content");
        Map<String, Object> content = new HashMap<>();
        content.put("always_show_trimmed_content", (always_show_trimmed_content));
        requestPut(url, null, content, Void.class);
    }
}
