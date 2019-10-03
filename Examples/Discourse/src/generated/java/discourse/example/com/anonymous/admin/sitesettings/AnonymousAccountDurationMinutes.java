package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AnonymousAccountDurationMinutes
    extends DelegateTransfer<Anonymous>
{

    public AnonymousAccountDurationMinutes(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * anonymous account duration minutes
     * </p>
     * 
     * @param anonymous_account_duration_minutes
     */
    public void put(long anonymous_account_duration_minutes) {
        String url = ("https://discourse.example.com//admin/site_settings/anonymous_account_duration_minutes");
        Map<String, Object> content = new HashMap<>();
        content.put("anonymous_account_duration_minutes", (anonymous_account_duration_minutes));
        requestPut(url, null, content, Void.class);
    }
}
