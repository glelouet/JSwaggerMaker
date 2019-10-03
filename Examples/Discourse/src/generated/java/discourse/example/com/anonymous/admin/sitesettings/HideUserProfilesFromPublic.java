package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class HideUserProfilesFromPublic
    extends DelegateTransfer<Anonymous>
{

    public HideUserProfilesFromPublic(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * hide user profiles from public
     * </p>
     * 
     * @param hide_user_profiles_from_public
     */
    public void put(boolean hide_user_profiles_from_public) {
        String url = ("https://discourse.example.com//admin/site_settings/hide_user_profiles_from_public");
        Map<String, Object> content = new HashMap<>();
        content.put("hide_user_profiles_from_public", (hide_user_profiles_from_public));
        requestPut(url, null, content, Void.class);
    }
}
