package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class VerboseLocalization
    extends DelegateTransfer<Anonymous>
{

    public VerboseLocalization(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * verbose localization
     * </p>
     * 
     * @param verbose_localization
     *     "Show extended localization tips in the UI"
     *     
     */
    public void put(boolean verbose_localization) {
        String url = ("https://discourse.example.com//admin/site_settings/verbose_localization");
        Map<String, Object> content = new HashMap<>();
        content.put("verbose_localization", (verbose_localization));
        requestPut(url, null, content, Void.class);
    }
}
