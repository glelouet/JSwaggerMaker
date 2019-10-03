package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class S3BackupBucket
    extends DelegateTransfer<Anonymous>
{

    public S3BackupBucket(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * s3 backup bucket
     * </p>
     * 
     * @param s3_backup_bucket
     *     "The remote bucket to hold backups. WARNING: Make sure it is a private bucket."
     *     
     */
    public void put(String s3_backup_bucket) {
        String url = ("https://discourse.example.com//admin/site_settings/s3_backup_bucket");
        Map<String, Object> content = new HashMap<>();
        content.put("s3_backup_bucket", (s3_backup_bucket));
        requestPut(url, null, content, Void.class);
    }
}
