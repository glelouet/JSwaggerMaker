package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ContactUrl
    extends DelegateTransfer<Anonymous>
{

    public ContactUrl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the contact url
     * </p>
     * 
     * @param contact_url
     */
    public void put(String contact_url) {
        String url = ("https://discourse.example.com//admin/site_settings/contact_url");
        Map<String, Object> content = new HashMap<>();
        content.put("contact_url", (contact_url));
        requestPut(url, null, content, Void.class);
    }
}
