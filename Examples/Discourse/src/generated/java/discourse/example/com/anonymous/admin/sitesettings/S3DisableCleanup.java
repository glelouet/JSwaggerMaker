package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class S3DisableCleanup
    extends DelegateTransfer<Anonymous>
{

    public S3DisableCleanup(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * s3 disable cleanup
     * </p>
     * 
     * @param s3_disable_cleanup
     *     "Disable the removal of backups from S3 when removed locally."
     *     
     */
    public void put(boolean s3_disable_cleanup) {
        String url = ("https://discourse.example.com//admin/site_settings/s3_disable_cleanup");
        Map<String, Object> content = new HashMap<>();
        content.put("s3_disable_cleanup", (s3_disable_cleanup));
        requestPut(url, null, content, Void.class);
    }
}
