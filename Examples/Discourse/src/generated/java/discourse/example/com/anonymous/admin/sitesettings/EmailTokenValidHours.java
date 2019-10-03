package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EmailTokenValidHours
    extends DelegateTransfer<Anonymous>
{

    public EmailTokenValidHours(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * email token valid hours
     * </p>
     * 
     * @param email_token_valid_hours
     */
    public void put(long email_token_valid_hours) {
        String url = ("https://discourse.example.com//admin/site_settings/email_token_valid_hours");
        Map<String, Object> content = new HashMap<>();
        content.put("email_token_valid_hours", (email_token_valid_hours));
        requestPut(url, null, content, Void.class);
    }
}
