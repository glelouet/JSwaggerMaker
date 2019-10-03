package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class MaximumSessionAge
    extends DelegateTransfer<Anonymous>
{

    public MaximumSessionAge(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * maximum session age
     * </p>
     * 
     * @param maximum_session_age
     */
    public void put(long maximum_session_age) {
        String url = ("https://discourse.example.com//admin/site_settings/maximum_session_age");
        Map<String, Object> content = new HashMap<>();
        content.put("maximum_session_age", (maximum_session_age));
        requestPut(url, null, content, Void.class);
    }
}
