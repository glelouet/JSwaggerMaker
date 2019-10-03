package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class DisableEditNotifications
    extends DelegateTransfer<Anonymous>
{

    public DisableEditNotifications(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * disable edit notifications
     * </p>
     * 
     * @param disable_edit_notifications
     *     "Disables edit notifications by the system user when 'download_remote_images_to_local' is active."
     *     
     */
    public void put(boolean disable_edit_notifications) {
        String url = ("https://discourse.example.com//admin/site_settings/disable_edit_notifications");
        Map<String, Object> content = new HashMap<>();
        content.put("disable_edit_notifications", (disable_edit_notifications));
        requestPut(url, null, content, Void.class);
    }
}
