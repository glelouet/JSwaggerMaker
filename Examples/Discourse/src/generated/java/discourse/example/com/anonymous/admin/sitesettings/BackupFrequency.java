package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class BackupFrequency
    extends DelegateTransfer<Anonymous>
{

    public BackupFrequency(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * backup frequency
     * </p>
     * 
     * @param backup_frequency
     *     "How frequently we create a site backup, in days."
     *     
     */
    public void put(long backup_frequency) {
        String url = ("https://discourse.example.com//admin/site_settings/backup_frequency");
        Map<String, Object> content = new HashMap<>();
        content.put("backup_frequency", (backup_frequency));
        requestPut(url, null, content, Void.class);
    }
}
