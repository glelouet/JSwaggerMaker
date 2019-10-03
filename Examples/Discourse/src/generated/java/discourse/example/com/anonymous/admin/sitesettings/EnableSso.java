package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableSso
    extends DelegateTransfer<Anonymous>
{

    public EnableSso(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable sso
     * </p>
     * 
     * @param enable_sso
     */
    public void put(boolean enable_sso) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_sso");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_sso", (enable_sso));
        requestPut(url, null, content, Void.class);
    }
}
