package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinPostLength
    extends DelegateTransfer<Anonymous>
{

    public MinPostLength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * min post length
     * </p>
     * 
     * @param min_post_length
     */
    public void put(long min_post_length) {
        String url = ("https://discourse.example.com//admin/site_settings/min_post_length");
        Map<String, Object> content = new HashMap<>();
        content.put("min_post_length", (min_post_length));
        requestPut(url, null, content, Void.class);
    }
}
