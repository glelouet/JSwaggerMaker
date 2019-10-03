package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableEscapedFragments
    extends DelegateTransfer<Anonymous>
{

    public EnableEscapedFragments(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable escaped fragments
     * </p>
     * 
     * @param enable_escaped_fragments
     *     "Fall back to Google's Ajax-Crawling API if no webcrawler is detected. See https://developers.google.com/webmasters/ajax-crawling/docs/learn-more"
     *     
     */
    public void put(boolean enable_escaped_fragments) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_escaped_fragments");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_escaped_fragments", (enable_escaped_fragments));
        requestPut(url, null, content, Void.class);
    }
}
