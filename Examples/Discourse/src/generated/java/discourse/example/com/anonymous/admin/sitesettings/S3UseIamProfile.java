package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class S3UseIamProfile
    extends DelegateTransfer<Anonymous>
{

    public S3UseIamProfile(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * s3 use iam profile
     * </p>
     * 
     * @param s3_use_iam_profile
     *     'Use AWS EC2 IAM role to retrieve keys. NOTE: enabling will override "s3 access key id" and "s3 secret access key" settings.'
     *     
     */
    public void put(boolean s3_use_iam_profile) {
        String url = ("https://discourse.example.com//admin/site_settings/s3_use_iam_profile");
        Map<String, Object> content = new HashMap<>();
        content.put("s3_use_iam_profile", (s3_use_iam_profile));
        requestPut(url, null, content, Void.class);
    }
}
