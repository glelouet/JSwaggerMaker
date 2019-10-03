package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DisplayNameOnEmailFrom
    extends DelegateTransfer<Anonymous>
{

    public DisplayNameOnEmailFrom(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * display name on email from
     * </p>
     * 
     * @param display_name_on_email_from
     *     Display full names on email from fields
     *     
     */
    public void put(boolean display_name_on_email_from) {
        String url = ("https://discourse.example.com//admin/site_settings/display_name_on_email_from");
        Map<String, Object> content = new HashMap<>();
        content.put("display_name_on_email_from", (display_name_on_email_from));
        requestPut(url, null, content, Void.class);
    }
}
