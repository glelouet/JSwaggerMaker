package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ApproveUnlessTrustLevel
    extends DelegateTransfer<Anonymous>
{

    public ApproveUnlessTrustLevel(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * approve unless trust level
     * </p>
     * 
     * @param approve_unless_trust_level
     */
    public void put(long approve_unless_trust_level) {
        String url = ("https://discourse.example.com//admin/site_settings/approve_unless_trust_level");
        Map<String, Object> content = new HashMap<>();
        content.put("approve_unless_trust_level", (approve_unless_trust_level));
        requestPut(url, null, content, Void.class);
    }
}
