package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AuthorizedExtensions
    extends DelegateTransfer<Anonymous>
{

    public AuthorizedExtensions(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * authorized extensions
     * </p>
     * 
     * @param authorized_extensions
     *     A pipe delimited list of file extensions allowed for upload (use "*" to enable all file types)
     */
    public void put(String authorized_extensions) {
        String url = ("https://discourse.example.com//admin/site_settings/authorized_extensions");
        Map<String, Object> content = new HashMap<>();
        content.put("authorized_extensions", (authorized_extensions));
        requestPut(url, null, content, Void.class);
    }
}
