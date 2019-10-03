package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class NewuserMaxAttachments
    extends DelegateTransfer<Anonymous>
{

    public NewuserMaxAttachments(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * newuser max attachments
     * </p>
     * 
     * @param newuser_max_attachments
     */
    public void put(long newuser_max_attachments) {
        String url = ("https://discourse.example.com//admin/site_settings/newuser_max_attachments");
        Map<String, Object> content = new HashMap<>();
        content.put("newuser_max_attachments", (newuser_max_attachments));
        requestPut(url, null, content, Void.class);
    }
}
