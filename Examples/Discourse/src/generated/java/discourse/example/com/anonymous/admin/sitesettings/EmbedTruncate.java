package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EmbedTruncate
    extends DelegateTransfer<Anonymous>
{

    public EmbedTruncate(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * embed truncate
     * </p>
     * 
     * @param embed_truncate
     */
    public void put(boolean embed_truncate) {
        String url = ("https://discourse.example.com//admin/site_settings/embed_truncate");
        Map<String, Object> content = new HashMap<>();
        content.put("embed_truncate", (embed_truncate));
        requestPut(url, null, content, Void.class);
    }
}
