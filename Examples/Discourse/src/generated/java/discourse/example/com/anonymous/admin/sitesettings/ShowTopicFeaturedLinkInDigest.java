package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ShowTopicFeaturedLinkInDigest
    extends DelegateTransfer<Anonymous>
{

    public ShowTopicFeaturedLinkInDigest(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * show topic featured link in digest
     * </p>
     * 
     * @param show_topic_featured_link_in_digest
     */
    public void put(boolean show_topic_featured_link_in_digest) {
        String url = ("https://discourse.example.com//admin/site_settings/show_topic_featured_link_in_digest");
        Map<String, Object> content = new HashMap<>();
        content.put("show_topic_featured_link_in_digest", (show_topic_featured_link_in_digest));
        requestPut(url, null, content, Void.class);
    }
}
