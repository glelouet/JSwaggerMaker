package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class CleanOrphanUploadsGracePeriodHours
    extends DelegateTransfer<Anonymous>
{

    public CleanOrphanUploadsGracePeriodHours(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * clean orphan uploads grace period hours
     * </p>
     * 
     * @param clean_orphan_uploads_grace_period_hours
     *     "Grace period (in hours) before an orphan upload is removed."
     *     
     */
    public void put(long clean_orphan_uploads_grace_period_hours) {
        String url = ("https://discourse.example.com//admin/site_settings/clean_orphan_uploads_grace_period_hours");
        Map<String, Object> content = new HashMap<>();
        content.put("clean_orphan_uploads_grace_period_hours", (clean_orphan_uploads_grace_period_hours));
        requestPut(url, null, content, Void.class);
    }
}
