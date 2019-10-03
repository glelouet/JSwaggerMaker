package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowRestore
    extends DelegateTransfer<Anonymous>
{

    public AllowRestore(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * allow_restore
     * </p>
     * 
     * @param allow_restore
     *     "Allow restore, which can replace ALL site data! Leave false unless you plan to restore a backup"
     *     
     */
    public void put(boolean allow_restore) {
        String url = ("https://discourse.example.com//admin/site_settings/allow_restore");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_restore", (allow_restore));
        requestPut(url, null, content, Void.class);
    }
}
