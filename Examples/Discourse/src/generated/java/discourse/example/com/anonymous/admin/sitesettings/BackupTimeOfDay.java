package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class BackupTimeOfDay
    extends DelegateTransfer<Anonymous>
{

    public BackupTimeOfDay(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * backup time of day
     * </p>
     * 
     * @param backup_time_of_day
     *     "Time of day UTC when the backup should occur."
     *     
     */
    public void put(String backup_time_of_day) {
        String url = ("https://discourse.example.com//admin/site_settings/backup_time_of_day");
        Map<String, Object> content = new HashMap<>();
        content.put("backup_time_of_day", (backup_time_of_day));
        requestPut(url, null, content, Void.class);
    }
}
