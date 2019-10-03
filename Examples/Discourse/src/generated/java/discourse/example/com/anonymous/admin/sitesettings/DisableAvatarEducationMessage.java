package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DisableAvatarEducationMessage
    extends DelegateTransfer<Anonymous>
{

    public DisableAvatarEducationMessage(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * disable avatar education message
     * </p>
     * 
     * @param disable_avatar_education_message
     *     "Disable education message for changing avatar."
     *     
     */
    public void put(boolean disable_avatar_education_message) {
        String url = ("https://discourse.example.com//admin/site_settings/disable_avatar_education_message");
        Map<String, Object> content = new HashMap<>();
        content.put("disable_avatar_education_message", (disable_avatar_education_message));
        requestPut(url, null, content, Void.class);
    }
}
