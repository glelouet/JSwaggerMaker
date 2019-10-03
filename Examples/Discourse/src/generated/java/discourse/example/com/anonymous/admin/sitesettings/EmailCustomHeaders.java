package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EmailCustomHeaders
    extends DelegateTransfer<Anonymous>
{

    public EmailCustomHeaders(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * email custom headers
     * </p>
     * 
     * @param email_custom_headers
     *     A pipe-delimited list of custom email headers
     */
    public void put(String email_custom_headers) {
        String url = ("https://discourse.example.com//admin/site_settings/email_custom_headers");
        Map<String, Object> content = new HashMap<>();
        content.put("email_custom_headers", (email_custom_headers));
        requestPut(url, null, content, Void.class);
    }
}
