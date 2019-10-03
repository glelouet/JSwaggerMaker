package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EmailLinkColor
    extends DelegateTransfer<Anonymous>
{

    public EmailLinkColor(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * email link color
     * </p>
     * 
     * @param email_link_color
     *     Enter a color name ('blue') or hex value ('#0000FF').
     *     
     */
    public void put(String email_link_color) {
        String url = ("https://discourse.example.com//admin/site_settings/email_link_color");
        Map<String, Object> content = new HashMap<>();
        content.put("email_link_color", (email_link_color));
        requestPut(url, null, content, Void.class);
    }
}
