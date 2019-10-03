package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class S3AccessKeyId
    extends DelegateTransfer<Anonymous>
{

    public S3AccessKeyId(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * s3 access key id
     * </p>
     * 
     * @param s3_access_key_id
     *     "The Amazon S3 access key id that will be used to upload images."
     *     
     */
    public void put(String s3_access_key_id) {
        String url = ("https://discourse.example.com//admin/site_settings/s3_access_key_id");
        Map<String, Object> content = new HashMap<>();
        content.put("s3_access_key_id", (s3_access_key_id));
        requestPut(url, null, content, Void.class);
    }
}
