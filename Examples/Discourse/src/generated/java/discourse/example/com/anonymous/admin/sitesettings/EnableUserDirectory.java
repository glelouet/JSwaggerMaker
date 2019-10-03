package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class EnableUserDirectory
    extends DelegateTransfer<Anonymous>
{

    public EnableUserDirectory(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * enable user directory
     * </p>
     * 
     * @param enable_user_directory
     */
    public void put(boolean enable_user_directory) {
        String url = ("https://discourse.example.com//admin/site_settings/enable_user_directory");
        Map<String, Object> content = new HashMap<>();
        content.put("enable_user_directory", (enable_user_directory));
        requestPut(url, null, content, Void.class);
    }
}
