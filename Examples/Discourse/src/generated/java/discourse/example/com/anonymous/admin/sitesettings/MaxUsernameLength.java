package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaxUsernameLength
    extends DelegateTransfer<Anonymous>
{

    public MaxUsernameLength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * max username length
     * </p>
     * 
     * @param max_username_length
     */
    public void put(long max_username_length) {
        String url = ("https://discourse.example.com//admin/site_settings/max_username_length");
        Map<String, Object> content = new HashMap<>();
        content.put("max_username_length", (max_username_length));
        requestPut(url, null, content, Void.class);
    }
}
