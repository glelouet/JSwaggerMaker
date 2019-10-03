package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AnonymousPostingMinTrustLevel
    extends DelegateTransfer<Anonymous>
{

    public AnonymousPostingMinTrustLevel(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * anonymous posting min trust level
     * </p>
     * 
     * @param anonymous_posting_min_trust_level
     */
    public void put(long anonymous_posting_min_trust_level) {
        String url = ("https://discourse.example.com//admin/site_settings/anonymous_posting_min_trust_level");
        Map<String, Object> content = new HashMap<>();
        content.put("anonymous_posting_min_trust_level", (anonymous_posting_min_trust_level));
        requestPut(url, null, content, Void.class);
    }
}
