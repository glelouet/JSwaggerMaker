package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinTrustToCreateTag
    extends DelegateTransfer<Anonymous>
{

    public MinTrustToCreateTag(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "min trust to create tag"
     * </p>
     * 
     * @param tagging_enabled
     *     "The minimum trust level required to create a tag."
     *     
     */
    public void put(long tagging_enabled) {
        String url = ("https://discourse.example.com//admin/site_settings/min_trust_to_create_tag");
        Map<String, Object> content = new HashMap<>();
        content.put("tagging_enabled", (tagging_enabled));
        requestPut(url, null, content, Void.class);
    }
}
