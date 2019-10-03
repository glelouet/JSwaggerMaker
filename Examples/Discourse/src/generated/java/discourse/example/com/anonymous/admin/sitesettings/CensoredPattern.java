package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class CensoredPattern
    extends DelegateTransfer<Anonymous>
{

    public CensoredPattern(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * censored pattern
     * </p>
     * 
     * @param censored_pattern
     */
    public void put(String censored_pattern) {
        String url = ("https://discourse.example.com//admin/site_settings/censored_pattern");
        Map<String, Object> content = new HashMap<>();
        content.put("censored_pattern", (censored_pattern));
        requestPut(url, null, content, Void.class);
    }
}
