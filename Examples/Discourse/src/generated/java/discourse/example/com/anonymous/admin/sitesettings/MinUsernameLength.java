package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinUsernameLength
    extends DelegateTransfer<Anonymous>
{

    public MinUsernameLength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * min username length
     * </p>
     * 
     * @param min_username_length
     */
    public void put(long min_username_length) {
        String url = ("https://discourse.example.com//admin/site_settings/min_username_length");
        Map<String, Object> content = new HashMap<>();
        content.put("min_username_length", (min_username_length));
        requestPut(url, null, content, Void.class);
    }
}
