package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class SsoNotApprovedUrl
    extends DelegateTransfer<Anonymous>
{

    public SsoNotApprovedUrl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * sso not approved url
     * </p>
     * 
     * @param sso_not_approved_url
     */
    public void put(String sso_not_approved_url) {
        String url = ("https://discourse.example.com//admin/site_settings/sso_not_approved_url");
        Map<String, Object> content = new HashMap<>();
        content.put("sso_not_approved_url", (sso_not_approved_url));
        requestPut(url, null, content, Void.class);
    }
}
