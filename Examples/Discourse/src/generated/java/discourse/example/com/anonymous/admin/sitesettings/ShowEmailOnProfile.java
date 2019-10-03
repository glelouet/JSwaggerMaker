package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ShowEmailOnProfile
    extends DelegateTransfer<Anonymous>
{

    public ShowEmailOnProfile(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * show email on profile
     * </p>
     * 
     * @param show_email_on_profile
     */
    public void put(boolean show_email_on_profile) {
        String url = ("https://discourse.example.com//admin/site_settings/show_email_on_profile");
        Map<String, Object> content = new HashMap<>();
        content.put("show_email_on_profile", (show_email_on_profile));
        requestPut(url, null, content, Void.class);
    }
}
