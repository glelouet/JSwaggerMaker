package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EmailIn
    extends DelegateTransfer<Anonymous>
{

    public EmailIn(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * email in
     * </p>
     * 
     * @param email_in
     *     'Allow users to post new topics via email (requires pop3 polling). Configure the addresses in the "Settings" tab of each category.'
     *     
     */
    public void put(boolean email_in) {
        String url = ("https://discourse.example.com//admin/site_settings/email_in");
        Map<String, Object> content = new HashMap<>();
        content.put("email_in", (email_in));
        requestPut(url, null, content, Void.class);
    }
}
