package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class GlobalNotice
    extends DelegateTransfer<Anonymous>
{

    public GlobalNotice(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * global notice
     * </p>
     * 
     * @param global_notice
     *     "Display an URGENT, EMERGENCY global banner notice to all visitors, change to blank to hide it (HTML allowed)."
     *     
     */
    public void put(String global_notice) {
        String url = ("https://discourse.example.com//admin/site_settings/global_notice");
        Map<String, Object> content = new HashMap<>();
        content.put("global_notice", (global_notice));
        requestPut(url, null, content, Void.class);
    }
}
