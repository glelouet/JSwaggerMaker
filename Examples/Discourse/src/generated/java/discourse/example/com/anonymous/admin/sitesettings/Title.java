package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Title
    extends DelegateTransfer<Anonymous>
{

    public Title(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the site title
     * </p>
     * 
     * @param title
     */
    public void put(String title) {
        String url = ("https://discourse.example.com//admin/site_settings/title");
        Map<String, Object> content = new HashMap<>();
        content.put("title", (title));
        requestPut(url, null, content, Void.class);
    }
}
