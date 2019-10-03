package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxTagLength
    extends DelegateTransfer<Anonymous>
{

    public MaxTagLength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "max tag length"
     * </p>
     * 
     * @param max_tag_length
     *     "The maximum amount of characters that can be used in a tag."
     *     
     */
    public void put(long max_tag_length) {
        String url = ("https://discourse.example.com//admin/site_settings/max_tag_length");
        Map<String, Object> content = new HashMap<>();
        content.put("max_tag_length", (max_tag_length));
        requestPut(url, null, content, Void.class);
    }
}
