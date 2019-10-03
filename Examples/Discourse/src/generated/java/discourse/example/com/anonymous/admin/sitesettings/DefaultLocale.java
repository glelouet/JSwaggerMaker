package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultLocale
    extends DelegateTransfer<Anonymous>
{

    public DefaultLocale(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the default locale
     * </p>
     * 
     * @param default_locale
     */
    public void put(String default_locale) {
        String url = ("https://discourse.example.com//admin/site_settings/default_locale");
        Map<String, Object> content = new HashMap<>();
        content.put("default_locale", (default_locale));
        requestPut(url, null, content, Void.class);
    }
}
