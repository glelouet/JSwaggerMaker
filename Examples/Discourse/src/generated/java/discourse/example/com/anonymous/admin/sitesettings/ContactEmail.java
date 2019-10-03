package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ContactEmail
    extends DelegateTransfer<Anonymous>
{

    public ContactEmail(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the contact email
     * </p>
     * 
     * @param contact_email
     */
    public void put(String contact_email) {
        String url = ("https://discourse.example.com//admin/site_settings/contact_email");
        Map<String, Object> content = new HashMap<>();
        content.put("contact_email", (contact_email));
        requestPut(url, null, content, Void.class);
    }
}
