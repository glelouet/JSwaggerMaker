package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultOtherEnableQuoting
    extends DelegateTransfer<Anonymous>
{

    public DefaultOtherEnableQuoting(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default other enable quoting"
     * </p>
     * 
     * @param default_other_enable_quoting
     *     "Enable quote reply for highlighted text by default."
     *     
     */
    public void put(boolean default_other_enable_quoting) {
        String url = ("https://discourse.example.com//admin/site_settings/default_other_enable_quoting");
        Map<String, Object> content = new HashMap<>();
        content.put("default_other_enable_quoting", (default_other_enable_quoting));
        requestPut(url, null, content, Void.class);
    }
}
