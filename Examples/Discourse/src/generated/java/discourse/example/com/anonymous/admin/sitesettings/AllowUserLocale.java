package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowUserLocale
    extends DelegateTransfer<Anonymous>
{

    public AllowUserLocale(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update allow user locale
     * </p>
     * 
     * @param allow_user_locale
     */
    public void put(boolean allow_user_locale) {
        String url = ("https://discourse.example.com//admin/site_settings/allow_user_locale");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_user_locale", (allow_user_locale));
        requestPut(url, null, content, Void.class);
    }
}
