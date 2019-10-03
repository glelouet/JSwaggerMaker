package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EmailEditable
    extends DelegateTransfer<Anonymous>
{

    public EmailEditable(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * email editable
     * </p>
     * 
     * @param email_editable
     */
    public void put(boolean email_editable) {
        String url = ("https://discourse.example.com//admin/site_settings/email_editable");
        Map<String, Object> content = new HashMap<>();
        content.put("email_editable", (email_editable));
        requestPut(url, null, content, Void.class);
    }
}
