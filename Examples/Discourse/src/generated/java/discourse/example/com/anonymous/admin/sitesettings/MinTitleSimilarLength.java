package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinTitleSimilarLength
    extends DelegateTransfer<Anonymous>
{

    public MinTitleSimilarLength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * min_title_similar_length
     * </p>
     * 
     * @param min_title_similar_length
     */
    public void put(long min_title_similar_length) {
        String url = ("https://discourse.example.com//admin/site_settings/min_title_similar_length");
        Map<String, Object> content = new HashMap<>();
        content.put("min_title_similar_length", (min_title_similar_length));
        requestPut(url, null, content, Void.class);
    }
}
