package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TwitterSummaryLargeImageUrl
    extends DelegateTransfer<Anonymous>
{

    public TwitterSummaryLargeImageUrl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update the twitter summary large image url
     * </p>
     * 
     * @param twitter_summary_large_image_url
     */
    public void put(String twitter_summary_large_image_url) {
        String url = ("https://discourse.example.com//admin/site_settings/twitter_summary_large_image_url");
        Map<String, Object> content = new HashMap<>();
        content.put("twitter_summary_large_image_url", (twitter_summary_large_image_url));
        requestPut(url, null, content, Void.class);
    }
}
