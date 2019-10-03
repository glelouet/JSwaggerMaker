package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class AutomaticallyDownloadGravatars
    extends DelegateTransfer<Anonymous>
{

    public AutomaticallyDownloadGravatars(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * automatically download gravatars
     * </p>
     * 
     * @param automatically_download_gravatars
     *     "Download Gravatars for users upon account creation or email change."
     *     
     */
    public void put(boolean automatically_download_gravatars) {
        String url = ("https://discourse.example.com//admin/site_settings/automatically_download_gravatars");
        Map<String, Object> content = new HashMap<>();
        content.put("automatically_download_gravatars", (automatically_download_gravatars));
        requestPut(url, null, content, Void.class);
    }
}
