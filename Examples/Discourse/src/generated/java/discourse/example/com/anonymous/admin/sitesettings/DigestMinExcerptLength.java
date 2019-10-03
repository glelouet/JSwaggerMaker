package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DigestMinExcerptLength
    extends DelegateTransfer<Anonymous>
{

    public DigestMinExcerptLength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * digest min excerpt length
     * </p>
     * 
     * @param digest_min_excerpt_length
     */
    public void put(long digest_min_excerpt_length) {
        String url = ("https://discourse.example.com//admin/site_settings/digest_min_excerpt_length");
        Map<String, Object> content = new HashMap<>();
        content.put("digest_min_excerpt_length", (digest_min_excerpt_length));
        requestPut(url, null, content, Void.class);
    }
}
