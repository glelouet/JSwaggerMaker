package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinFirstPostLength
    extends DelegateTransfer<Anonymous>
{

    public MinFirstPostLength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * min first post length
     * </p>
     * 
     * @param min_first_post_length
     */
    public void put(long min_first_post_length) {
        String url = ("https://discourse.example.com//admin/site_settings/min_first_post_length");
        Map<String, Object> content = new HashMap<>();
        content.put("min_first_post_length", (min_first_post_length));
        requestPut(url, null, content, Void.class);
    }
}
