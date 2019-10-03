package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class NewuserMaxLinks
    extends DelegateTransfer<Anonymous>
{

    public NewuserMaxLinks(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * newuser max links
     * </p>
     * 
     * @param newuser_max_links
     */
    public void put(long newuser_max_links) {
        String url = ("https://discourse.example.com//admin/site_settings/newuser_max_links");
        Map<String, Object> content = new HashMap<>();
        content.put("newuser_max_links", (newuser_max_links));
        requestPut(url, null, content, Void.class);
    }
}
