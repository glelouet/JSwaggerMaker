package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SetLocaleFromAcceptLanguageHeader
    extends DelegateTransfer<Anonymous>
{

    public SetLocaleFromAcceptLanguageHeader(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update set locale from accept language header
     * </p>
     * 
     * @param set_locale_from_accept_language_header
     */
    public void put(boolean set_locale_from_accept_language_header) {
        String url = ("https://discourse.example.com//admin/site_settings/set_locale_from_accept_language_header");
        Map<String, Object> content = new HashMap<>();
        content.put("set_locale_from_accept_language_header", (set_locale_from_accept_language_header));
        requestPut(url, null, content, Void.class);
    }
}
