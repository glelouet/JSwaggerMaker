package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ReadonlyModeDuringBackup
    extends DelegateTransfer<Anonymous>
{

    public ReadonlyModeDuringBackup(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * readonly_mode_during_backup
     * </p>
     * 
     * @param readonly_mode_during_backup
     *     "Enable read only mode while taking a backup"
     *     
     */
    public void put(boolean readonly_mode_during_backup) {
        String url = ("https://discourse.example.com//admin/site_settings/readonly_mode_during_backup");
        Map<String, Object> content = new HashMap<>();
        content.put("readonly_mode_during_backup", (readonly_mode_during_backup));
        requestPut(url, null, content, Void.class);
    }
}
