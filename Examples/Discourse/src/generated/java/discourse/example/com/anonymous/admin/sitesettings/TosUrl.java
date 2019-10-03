package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TosUrl
    extends DelegateTransfer<Anonymous>
{

    public TosUrl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * tos url
     * </p>
     * 
     * @param tos_url
     *     "If you have a Terms of Service document hosted elsewhere that you want to use, provide the full URL here."
     *     
     */
    public void put(String tos_url) {
        String url = ("https://discourse.example.com//admin/site_settings/tos_url");
        Map<String, Object> content = new HashMap<>();
        content.put("tos_url", (tos_url));
        requestPut(url, null, content, Void.class);
    }
}
