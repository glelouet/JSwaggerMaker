package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultOtherAutoTrackTopicAfterMsecs
    extends DelegateTransfer<Anonymous>
{

    public DefaultOtherAutoTrackTopicAfterMsecs(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default other auto track topics after msecs"
     * </p>
     * 
     * @param default_other_auto_track_topic_after_msecs
     *     "Global default time before a topic is automatically tracked."
     *     
     */
    public void put(long default_other_auto_track_topic_after_msecs) {
        String url = ("https://discourse.example.com//admin/site_settings/default_other_auto_track_topic_after_msecs");
        Map<String, Object> content = new HashMap<>();
        content.put("default_other_auto_track_topic_after_msecs", (default_other_auto_track_topic_after_msecs));
        requestPut(url, null, content, Void.class);
    }
}
