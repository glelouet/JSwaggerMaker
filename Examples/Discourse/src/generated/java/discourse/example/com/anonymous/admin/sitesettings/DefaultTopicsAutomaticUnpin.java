package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultTopicsAutomaticUnpin
    extends DelegateTransfer<Anonymous>
{

    public DefaultTopicsAutomaticUnpin(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default topics automatic unpin"
     * </p>
     * 
     * @param default_topics_automatic_unpin
     *     "Automatically unpin topics when the user reaches the bottom by default."
     *     
     */
    public void put(boolean default_topics_automatic_unpin) {
        String url = ("https://discourse.example.com//admin/site_settings/default_topics_automatic_unpin");
        Map<String, Object> content = new HashMap<>();
        content.put("default_topics_automatic_unpin", (default_topics_automatic_unpin));
        requestPut(url, null, content, Void.class);
    }
}
