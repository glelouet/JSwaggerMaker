package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class NativeAppInstallBanner
    extends DelegateTransfer<Anonymous>
{

    public NativeAppInstallBanner(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "native app install banner"
     * </p>
     * 
     * @param native_app_install_banner
     *     "Asks recurring visitors to install Discourse native app."
     *     
     */
    public void put(boolean native_app_install_banner) {
        String url = ("https://discourse.example.com//admin/site_settings/native_app_install_banner");
        Map<String, Object> content = new HashMap<>();
        content.put("native_app_install_banner", (native_app_install_banner));
        requestPut(url, null, content, Void.class);
    }
}
