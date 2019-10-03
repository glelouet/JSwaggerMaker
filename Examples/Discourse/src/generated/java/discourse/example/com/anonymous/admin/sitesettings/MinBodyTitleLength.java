package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinBodyTitleLength
    extends DelegateTransfer<Anonymous>
{

    public MinBodyTitleLength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * min body title length
     * </p>
     * 
     * @param min_body_title_length
     */
    public void put(long min_body_title_length) {
        String url = ("https://discourse.example.com//admin/site_settings/min_body_title_length");
        Map<String, Object> content = new HashMap<>();
        content.put("min_body_title_length", (min_body_title_length));
        requestPut(url, null, content, Void.class);
    }
}
