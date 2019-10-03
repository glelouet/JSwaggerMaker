package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ShortProgressTextThreshold
    extends DelegateTransfer<Anonymous>
{

    public ShortProgressTextThreshold(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * short progress text threshold
     * </p>
     * 
     * @param short_progress_text_threshold
     */
    public void put(long short_progress_text_threshold) {
        String url = ("https://discourse.example.com//admin/site_settings/short_progress_text_threshold");
        Map<String, Object> content = new HashMap<>();
        content.put("short_progress_text_threshold", (short_progress_text_threshold));
        requestPut(url, null, content, Void.class);
    }
}
