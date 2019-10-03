package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PermalinkNormalizations
    extends DelegateTransfer<Anonymous>
{

    public PermalinkNormalizations(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * permalink normalizations
     * </p>
     * 
     * @param permalink_normalizations
     *     "Apply the following regex before matching permalinks, for example: /(topic.*)\?.*<!---->/\1 will strip query strings from topic routes. Format is regex+string use \1 etc. to access captures"
     *     
     */
    public void put(String permalink_normalizations) {
        String url = ("https://discourse.example.com//admin/site_settings/permalink_normalizations");
        Map<String, Object> content = new HashMap<>();
        content.put("permalink_normalizations", (permalink_normalizations));
        requestPut(url, null, content, Void.class);
    }
}
