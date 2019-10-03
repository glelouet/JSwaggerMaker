package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowAnimatedAvatars
    extends DelegateTransfer<Anonymous>
{

    public AllowAnimatedAvatars(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * allow animated avatars
     * </p>
     * 
     * @param allow_animated_avatars
     *     "Allow users to use animated gif profile pictures. WARNING: run the avatars:refresh rake task after changing this setting."
     *     
     */
    public void put(boolean allow_animated_avatars) {
        String url = ("https://discourse.example.com//admin/site_settings/allow_animated_avatars");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_animated_avatars", (allow_animated_avatars));
        requestPut(url, null, content, Void.class);
    }
}
