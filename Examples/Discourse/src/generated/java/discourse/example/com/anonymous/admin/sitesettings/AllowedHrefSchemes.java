package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowedHrefSchemes
    extends DelegateTransfer<Anonymous>
{

    public AllowedHrefSchemes(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * allowed href schemes
     * </p>
     * 
     * @param allowed_href_schemes
     */
    public void put(String allowed_href_schemes) {
        String url = ("https://discourse.example.com//admin/site_settings/allowed_href_schemes");
        Map<String, Object> content = new HashMap<>();
        content.put("allowed_href_schemes", (allowed_href_schemes));
        requestPut(url, null, content, Void.class);
    }
}
