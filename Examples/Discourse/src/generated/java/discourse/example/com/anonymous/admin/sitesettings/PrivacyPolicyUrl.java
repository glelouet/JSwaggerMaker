package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class PrivacyPolicyUrl
    extends DelegateTransfer<Anonymous>
{

    public PrivacyPolicyUrl(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * privacy policy url
     * </p>
     * 
     * @param privacy_policy_url
     *     "If you have a Privacy Policy document hosted elsewhere that you want to use, provide the full URL here."
     *     
     */
    public void put(String privacy_policy_url) {
        String url = ("https://discourse.example.com//admin/site_settings/privacy_policy_url");
        Map<String, Object> content = new HashMap<>();
        content.put("privacy_policy_url", (privacy_policy_url));
        requestPut(url, null, content, Void.class);
    }
}
