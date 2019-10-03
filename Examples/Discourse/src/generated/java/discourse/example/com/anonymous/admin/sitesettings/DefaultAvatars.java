package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultAvatars
    extends DelegateTransfer<Anonymous>
{

    public DefaultAvatars(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * default avatars
     * </p>
     * 
     * @param default_avatars
     *     "URLs to avatars that will be used by default for new users until they change them."
     *     
     */
    public void put(String default_avatars) {
        String url = ("https://discourse.example.com//admin/site_settings/default_avatars");
        Map<String, Object> content = new HashMap<>();
        content.put("default_avatars", (default_avatars));
        requestPut(url, null, content, Void.class);
    }
}
