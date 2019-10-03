package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class BackupWithUploads
    extends DelegateTransfer<Anonymous>
{

    public BackupWithUploads(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * backup with uploads
     * </p>
     * 
     * @param backup_with_uploads
     *     "Include uploads in scheduled backups. Disabling this will only backup the database."
     *     
     */
    public void put(boolean backup_with_uploads) {
        String url = ("https://discourse.example.com//admin/site_settings/backup_with_uploads");
        Map<String, Object> content = new HashMap<>();
        content.put("backup_with_uploads", (backup_with_uploads));
        requestPut(url, null, content, Void.class);
    }
}
