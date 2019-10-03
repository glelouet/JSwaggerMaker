package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MinPasswordLength
    extends DelegateTransfer<Anonymous>
{

    public MinPasswordLength(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * min password length
     * </p>
     * 
     * @param min_password_length
     */
    public void put(long min_password_length) {
        String url = ("https://discourse.example.com//admin/site_settings/min_password_length");
        Map<String, Object> content = new HashMap<>();
        content.put("min_password_length", (min_password_length));
        requestPut(url, null, content, Void.class);
    }
}
