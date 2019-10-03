package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AutohighlightAllCode
    extends DelegateTransfer<Anonymous>
{

    public AutohighlightAllCode(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * autohighlight all code
     * </p>
     * 
     * @param autohighlight_all_code
     */
    public void put(boolean autohighlight_all_code) {
        String url = ("https://discourse.example.com//admin/site_settings/autohighlight_all_code");
        Map<String, Object> content = new HashMap<>();
        content.put("autohighlight_all_code", (autohighlight_all_code));
        requestPut(url, null, content, Void.class);
    }
}
