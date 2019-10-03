package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class FacebookRequestExtraProfileDetails
    extends DelegateTransfer<Anonymous>
{

    public FacebookRequestExtraProfileDetails(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * facebook request extra profile details
     * </p>
     * 
     * @param facebook_request_extra_profile_details
     */
    public void put(boolean facebook_request_extra_profile_details) {
        String url = ("https://discourse.example.com//admin/site_settings/facebook_request_extra_profile_details");
        Map<String, Object> content = new HashMap<>();
        content.put("facebook_request_extra_profile_details", (facebook_request_extra_profile_details));
        requestPut(url, null, content, Void.class);
    }
}
