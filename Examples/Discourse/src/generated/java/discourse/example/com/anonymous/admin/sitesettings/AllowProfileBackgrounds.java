package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AllowProfileBackgrounds
    extends DelegateTransfer<Anonymous>
{

    public AllowProfileBackgrounds(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * allow profile backgrounds
     * </p>
     * 
     * @param allow_profile_backgrounds
     *     "Allow users to upload profile backgrounds."
     *     
     */
    public void put(boolean allow_profile_backgrounds) {
        String url = ("https://discourse.example.com//admin/site_settings/allow_profile_backgrounds");
        Map<String, Object> content = new HashMap<>();
        content.put("allow_profile_backgrounds", (allow_profile_backgrounds));
        requestPut(url, null, content, Void.class);
    }
}
