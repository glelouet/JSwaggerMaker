package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinSearchTermLength
    extends DelegateTransfer<Anonymous>
{

    public MinSearchTermLength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * min search term length
     * </p>
     * 
     * @param min_search_term_length
     *     "Minimum valid search term length in characters"
     *     
     */
    public void put(long min_search_term_length) {
        String url = ("https://discourse.example.com//admin/site_settings/min_search_term_length");
        Map<String, Object> content = new HashMap<>();
        content.put("min_search_term_length", (min_search_term_length));
        requestPut(url, null, content, Void.class);
    }
}
