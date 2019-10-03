package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class GaUniversalDomainName
    extends DelegateTransfer<Anonymous>
{

    public GaUniversalDomainName(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update Google Universal Analytics domain name
     * </p>
     * 
     * @param ga_universal_domain_name
     */
    public void put(String ga_universal_domain_name) {
        String url = ("https://discourse.example.com//admin/site_settings/ga_universal_domain_name");
        Map<String, Object> content = new HashMap<>();
        content.put("ga_universal_domain_name", (ga_universal_domain_name));
        requestPut(url, null, content, Void.class);
    }
}
