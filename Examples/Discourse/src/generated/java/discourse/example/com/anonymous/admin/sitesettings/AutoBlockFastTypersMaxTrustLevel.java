package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AutoBlockFastTypersMaxTrustLevel
    extends DelegateTransfer<Anonymous>
{

    public AutoBlockFastTypersMaxTrustLevel(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * auto black fast typers max trust level
     * </p>
     * 
     * @param auto_block_fast_typers_max_trust_level
     *     "Maximum trust level to auto block fast typers"
     *     
     */
    public void put(long auto_block_fast_typers_max_trust_level) {
        String url = ("https://discourse.example.com//admin/site_settings/auto_block_fast_typers_max_trust_level");
        Map<String, Object> content = new HashMap<>();
        content.put("auto_block_fast_typers_max_trust_level", (auto_block_fast_typers_max_trust_level));
        requestPut(url, null, content, Void.class);
    }
}
