package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TitleMinEntropy
    extends DelegateTransfer<Anonymous>
{

    public TitleMinEntropy(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * title min entropy
     * </p>
     * 
     * @param title_min_entropy
     */
    public void put(long title_min_entropy) {
        String url = ("https://discourse.example.com//admin/site_settings/title_min_entropy");
        Map<String, Object> content = new HashMap<>();
        content.put("title_min_entropy", (title_min_entropy));
        requestPut(url, null, content, Void.class);
    }
}
