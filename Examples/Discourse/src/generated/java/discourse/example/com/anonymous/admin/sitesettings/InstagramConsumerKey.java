package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class InstagramConsumerKey
    extends DelegateTransfer<Anonymous>
{

    public InstagramConsumerKey(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * instagram consumer key
     * </p>
     * 
     * @param instagram_consumer_key
     */
    public void put(String instagram_consumer_key) {
        String url = ("https://discourse.example.com//admin/site_settings/instagram_consumer_key");
        Map<String, Object> content = new HashMap<>();
        content.put("instagram_consumer_key", (instagram_consumer_key));
        requestPut(url, null, content, Void.class);
    }
}
