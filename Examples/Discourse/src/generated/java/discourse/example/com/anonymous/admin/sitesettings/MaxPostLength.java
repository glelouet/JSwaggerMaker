package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxPostLength
    extends DelegateTransfer<Anonymous>
{

    public MaxPostLength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max post length
     * </p>
     * 
     * @param max_post_length
     */
    public void put(long max_post_length) {
        String url = ("https://discourse.example.com//admin/site_settings/max_post_length");
        Map<String, Object> content = new HashMap<>();
        content.put("max_post_length", (max_post_length));
        requestPut(url, null, content, Void.class);
    }
}
