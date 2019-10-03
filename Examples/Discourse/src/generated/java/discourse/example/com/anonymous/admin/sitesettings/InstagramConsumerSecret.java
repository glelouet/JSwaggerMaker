package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class InstagramConsumerSecret
    extends DelegateTransfer<Anonymous>
{

    public InstagramConsumerSecret(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * instagram consumer secret
     * </p>
     * 
     * @param instagram_consumer_secret
     */
    public void put(String instagram_consumer_secret) {
        String url = ("https://discourse.example.com//admin/site_settings/instagram_consumer_secret");
        Map<String, Object> content = new HashMap<>();
        content.put("instagram_consumer_secret", (instagram_consumer_secret));
        requestPut(url, null, content, Void.class);
    }
}
