package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultCodeLang
    extends DelegateTransfer<Anonymous>
{

    public DefaultCodeLang(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * default code lang
     * </p>
     * 
     * @param default_code_lang
     */
    public void put(String default_code_lang) {
        String url = ("https://discourse.example.com//admin/site_settings/default_code_lang");
        Map<String, Object> content = new HashMap<>();
        content.put("default_code_lang", (default_code_lang));
        requestPut(url, null, content, Void.class);
    }
}
