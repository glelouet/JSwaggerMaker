package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableMobileTheme
    extends DelegateTransfer<Anonymous>
{

    public EnableMobileTheme(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update enable mobile theme
     * </p>
     * 
     * @param enable_mobile_theme
     */
    public void put(boolean enable_mobile_theme) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_mobile_theme");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_mobile_theme", (enable_mobile_theme));
        requestPut(url, null, content, Void.class);
    }
}
