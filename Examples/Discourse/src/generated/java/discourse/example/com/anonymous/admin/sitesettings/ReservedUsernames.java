package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class ReservedUsernames
    extends DelegateTransfer<Anonymous>
{

    public ReservedUsernames(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * reserved usernames
     * </p>
     * 
     * @param reserved_usernames
     *     pipe delimited
     *     
     */
    public void put(String reserved_usernames) {
        String url = ("https://discourse.example.com//admin/site_settings/reserved_usernames");
        Map<String, Object> content = new HashMap<>();
        content.put("reserved_usernames", (reserved_usernames));
        requestPut(url, null, content, Void.class);
    }
}
