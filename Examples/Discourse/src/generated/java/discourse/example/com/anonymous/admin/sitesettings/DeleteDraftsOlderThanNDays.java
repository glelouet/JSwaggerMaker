package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DeleteDraftsOlderThanNDays
    extends DelegateTransfer<Anonymous>
{

    public DeleteDraftsOlderThanNDays(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * delete drafts older than n days
     * </p>
     * 
     * @param delete_drafts_older_than_n_days
     *     "Delete drafts older than (n) days."
     *     
     */
    public void put(long delete_drafts_older_than_n_days) {
        String url = ("https://discourse.example.com//admin/site_settings/delete_drafts_older_than_n_days");
        Map<String, Object> content = new HashMap<>();
        content.put("delete_drafts_older_than_n_days", (delete_drafts_older_than_n_days));
        requestPut(url, null, content, Void.class);
    }
}
