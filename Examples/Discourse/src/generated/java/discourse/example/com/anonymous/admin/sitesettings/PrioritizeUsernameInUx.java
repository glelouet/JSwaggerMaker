package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PrioritizeUsernameInUx
    extends DelegateTransfer<Anonymous>
{

    public PrioritizeUsernameInUx(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * prioritize username in ux
     * </p>
     * 
     * @param prioritize_username_in_ux
     */
    public void put(boolean prioritize_username_in_ux) {
        String url = ("https://discourse.example.com//admin/site_settings/prioritize_username_in_ux");
        Map<String, Object> content = new HashMap<>();
        content.put("prioritize_username_in_ux", (prioritize_username_in_ux));
        requestPut(url, null, content, Void.class);
    }
}
