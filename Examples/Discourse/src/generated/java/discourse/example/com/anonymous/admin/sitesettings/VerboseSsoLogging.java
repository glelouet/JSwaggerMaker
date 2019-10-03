package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class VerboseSsoLogging
    extends DelegateTransfer<Anonymous>
{

    public VerboseSsoLogging(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * verbose sso logging
     * </p>
     * 
     * @param verbose_sso_logging
     */
    public void put(boolean verbose_sso_logging) {
        String url = ("https://discourse.example.com//admin/site_settings/verbose_sso_logging");
        Map<String, Object> content = new HashMap<>();
        content.put("verbose_sso_logging", (verbose_sso_logging));
        requestPut(url, null, content, Void.class);
    }
}
