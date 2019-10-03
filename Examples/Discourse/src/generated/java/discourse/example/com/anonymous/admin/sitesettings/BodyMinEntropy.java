package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class BodyMinEntropy
    extends DelegateTransfer<Anonymous>
{

    public BodyMinEntropy(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * body min entropy
     * </p>
     * 
     * @param body_min_entropy
     */
    public void put(long body_min_entropy) {
        String url = ("https://discourse.example.com//admin/site_settings/body_min_entropy");
        Map<String, Object> content = new HashMap<>();
        content.put("body_min_entropy", (body_min_entropy));
        requestPut(url, null, content, Void.class);
    }
}
