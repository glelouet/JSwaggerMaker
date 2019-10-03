package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class S3CdnUrl
    extends DelegateTransfer<Anonymous>
{

    public S3CdnUrl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * s3 cdn url
     * </p>
     * 
     * @param s3_cdn_url
     *     "The CDN URL to use for all s3 assets (for example: https://cdn.somewhere.com). WARNING: after changing this setting you must rebake all old posts."
     *     
     */
    public void put(String s3_cdn_url) {
        String url = ("https://discourse.example.com//admin/site_settings/s3_cdn_url");
        Map<String, Object> content = new HashMap<>();
        content.put("s3_cdn_url", (s3_cdn_url));
        requestPut(url, null, content, Void.class);
    }
}
