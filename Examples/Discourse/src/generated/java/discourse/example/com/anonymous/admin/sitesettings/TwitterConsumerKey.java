package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TwitterConsumerKey
    extends DelegateTransfer<Anonymous>
{

    public TwitterConsumerKey(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * twitter consumer key
     * </p>
     * 
     * @param twitter_consumer_key
     */
    public void put(String twitter_consumer_key) {
        String url = ("https://discourse.example.com//admin/site_settings/twitter_consumer_key");
        Map<String, Object> content = new HashMap<>();
        content.put("twitter_consumer_key", (twitter_consumer_key));
        requestPut(url, null, content, Void.class);
    }
}
