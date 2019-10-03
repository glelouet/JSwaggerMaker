package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowIndexInRobotsTxt
    extends DelegateTransfer<Anonymous>
{

    public AllowIndexInRobotsTxt(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * allow index in robots txt
     * </p>
     * 
     * @param allow_index_in_robots_txt
     *     "Specify in robots.txt that this site is allowed to be indexed by web search engines."
     *     
     */
    public void put(boolean allow_index_in_robots_txt) {
        String url = ("https://discourse.example.com//admin/site_settings/allow_index_in_robots_txt");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_index_in_robots_txt", (allow_index_in_robots_txt));
        requestPut(url, null, content, Void.class);
    }
}
