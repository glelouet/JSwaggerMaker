package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaximumBackups
    extends DelegateTransfer<Anonymous>
{

    public MaximumBackups(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * maximum backups
     * </p>
     * 
     * @param maximum_backups
     *     "The maximum amount of backups to keep on disk. Older backups are automatically deleted"
     *     
     */
    public void put(long maximum_backups) {
        String url = ("https://discourse.example.com//admin/site_settings/maximum_backups");
        Map<String, Object> content = new HashMap<>();
        content.put("maximum_backups", (maximum_backups));
        requestPut(url, null, content, Void.class);
    }
}
