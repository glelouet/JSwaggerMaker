package discourse.example.com.anonymous.admin.sitesettings;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TopicPostLikeHeatHigh
    extends DelegateTransfer<Anonymous>
{

    public TopicPostLikeHeatHigh(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * topic post like heat high
     * </p>
     */
    public void put() {
        String url = ("https://discourse.example.com//admin/site_settings/topic_post_like_heat_high");
        requestPut(url, null, null, Void.class);
    }
}
