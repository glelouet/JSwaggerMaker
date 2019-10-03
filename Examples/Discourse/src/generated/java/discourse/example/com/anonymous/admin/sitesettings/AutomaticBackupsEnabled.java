package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AutomaticBackupsEnabled
    extends DelegateTransfer<Anonymous>
{

    public AutomaticBackupsEnabled(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * automatic backups enabled
     * </p>
     * 
     * @param automatic_backups_enabled
     *     "Run automatic backups as defined in backup frequency"
     *     
     */
    public void put(boolean automatic_backups_enabled) {
        String url = ("https://discourse.example.com//admin/site_settings/automatic_backups_enabled");
        Map<String, Object> content = new HashMap<>();
        content.put("automatic_backups_enabled", (automatic_backups_enabled));
        requestPut(url, null, content, Void.class);
    }
}
