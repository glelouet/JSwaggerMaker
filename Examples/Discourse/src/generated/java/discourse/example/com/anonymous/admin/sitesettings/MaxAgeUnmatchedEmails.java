package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxAgeUnmatchedEmails
    extends DelegateTransfer<Anonymous>
{

    public MaxAgeUnmatchedEmails(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max age unmatched emails
     * </p>
     * 
     * @param max_age_unmatched_emails
     *     "Delete unmatched screened email entries after (N) days."
     *     
     */
    public void put(long max_age_unmatched_emails) {
        String url = ("https://discourse.example.com//admin/site_settings/max_age_unmatched_emails");
        Map<String, Object> content = new HashMap<>();
        content.put("max_age_unmatched_emails", (max_age_unmatched_emails));
        requestPut(url, null, content, Void.class);
    }
}
