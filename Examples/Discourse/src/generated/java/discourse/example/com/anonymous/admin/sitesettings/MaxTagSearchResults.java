package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxTagSearchResults
    extends DelegateTransfer<Anonymous>
{

    public MaxTagSearchResults(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "max_tag_search_results"
     * </p>
     * 
     * @param max_tag_search_results
     *     "When searching for tags, the maximum number of results to show."
     *     
     */
    public void put(long max_tag_search_results) {
        String url = ("https://discourse.example.com//admin/site_settings/max_tag_search_results");
        Map<String, Object> content = new HashMap<>();
        content.put("max_tag_search_results", (max_tag_search_results));
        requestPut(url, null, content, Void.class);
    }
}
