package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MobileLogoUrl
    extends DelegateTransfer<Anonymous>
{

    public MobileLogoUrl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the mobile logo url
     * </p>
     * 
     * @param mobile_logo_url
     */
    public void put(String mobile_logo_url) {
        String url = ("https://discourse.example.com//admin/site_settings/mobile_logo_url");
        Map<String, Object> content = new HashMap<>();
        content.put("mobile_logo_url", (mobile_logo_url));
        requestPut(url, null, content, Void.class);
    }
}
