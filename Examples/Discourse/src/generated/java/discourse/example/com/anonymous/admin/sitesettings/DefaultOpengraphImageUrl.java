package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultOpengraphImageUrl
    extends DelegateTransfer<Anonymous>
{

    public DefaultOpengraphImageUrl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the default opengraph image url
     * </p>
     * 
     * @param default_opengraph_image_url
     */
    public void put(String default_opengraph_image_url) {
        String url = ("https://discourse.example.com//admin/site_settings/default_opengraph_image_url");
        Map<String, Object> content = new HashMap<>();
        content.put("default_opengraph_image_url", (default_opengraph_image_url));
        requestPut(url, null, content, Void.class);
    }
}
