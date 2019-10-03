package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class S3Region
    extends DelegateTransfer<Anonymous>
{

    public S3Region(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * s3 region
     * </p>
     * 
     * @param s3_region
     *     "The Amazon S3 region name that will be used to upload images."
     *     
     */
    public void put(discourse.example.com.structures.s3_region s3_region) {
        String url = ("https://discourse.example.com//admin/site_settings/s3_region");
        Map<String, Object> content = new HashMap<>();
        content.put("s3_region", (s3_region));
        requestPut(url, null, content, Void.class);
    }
}
