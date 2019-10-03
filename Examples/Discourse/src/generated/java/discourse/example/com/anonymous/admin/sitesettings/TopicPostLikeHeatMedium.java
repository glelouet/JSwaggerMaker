package discourse.example.com.anonymous.admin.sitesettings;

import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TopicPostLikeHeatMedium
    extends DelegateTransfer<Anonymous>
{

    public TopicPostLikeHeatMedium(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * topic post like heat medium
     * </p>
     */
    public void put() {
        String url = ("https://discourse.example.com//admin/site_settings/topic_post_like_heat_medium");
        requestPut(url, null, null, Void.class);
    }
}
