package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowAnonymousPosting
    extends DelegateTransfer<Anonymous>
{

    public AllowAnonymousPosting(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * allow anonymous posting
     * </p>
     * 
     * @param allow_anonymous_posting
     */
    public void put(boolean allow_anonymous_posting) {
        String url = ("https://discourse.example.com//admin/site_settings/allow_anonymous_posting");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_anonymous_posting", (allow_anonymous_posting));
        requestPut(url, null, content, Void.class);
    }
}
