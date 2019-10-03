package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxSimilarResults
    extends DelegateTransfer<Anonymous>
{

    public MaxSimilarResults(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max similar results
     * </p>
     * 
     * @param max_similar_results
     *     "How many similar topics to show above the editor when composing a new topic. Comparison is based on title and body."
     *     
     */
    public void put(long max_similar_results) {
        String url = ("https://discourse.example.com//admin/site_settings/max_similar_results");
        Map<String, Object> content = new HashMap<>();
        content.put("max_similar_results", (max_similar_results));
        requestPut(url, null, content, Void.class);
    }
}
