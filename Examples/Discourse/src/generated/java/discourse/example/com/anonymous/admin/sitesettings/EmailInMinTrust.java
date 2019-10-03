package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EmailInMinTrust
    extends DelegateTransfer<Anonymous>
{

    public EmailInMinTrust(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * email in min trust
     * </p>
     * 
     * @param email_in_min_trust
     *     The minimum trust level a user needs to have to be allowed to post new topics via email.
     *     
     */
    public void put(long email_in_min_trust) {
        String url = ("https://discourse.example.com//admin/site_settings/email_in_min_trust");
        Map<String, Object> content = new HashMap<>();
        content.put("email_in_min_trust", (email_in_min_trust));
        requestPut(url, null, content, Void.class);
    }
}
