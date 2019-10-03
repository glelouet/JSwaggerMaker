package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class LogOutStrict
    extends DelegateTransfer<Anonymous>
{

    public LogOutStrict(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * log out strict
     * </p>
     * 
     * @param log_out_strict
     */
    public void put(boolean log_out_strict) {
        String url = ("https://discourse.example.com//admin/site_settings/log_out_strict");
        Map<String, Object> content = new HashMap<>();
        content.put("log_out_strict", (log_out_strict));
        requestPut(url, null, content, Void.class);
    }
}
