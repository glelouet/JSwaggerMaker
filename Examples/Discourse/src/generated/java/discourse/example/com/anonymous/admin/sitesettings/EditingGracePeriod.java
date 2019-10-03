package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EditingGracePeriod
    extends DelegateTransfer<Anonymous>
{

    public EditingGracePeriod(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * editing grace period
     * </p>
     * 
     * @param editing_grace_period
     */
    public void put(long editing_grace_period) {
        String url = ("https://discourse.example.com//admin/site_settings/editing_grace_period");
        Map<String, Object> content = new HashMap<>();
        content.put("editing_grace_period", (editing_grace_period));
        requestPut(url, null, content, Void.class);
    }
}
