package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableS3Backups
    extends DelegateTransfer<Anonymous>
{

    public EnableS3Backups(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable s3 backups
     * </p>
     * 
     * @param enable_s3_backups
     *     "Upload backups to S3 when complete. IMPORTANT: requires valid S3 credentials entered in Files settings."
     *     
     */
    public void put(boolean enable_s3_backups) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_s3_backups");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_s3_backups", (enable_s3_backups));
        requestPut(url, null, content, Void.class);
    }
}
