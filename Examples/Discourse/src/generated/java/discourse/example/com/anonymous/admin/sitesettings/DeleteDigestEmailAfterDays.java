package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DeleteDigestEmailAfterDays
    extends DelegateTransfer<Anonymous>
{

    public DeleteDigestEmailAfterDays(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * delete digest email after days
     * </p>
     * 
     * @param delete_digest_email_after_days
     */
    public void put(long delete_digest_email_after_days) {
        String url = ("https://discourse.example.com//admin/site_settings/delete_digest_email_after_days");
        Map<String, Object> content = new HashMap<>();
        content.put("delete_digest_email_after_days", (delete_digest_email_after_days));
        requestPut(url, null, content, Void.class);
    }
}
