package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DigestLogoUrl
    extends DelegateTransfer<Anonymous>
{

    public DigestLogoUrl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the digest logo url
     * </p>
     * 
     * @param digest_logo_url
     */
    public void put(String digest_logo_url) {
        String url = ("https://discourse.example.com//admin/site_settings/digest_logo_url");
        Map<String, Object> content = new HashMap<>();
        content.put("digest_logo_url", (digest_logo_url));
        requestPut(url, null, content, Void.class);
    }
}
