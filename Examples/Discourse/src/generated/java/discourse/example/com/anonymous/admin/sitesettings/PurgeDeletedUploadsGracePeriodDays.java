package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PurgeDeletedUploadsGracePeriodDays
    extends DelegateTransfer<Anonymous>
{

    public PurgeDeletedUploadsGracePeriodDays(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * purge deleted uploads grace period days
     * </p>
     * 
     * @param purge_deleted_uploads_grace_period_days
     *     "Grace period (in days) before a deleted upload is erased."
     *     
     */
    public void put(long purge_deleted_uploads_grace_period_days) {
        String url = ("https://discourse.example.com//admin/site_settings/purge_deleted_uploads_grace_period_days");
        Map<String, Object> content = new HashMap<>();
        content.put("purge_deleted_uploads_grace_period_days", (purge_deleted_uploads_grace_period_days));
        requestPut(url, null, content, Void.class);
    }
}
