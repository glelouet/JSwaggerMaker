package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class IgnoreByTitle
    extends DelegateTransfer<Anonymous>
{

    public IgnoreByTitle(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * ignore by title
     * </p>
     * 
     * @param ignore_by_title
     *     pipe delimited list
     */
    public void put(String ignore_by_title) {
        String url = ("https://discourse.example.com//admin/site_settings/ignore_by_title");
        Map<String, Object> content = new HashMap<>();
        content.put("ignore_by_title", (ignore_by_title));
        requestPut(url, null, content, Void.class);
    }
}
