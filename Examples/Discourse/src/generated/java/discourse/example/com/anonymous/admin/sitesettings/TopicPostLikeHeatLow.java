package discourse.example.com.anonymous.admin.sitesettings;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TopicPostLikeHeatLow
    extends DelegateTransfer<Anonymous>
{

    public TopicPostLikeHeatLow(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * topic post like heat low
     * </p>
     */
    public void put() {
        String url = ("https://discourse.example.com//admin/site_settings/topic_post_like_heat_low");
        requestPut(url, null, null, Void.class);
    }
}
