package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class S3UploadBucket
    extends DelegateTransfer<Anonymous>
{

    public S3UploadBucket(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * s3 upload bucket
     * </p>
     * 
     * @param s3_upload_bucket
     *     "The Amazon S3 bucket name that files will be uploaded into. WARNING: must be lowercase, no periods, no underscores."
     *     
     */
    public void put(String s3_upload_bucket) {
        String url = ("https://discourse.example.com//admin/site_settings/s3_upload_bucket");
        Map<String, Object> content = new HashMap<>();
        content.put("s3_upload_bucket", (s3_upload_bucket));
        requestPut(url, null, content, Void.class);
    }
}
