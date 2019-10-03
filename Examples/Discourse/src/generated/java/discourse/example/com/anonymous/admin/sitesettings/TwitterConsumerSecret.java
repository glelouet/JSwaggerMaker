package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TwitterConsumerSecret
    extends DelegateTransfer<Anonymous>
{

    public TwitterConsumerSecret(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * twitter consumer secret
     * </p>
     * 
     * @param twitter_consumer_secret
     */
    public void put(String twitter_consumer_secret) {
        String url = ("https://discourse.example.com//admin/site_settings/twitter_consumer_secret");
        Map<String, Object> content = new HashMap<>();
        content.put("twitter_consumer_secret", (twitter_consumer_secret));
        requestPut(url, null, content, Void.class);
    }
}
