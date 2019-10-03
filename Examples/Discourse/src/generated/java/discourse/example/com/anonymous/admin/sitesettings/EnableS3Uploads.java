package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableS3Uploads
    extends DelegateTransfer<Anonymous>
{

    public EnableS3Uploads(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable s3 uploads
     * </p>
     * 
     * @param enable_s3_uploads
     *     "Place uploads on Amazon S3 storage. IMPORTANT: requires valid S3 credentials (both access key id & secret access key)."
     *     
     */
    public void put(boolean enable_s3_uploads) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_s3_uploads");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_s3_uploads", (enable_s3_uploads));
        requestPut(url, null, content, Void.class);
    }
}
