package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class TrackExternalRightClicks
    extends DelegateTransfer<Anonymous>
{

    public TrackExternalRightClicks(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update track external right clicks
     * </p>
     * 
     * @param track_external_right_clicks
     */
    public void put(boolean track_external_right_clicks) {
        String url = ("https://discourse.example.com//admin/site_settings/track_external_right_clicks");
        Map<String, Object> content = new HashMap<>();
        content.put("track_external_right_clicks", (track_external_right_clicks));
        requestPut(url, null, content, Void.class);
    }
}
