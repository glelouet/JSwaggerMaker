package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class FullNameRequired
    extends DelegateTransfer<Anonymous>
{

    public FullNameRequired(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * full name required
     * </p>
     * 
     * @param full_name_required
     */
    public void put(boolean full_name_required) {
        String url = ("https://discourse.example.com//admin/site_settings/full_name_required");
        Map<String, Object> content = new HashMap<>();
        content.put("full_name_required", (full_name_required));
        requestPut(url, null, content, Void.class);
    }
}
