package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class FagUrl
    extends DelegateTransfer<Anonymous>
{

    public FagUrl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * faq url
     * </p>
     * 
     * @param faq_url
     *     "If you have a FAQ hosted elsewhere that you want to use, provide the full URL here."
     *     
     */
    public void put(String faq_url) {
        String url = ("https://discourse.example.com//admin/site_settings/fag_url");
        Map<String, Object> content = new HashMap<>();
        content.put("faq_url", (faq_url));
        requestPut(url, null, content, Void.class);
    }
}
