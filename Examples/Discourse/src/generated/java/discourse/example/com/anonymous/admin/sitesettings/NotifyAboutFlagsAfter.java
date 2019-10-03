package discourse.example.com.anonymous.admin.sitesettings;

import java.util.HashMap;
import java.util.Map;
import discourse.example.com.Anonymous;
import fr.lelouet.jswaggermaker.client.common.impl.DelegateTransfer;

public class NotifyAboutFlagsAfter
    extends DelegateTransfer<Anonymous>
{

    public NotifyAboutFlagsAfter(Anonymous delegate) {
        super(delegate);
    }

    /**
     * 
     * <p>
     * notify about flags after
     * </p>
     * 
     * @param notify_about_flags_after
     *     "If there are flags that haven't been handled after this many hours, send an email to the contact_email. Set to 0 to disable."
     *     
     */
    public void put(long notify_about_flags_after) {
        String url = ("https://discourse.example.com//admin/site_settings/notify_about_flags_after");
        Map<String, Object> content = new HashMap<>();
        content.put("notify_about_flags_after", (notify_about_flags_after));
        requestPut(url, null, content, Void.class);
    }
}
