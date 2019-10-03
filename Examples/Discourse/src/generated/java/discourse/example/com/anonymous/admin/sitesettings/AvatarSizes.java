package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AvatarSizes
    extends DelegateTransfer<Anonymous>
{

    public AvatarSizes(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * avatar sizes
     * </p>
     * 
     * @param avatar_sizes
     *     "List of automatically generated avatar sizes."
     *     
     */
    public void put(String avatar_sizes) {
        String url = ("https://discourse.example.com//admin/site_settings/avatar_sizes");
        Map<String, Object> content = new HashMap<>();
        content.put("avatar_sizes", (avatar_sizes));
        requestPut(url, null, content, Void.class);
    }
}
