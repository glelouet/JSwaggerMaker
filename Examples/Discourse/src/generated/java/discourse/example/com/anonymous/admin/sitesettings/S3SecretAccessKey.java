package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class S3SecretAccessKey
    extends DelegateTransfer<Anonymous>
{

    public S3SecretAccessKey(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * s3 secret access key
     * </p>
     * 
     * @param s3_secret_access_key
     *     "The Amazon S3 secret access key that will be used to upload images."
     *     
     */
    public void put(String s3_secret_access_key) {
        String url = ("https://discourse.example.com//admin/site_settings/s3_secret_access_key");
        Map<String, Object> content = new HashMap<>();
        content.put("s3_secret_access_key", (s3_secret_access_key));
        requestPut(url, null, content, Void.class);
    }
}
