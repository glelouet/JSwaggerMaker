package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DefaultIncludeTl0InDigests
    extends DelegateTransfer<Anonymous>
{

    public DefaultIncludeTl0InDigests(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * "default include tl0 in digests"
     * </p>
     * 
     * @param default_include_tl0_in_digests
     *     "Include posts from new users in summary emails by default. Users can change this in their preferences."
     *     
     */
    public void put(boolean default_include_tl0_in_digests) {
        String url = ("https://discourse.example.com//admin/site_settings/default_include_tl0_in_digests");
        Map<String, Object> content = new HashMap<>();
        content.put("default_include_tl0_in_digests", (default_include_tl0_in_digests));
        requestPut(url, null, content, Void.class);
    }
}
