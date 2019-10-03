package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class Port
    extends DelegateTransfer<Anonymous>
{

    public Port(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * port
     * </p>
     * 
     * @param port
     *     "DEVELOPER ONLY! WARNING! Use this HTTP port rather than the default of port 80. Leave blank for default of 80."
     *     
     */
    public void put(long port) {
        String url = ("https://discourse.example.com//admin/site_settings/port");
        Map<String, Object> content = new HashMap<>();
        content.put("port", (port));
        requestPut(url, null, content, Void.class);
    }
}
