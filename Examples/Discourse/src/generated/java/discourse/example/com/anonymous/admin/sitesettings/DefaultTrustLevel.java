package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultTrustLevel
    extends DelegateTransfer<Anonymous>
{

    public DefaultTrustLevel(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * default trust level
     * </p>
     * 
     * @param default_trust_level
     *     "Default trust level (0-4) for all new users. WARNING! Changing this will put you at serious risk for spam."
     *     
     */
    public void put(long default_trust_level) {
        String url = ("https://discourse.example.com//admin/site_settings/default_trust_level");
        Map<String, Object> content = new HashMap<>();
        content.put("default_trust_level", (default_trust_level));
        requestPut(url, null, content, Void.class);
    }
}
