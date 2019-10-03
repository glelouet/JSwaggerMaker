package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinTrustToAllowSelfWiki
    extends DelegateTransfer<Anonymous>
{

    public MinTrustToAllowSelfWiki(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * min trust to allow self wiki
     * </p>
     * 
     * @param min_trust_to_allow_self_wiki
     *     "The minimum trust level required to make user's own post wiki."
     *     
     */
    public void put(long min_trust_to_allow_self_wiki) {
        String url = ("https://discourse.example.com//admin/site_settings/min_trust_to_allow_self_wiki");
        Map<String, Object> content = new HashMap<>();
        content.put("min_trust_to_allow_self_wiki", (min_trust_to_allow_self_wiki));
        requestPut(url, null, content, Void.class);
    }
}
