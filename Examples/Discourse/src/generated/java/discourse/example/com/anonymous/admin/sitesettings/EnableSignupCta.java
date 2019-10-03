package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableSignupCta
    extends DelegateTransfer<Anonymous>
{

    public EnableSignupCta(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * Update enable signup cta
     * </p>
     * 
     * @param enable_signup_cta
     */
    public void put(boolean enable_signup_cta) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_signup_cta");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_signup_cta", (enable_signup_cta));
        requestPut(url, null, content, Void.class);
    }
}
